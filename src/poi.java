import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class poi {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException, Exception {
		// read data from excel
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");
		Row firstrow = sh.getRow(0);// from which row the data has to be read
		int rowcount = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < firstrow.getLastCellNum(); j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.print(cl + "   ");

			}
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.println(sh.getRow(1).getCell(0).toString());

	}

	public static void storeValue(String sheet, int row, int col, String data)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		File fis = new File("‪D:\\Sele\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(new FileInputStream("‪C:\\Users\\DELL\\Desktop\\Book1.xlsx"));
		wb.createSheet(sheet).createRow(row).createCell(col).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
		wb.write(fos);
		wb.close();
	}

}
