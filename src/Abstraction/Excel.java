package Abstraction;

import  java.io.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;

public class Excel{
	private String path;
	private String sheetName;
	private Donnees donnees;

    public Excel(String path, String sheetName, Donnees donnees) {
		this.path = path;
		this.sheetName = sheetName;
		this.donnees = donnees;
	}

	public void Exporter(){
        try {
            
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet(this.sheetName);  

            HSSFRow rowhead = sheet.createRow((short)0);
            for (int i=0; i<5; i++) {
            	rowhead.createCell(i).setCellValue("Machine" + (i+1));
            }

            HSSFRow row = sheet.createRow((short)1);
            for (int i=0; i<5; i++) {
            	rowhead.createCell(i).setCellValue(donnees.ResultatParMachine[i]);
            }

            FileOutputStream fileOut = new FileOutputStream(this.path);
            workbook.write(fileOut);
            fileOut.close();
        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
}