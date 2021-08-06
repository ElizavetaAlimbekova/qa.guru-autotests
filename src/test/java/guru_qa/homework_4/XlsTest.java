package guru_qa.homework_4;


import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class XlsTest {

    @Test
    void checkXlsTest () throws Exception {
        ClassLoader classLoader = Thread.currentThread ().getContextClassLoader ();
        InputStream stream = classLoader.getResourceAsStream ("File.xls");
        XLS xlsFile = new XLS (stream);
        String stringCellValue = xlsFile.excel.getSheetAt (0).getRow (13).getCell (1).getStringCellValue ();
        System.out.println (stringCellValue);


    }
    }




