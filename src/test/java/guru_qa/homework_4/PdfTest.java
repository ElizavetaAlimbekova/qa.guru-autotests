package guru_qa.homework_4;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PdfTest {
    @Test
    void checkPdfFile () throws IOException {
        String pdfFilePath = "./src/test/resources/File.pdf";
        String expectedData = "Table of Contents";
    }

}
