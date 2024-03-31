package lr10.example4;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Максим\\IdeaProjects\\lrs\\example4.xlsx";

        try (FileInputStream inputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            XSSFSheet sheet = workbook.getSheet("Товары");

            if (sheet == null) {
                System.out.println("Лист 'Товары' не найден в файле Excel.");
                return;
            }

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла Excel: " + e.getMessage());
            e.printStackTrace();
        }
    }
}