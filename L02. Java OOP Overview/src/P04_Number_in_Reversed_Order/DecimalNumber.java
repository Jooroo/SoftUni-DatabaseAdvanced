package P04_Number_in_Reversed_Order;

import java.text.DecimalFormat;

public class DecimalNumber {

    private double number;

    public DecimalNumber(double number) {
        this.number = number;
    }

    public String reversedNumber(){
        DecimalFormat df = new DecimalFormat("0.#########");

        StringBuilder sb = new StringBuilder(df.format(this.number));
        return sb.reverse().toString();
    }
}