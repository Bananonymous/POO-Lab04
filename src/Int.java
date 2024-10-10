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

}
