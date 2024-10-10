package src;

public class Main {


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

    public static void bubbleSort(int[] arr, int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }


    public static void main(String[] args) {
        //Getting args
        int nbArgs = args.length;
        int[] values;
        values = new int[nbArgs];

        for(int i = 0; i < nbArgs; ++i){
            values[i] = stringToInt(args[i]);
            System.out.println(values[i]);
        }

        System.out.println();
        bubbleSort(values, values.length);

        for(int i = 0; i < nbArgs; ++i){
            System.out.println(values[i]);
        }

    }
}
