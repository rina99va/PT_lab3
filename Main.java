class U0901WorkArray extends Number {
    Number[] arrNums;
    public U0901WorkArray(Number NumP) {
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