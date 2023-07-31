package Com.Ecommerce.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSUtils {

	public static FileInputStream fi;
	public static XSSFWorkbook Wb;
	public static XSSFSheet XS;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowcount(String xfile, String Xsheet) throws IOException {

		fi = new FileInputStream(xfile);
		Wb = new XSSFWorkbook(fi);
		XS = Wb.getSheet(Xsheet);
		int rowcount = XS.getLastRowNum();
		Wb.close();
		fi.close();

		return rowcount;
	}

	public static int getCellcount(String xfile, String Xsheet,int rownum) throws IOException {

		fi = new FileInputStream(xfile);
		Wb = new XSSFWorkbook(fi);
		XS = Wb.getSheet(Xsheet);
		row=XS.getRow(rownum);
		int cellcount =row.getLastCellNum();
		Wb.close();
		fi.close();

		return cellcount;
	}
	
	public static String getcelldata(String xfile, String Xsheet, int rownum,int colnum) throws IOException {

		fi = new FileInputStream(xfile);
		Wb = new XSSFWorkbook(fi);
		XS = Wb.getSheet(Xsheet);
		row=XS.getRow(rownum);
		
		cell=row.getCell(colnum);
		
		String data;
		
		try {
		DataFormatter formatter = new DataFormatter();
		
		String celldata=formatter.formatCellValue(cell);
		
		return celldata;
		}
		catch(Exception e) {
			
			data="";
		}
		Wb.close();
		fi.close();

		return data;
	}

}
