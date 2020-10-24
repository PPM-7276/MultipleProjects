package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelRead {
public static void main(String[] args) throws Exception {
	
	FileInputStream fis=new FileInputStream("TestData.xls");
	
	Workbook wb=Workbook.getWorkbook(fis);
	
	Sheet sh=wb.getSheet("Login");
	
	int row=sh.getRows();
	int col=sh.getColumns();
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell cell=sh.getCell(j,i);
				String data=cell.getContents();
				System.out.println(data+"  ");
			}
			System.out.println();
		}
  }
}
