package p07_Average_Grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> students = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(reader.readLine());

        while (lines-- > 0) {
            String[] tokens = reader.readLine().trim().split("\\s+");

            String name = tokens[0];
            double[] grades = Arrays
                    .stream(Arrays.copyOfRange(tokens, 1, tokens.length))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            students.add(new Student(name, grades));
        }

        StringBuilder sb = new StringBuilder();

        students.stream()
                .filter(student -> student.getAverageGrade() >= 5)
                .sorted()
                .forEach(student -> sb.append(student.toString()).append(System.lineSeparator()));

        System.out.println(sb.toString());

    }
}

