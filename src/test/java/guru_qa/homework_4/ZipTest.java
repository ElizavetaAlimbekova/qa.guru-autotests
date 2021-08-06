package guru_qa.homework_4;

import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.openqa.selenium.io.Zip.unzip;

public class ZipTest {
@Test
    void checkZip() throws IOException, ZipException {
    String zipFilePath = "./src/test/resources/zip/File.zip";
    String unzipFolderPath = "./src/test/resources/zip/unzip";
    String password = "456";
    String unzipTxtFilePath = "./src/test/resources/unzip/unzip";
    String expectedData = "Сергей Есенин";

    unzip(zipFilePath,password,unzipFolderPath);

    String actualData = readTextFromPath(unzipTxtFilePath);
    assertThat(actualData, containsString(expectedData));

    }
}

  zipFilePath,password,unzipFolderPath