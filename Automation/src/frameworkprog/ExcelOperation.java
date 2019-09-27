package frameworkprog;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation
{
			public static String readData(String sheetname,int rownum,int cellnum)
			{
				try
				{
					FileInputStream fis=new FileInputStream("D:\\testdata\\userdata.xlsx");
					Workbook w=WorkbookFactory.create(fis);
					String s=w.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
					return s;
				}
				catch(Exception e)
				{
					return "invalid data";
				}
				
			}
			public static void writeData(String sheetname,int rownum,int cellnum,String data)
			{
				try
				{
					FileInputStream fis=new FileInputStream("D:\\testdata\\userdata.xlsx");
					Workbook w=WorkbookFactory.create(fis);
					w.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(data);
					FileOutputStream fos=new FileOutputStream("D:\\testdata\\userdata.xlsx");
					w.write(fos);
				}
				catch(Exception e)
				{
					
				}}
				public static long readNumberData(String sheetname,int rownum,int cellnum)
				{
					try
					{
						FileInputStream fis=new FileInputStream("D:\\testdata\\userdata.xlsx");
						Workbook w=WorkbookFactory.create(fis);
						long l=(long)w.getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
						return l;
					}
					catch(Exception e)
					{
						return 0;
					}	
			}
}

