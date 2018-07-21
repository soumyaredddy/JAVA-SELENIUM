package testng_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlfiledata {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(new File("C:\\Users\\srgad\\Desktop\\mindmajix.recordings\\ssis@user\\xlfile\\Employe1.xlsx"));
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet s = wk.getSheetAt(0);
		int totalrows = s.getPhysicalNumberOfRows();
		for(int i=0;i<=totalrows;i++) {
			Row row = s.getRow(i);
			int totalcells = row.getPhysicalNumberOfCells();
			for(int j=0;j<=totalcells;j++) {
				Cell cell = row.getCell(j);
				
				//String mydata = cell.getStringCellValue();
				if(cell.getCellType()==Cell.CELL_TYPE_STRING) {
					String mydata = cell.getStringCellValue();
		
				if("CustomerKey".equals(mydata)) {
					System.out.println("valid");
					System.out.println(i);
					System.out.println(j);
				}
				System.out.println(mydata);
				
			}
				if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
					double x = cell.getNumericCellValue();
					System.out.println(x);
				}
				
		}
		//for individual data
		/*Row row = s.getRow(3);
		Cell cell = row.getCell(3);
		System.out.println(cell.getStringCellValue());*/
		
	}
	
	

}
}
