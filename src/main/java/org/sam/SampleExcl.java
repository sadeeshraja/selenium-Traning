package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcl {
public static void main(String[] args) throws IOException {
	
File f = new File("D:\\workspeacs\\MavenPR2\\Excel\\SampleData.xlsx");	

FileInputStream fis = new FileInputStream(f);

Workbook wb = new XSSFWorkbook(fis);

Sheet my = wb.getSheet("data");
//pro2
for (int i = 0; i < my.getPhysicalNumberOfRows(); i++) {
	Row iteraterow = my.getRow(1);
	for (int j = 0; j < iteraterow.getPhysicalNumberOfCells(); j++) {
		Cell iteratecell = iteraterow.getCell(0);
		System.out.println(iteratecell);
	}
}
//pro1
//Row row = my.getRow(1);
//System.out.println(row);
//Cell scell = row.getCell(0);
//System.out.println(scell);
}
}
