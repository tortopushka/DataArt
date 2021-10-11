
public class ReverseInteger {
    int number;

    ReverseInteger(){
        number = 0;
    }

    public int reverse(int inputNumber){
        number=0;
        while (inputNumber!=0) {
            number =  inputNumber%10 + number * 10;
            inputNumber/= 10;
        }
        return number;
    }
}
