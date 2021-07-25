package guru_qa.homework_2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ThreeTestDragAndDrop {

    @Test
    void  dragAndDrop(){
        //открыть страницу https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Выбрать треугольник А (#column-a)  и поменять местами с треугольников В (#column-b)
        $("#column-a").dragAndDropTo("#column-b");
        //Проверить что они поменялись
        $("#column-a").shouldHave(text("B"));


    }
}
