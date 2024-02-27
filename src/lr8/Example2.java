package lr8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\������\\IdeaProjects\\lrs\\��������_����.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\������\\IdeaProjects\\lrs\\�������_����.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbersStr = line.split(" ");
                StringBuilder positiveNumbers = new StringBuilder();

                for (String numStr : numbersStr) {
                    numStr = numStr.replace(",", ".");
                    double num = Double.parseDouble(numStr);
                    if (num > 0) {
                        positiveNumbers.append(num).append(" ");
                    }
                }

                writer.write(positiveNumbers.toString().trim());
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}