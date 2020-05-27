package cn.lingnan.util;

import cn.lingnan.pojo.BasicInformation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ExcelReader {
    /**
     * Author: Dreamer-1
     * Date: 2019-03-01
     * Time: 10:21
     * Description: 读取Excel内容
     */


    private static final Logger logger = Logger.getLogger(ExcelReader.class.getName()); // 日志打印类

    //private static final String XLS = "xls";
    //private static final String XLSX = "xlsx";

    public static List<BasicInformation> readExcel(File file) {
        FileInputStream inputStream = null;
        Workbook workbook = null;
        try {
            inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parseExcel(workbook);
    }

    /**
     * 解析Excel数据
     *
     * @param workbook Excel工作簿对象
     * @return 解析结果
     */
    private static List<BasicInformation> parseExcel(Workbook workbook) {
        List<BasicInformation> resultDataList = new ArrayList<>();
        // 解析sheet(最后1页不读)(workbook.getNumberOfSheets()-1)
        for (int sheetNum = 0; sheetNum < 3; sheetNum++) {
            Sheet sheet = workbook.getSheetAt(sheetNum);

            // 校验sheet是否合法
            if (sheet == null) {
                continue;
            }

            // 获取第一行数据
            int firstRowNum = sheet.getFirstRowNum();
            Row firstRow = sheet.getRow(firstRowNum);
            if (null == firstRow) {
                logger.warning("解析Excel失败，在第一行没有读取到任何数据！");
            }

            // 解析每一行的数据，构造数据对象
            int rowStart = firstRowNum + 2;
            int rowEnd = sheet.getPhysicalNumberOfRows();
            for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
                Row row = sheet.getRow(rowNum);

                if (null == row) {
                    continue;
                }

                BasicInformation resultData = convertRowToData(row);
                if (resultData == null) {
                    logger.warning("第 " + row.getRowNum() + "行数据不合法，已忽略！");
                    continue;
                }

                String sClass = sClass = sheet.getSheetName().split("名")[0];
                resultData.setsClass2(sClass);
                resultDataList.add(resultData);
            }
        }

        return resultDataList;
    }

    /**
     * 将单元格内容转换为字符串
     *
     * @param cell 单元格数据
     * @return 字符串
     */
    private static String convertCellValueToString(Cell cell) {
        if (cell == null) {
            return null;
        }
        String returnValue = null;
        switch (cell.getCellType()) {
            case NUMERIC:   //数字
                Double doubleValue = cell.getNumericCellValue();

                // 格式化科学计数法，取一位整数
                DecimalFormat df = new DecimalFormat("0");
                returnValue = df.format(doubleValue);
                break;
            case STRING:    //字符串
                returnValue = cell.getStringCellValue();
                break;
            case BOOLEAN:   //布尔
                Boolean booleanValue = cell.getBooleanCellValue();
                returnValue = booleanValue.toString();
                break;
            case BLANK:     // 空值
                break;
            case FORMULA:   // 公式
                returnValue = cell.getCellFormula();
                break;
            case ERROR:     // 故障
                break;
            default:
                break;
        }
        return returnValue;
    }

    /**
     * 提取每一行中需要的数据，构造成为一个结果数据对象
     *
     * @param row 行数据
     * @return 解析后的行数据对象，行数据错误时返回null
     */
    private static BasicInformation convertRowToData(Row row) {
        BasicInformation resultData = new BasicInformation();
        Cell cell;

        // 获取学号
        cell = row.getCell(1);
        String sId = convertCellValueToString(cell);
        resultData.setsId(sId);
        // 获取姓名
        cell = row.getCell(2);
        String sName = convertCellValueToString(cell);
        resultData.setsName(sName);
        // 获取班级
        cell = row.getCell(3);
        String sClass = convertCellValueToString(cell);
        resultData.setsClass1(sClass);
        //获取备注.
        cell = row.getCell(4);
        String sLocation = convertCellValueToString(cell);
        resultData.setsLocation(sLocation);

        return resultData;
    }
}

