package lr8;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\������\\IdeaProjects\\lrs\\������.txt"), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\������\\IdeaProjects\\lrs\\������12.txt")));

            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+");

                int selectedWordsCount = 0;

                for (String word : words) {
                    if(word.matches("[������������������������������������������].*")) {
                        writer.write("������" + lineNumber + ":" + word + "\n");
                        selectedWordsCount++;
                    }
                }
                if (selectedWordsCount > 0) {
                    writer.write("���������� ��������� ����: " + selectedWordsCount + "\n\n");
                }
            }
            reader.close();
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println("������!!" + e.getMessage());
        }
    }
}
