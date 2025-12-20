package com.hrms.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static Workbook book;
	public static Sheet sheet;

	public static void openExcel(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);

	}

	// will return nums of rows
	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	public static int colsCount(int row) {
		return sheet.getRow(row).getLastCellNum();

	}

	public static String cellData(int rowIndex, int colIndex) {
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}

	// return a 2D array of data
	public static Object[][] excelInto2DArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);

		int rows = rowCount();
		int cols = colsCount(0);

		Object[][] data = new Object[rows - 1][colsCount(0)];

		// iterating rows
		for (int i = 1; i <= rows; i++) {

			// iterating cols
			for (int j = 0; j < cols; j++) {
				data[i - 1][j] = cellData(i, j);

			}
		}
		return data;
	}

	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);

		List<Map<String, String>> listMap = new ArrayList<>();
		Map<String, String> excelMap;

		for (int r = 1; r < rowCount(); r++) {
			excelMap = new LinkedHashMap<>();
			
			for(int c=0; c<colsCount(r); c++) {
				excelMap.put(cellData(0, c), cellData(r, c));
			}
			listMap.add(excelMap);

		}
		return listMap;

	}
}
