package guru_qa.homework_4;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PdfTest {
    @Test
    void checkPdfFile() throws IOException {
        String pdfFilePath = "./src/test/resources/File.pdf";
        String expectedData = "Table of Contents";

    }

}