import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeexcel {

	public static void storeValue(String sheet, int row, int col, String data)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		File fis = new File("‪D:\\Sele\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(new FileInputStream("‪D:\\Sele\\Book2.xlsx"));
		wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("‪D:\\Sele\\Book2.xlsx");
		wb.write(fos);
		wb.close();
	}

}
