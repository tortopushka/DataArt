
public class ReverseInteger {
    int num;

    ReverseInteger(){
        num = 0;
    }

    public int reverse(int inputNumber){
        num=0;
        while (inputNumber!=0) {
            num = num * 10 + inputNumber%10;
            inputNumber/= 10;
        }
        return num;
    }
}
