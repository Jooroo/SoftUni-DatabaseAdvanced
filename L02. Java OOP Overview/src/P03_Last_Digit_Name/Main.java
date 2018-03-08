package P03_Last_Digit_Name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Number number = new Number(Integer.parseInt(reader.readLine()));

        String lastDigitName = number.getNameOfLastDigit();

        System.out.println(lastDigitName);
    }
}
