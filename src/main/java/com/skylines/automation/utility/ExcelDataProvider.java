package com.skylines.automation.utility;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataProvider {

    XSSFWorkbook workbook;

    public ExcelDataProvider() {

        File src = new File("./testData/allTestData.xlsx");

        try {
            FileInputStream fis = new FileInputStream(src);
            workbook = new XSSFWorkbook(fis);
        } catch (Exception e) {
            System.out.println("Unable to read Excel File "+e.getMessage());
        }
    }

    public String getStringData(int sheetIndex, int row, int column){
        return workbook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
    }
    public String getStringData(String sheetName, int row, int column){
        return workbook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    }

    public double getNumericData(String sheetName, int row, int column){
        return workbook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
    }


}
