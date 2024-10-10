package src;

public class Int {
    private int privateInt;

    public Int(int newInt) {
        privateInt = newInt;
    }

    public int toInt() {
        return privateInt;
    }

    public void setInt(int newInt) {
        privateInt = newInt;
    }

    public String toString(){
        return String.valueOf(privateInt);
    }

    public void swapCurrObjValue(Int toSwap){
        int temp = toSwap.toInt();
        toSwap.setInt(this.toInt());
        this.setInt(temp);
    }

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

}
