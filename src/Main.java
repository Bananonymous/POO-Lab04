package src;

public class Main {

    public static void swapArrayElem(Int[] arr, int elem1, int elem2){
        int temp = arr[elem1].toInt();
        arr[elem1].setInt(arr[elem2].toInt());
        arr[elem2].setInt(temp);
    }

    public static void swapObjValue(Int obj1, Int obj2){
        int temp = obj1.toInt();
        obj1.setInt(obj2.toInt());
        obj2.setInt(temp);
    }

    public static int stringToInt(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Le String ne peut pas être null ou vide");
        }

        int result = 0;
        boolean sign = s.charAt(0) == '-';

        for(int i = sign ? 1 : 0; i < s.length(); ++i){
            char currentChar = s.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                result = result * 10 + (currentChar - '0');
            } else {
                throw new IllegalArgumentException("Caractère non numérique trouvé : " + currentChar);
            }
        }

        return sign ? -result : result;

    }

    public static void bubbleSort(Int[] arr, int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j].toInt() > arr[j + 1].toInt()) {

                    // Swap arr[j] and arr[j+1] using different methods

//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;

//                    swapArrayElem(arr, j, j+1);

//                    swapObjValue(arr[j], arr[j+1]);

                    arr[j].swapCurrObjValue(arr[j+1]);

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }


    public static void main(String[] args) {
        int nbArgs = args.length;
        Int[] values;
        values = new Int[nbArgs];

        for(int i = 0; i < nbArgs; ++i){
            values[i] = new Int(stringToInt(args[i]));
            System.out.println(values[i].toString());
        }

        System.out.println();
        bubbleSort(values, values.length);

        for(int i = 0; i < nbArgs; ++i){
            System.out.println(values[i]);
        }


    }
}
