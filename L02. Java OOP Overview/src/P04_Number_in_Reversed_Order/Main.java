package P04_Number_in_Reversed_Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        DecimalNumber number = new DecimalNumber(Double.parseDouble(reader.readLine()));


        System.out.println(number.reversedNumber());
    }
}
