package src;

public class Int {
    private int privateInt;

    /**
     * Constructor to initialize the Int object with a specified integer value.
     * @param newInt the integer value to initialize the Int object with.
     */
    public Int(int newInt) {
        privateInt = newInt;
    }

    /**
     * Converts the private integer field to a public integer.
     * @return the value of the private integer field.
     */
    public int toInt() {
        return privateInt;
    }

    /**
     * Sets the value of privateInt to the specified newInt.
     * 
     * @param newInt the new value to set for privateInt
     */
    public void setInt(int newInt) {
        privateInt = newInt;
    }

    /**
     * Converts the private integer to its String representation.
     * This method returns the string form of the private integer.
     */
    public String toString(){
        return String.valueOf(privateInt);
    }

    /**
     * Swaps the integer value of the current object with the integer value of the specified object.
     * This method uses a temporary variable to facilitate the swap.
     */
    public void swapCurrObjValue(Int toSwap){
        int temp = toSwap.toInt();
        toSwap.setInt(this.toInt());
        this.setInt(temp);
    }

    /**
     * Swaps the elements at the specified positions in the given array.
     * This method modifies the original array.
     *
     * @param arr the array of Int objects
     * @param elem1 the index of the first element to be swapped
     * @param elem2 the index of the second element to be swapped
     */
    public static void swapArrayElem(Int[] arr, int elem1, int elem2){
        int temp = arr[elem1].toInt();
        arr[elem1].setInt(arr[elem2].toInt());
        arr[elem2].setInt(temp);
    }

    /**
     * Swaps the integer values of two Int objects.
     * This method uses a temporary variable to perform the swap.
     */
    public static void swapObjValue(Int obj1, Int obj2){
        int temp = obj1.toInt();
        obj1.setInt(obj2.toInt());
        obj2.setInt(temp);
    }

}
