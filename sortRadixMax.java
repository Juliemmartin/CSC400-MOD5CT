

public class sortRadixMax {
    //Finds maximum value in arrayMain
    public static int findMaxInt(int[] arrayMain) {

        int maxInt = arrayMain[0];

        for (int intVal : arrayMain) {

            if (intVal > maxInt) {

                maxInt = intVal;
            }
        }
        return maxInt;
    }

//Sorts arrayMain    
public static void digitPlaceSort(int[] arrayMain, int div) {

        int n = arrayMain.length;

        int[] outputArr = new int[n];
        int[] countArr = new int[10];

        //Count occurencces of each digit
        for (int i = 0; i < n; i++) {

            int sortDig = (arrayMain[i] / div) % 10 ;
            countArr[sortDig]++;
        }
        //Determine positions
        for (int i = 1; i < 10; i++) {
            countArr[i] += countArr[i - 1];
        }
        //Build outputArr in reverse
        for (int i = n - 1; i >= 0; i--) {

            int sortDig = (arrayMain[i] / div) % 10 ;
            outputArr[countArr[sortDig] - 1] = arrayMain[i];
            countArr[sortDig]--;
        }
        //Copy sorted elements over to arrayMain
        System.arraycopy(outputArr, 0, arrayMain, 0, n);
    }

    //Main radix sort method processing digit places
    public static void radixSortMain(int[] arrayMain) {

        int maxInt = findMaxInt(arrayMain);

        for (int div = 1; maxInt / div > 0; div *= 10)   {
            digitPlaceSort(arrayMain, div);
        }
    }}

