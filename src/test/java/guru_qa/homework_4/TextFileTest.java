package guru_qa.homework_4;

import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.*;


import static com.codeborne.selenide.Selenide.$;

public class TextFileTest {

    @Test
    void checkTextFile() throws IOException {

        Selenide.open ("https://github.com/ElizavetaAlimbekova/qa.guru-autotests/blob/master/README.md");
        File downloadedFile = $ ("#raw-url").download ();    //скачивание файла

        String s = FileUtils.readFileToString (downloadedFile,"UTF-8");
        Assertions.assertTrue (s.contains ("Use me for homework"));     //проверка содержимого файла










    }


}
