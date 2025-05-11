package TEST;

import apache

public class ExelClasssss {

    public static void main (String [] args) {

        XSSFWorkbook wb = new XSSFWorkbook();
        try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
            wb.write(fileOut);
        }
    }
}
