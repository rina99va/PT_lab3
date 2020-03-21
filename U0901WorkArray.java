public class U0901WorkArray <T extends Number> {
    T[] arrNums;
    public U0901WorkArray(T[] NumP) {
        arrNums=NumP;
    }
    double sum() {
        double doubleWork;
        for(int i = 0; i < arrNums.length; i++)
        {
            doubleWork = doubleWork + arrNums[i];
        }
        return doubleWork;
    }

}

public class Main {
    Number arr[];
}