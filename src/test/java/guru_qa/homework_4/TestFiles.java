package guru_qa.homework_4;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class TestFiles {

    @Test
    void downloadTextFile() throws FileNotFoundException {

        Selenide.open ("https://github.com/junit-team/junit5/blob/main/README.md");
        File downloadedFile = $ ("#raw-url").download ();



    }


}
