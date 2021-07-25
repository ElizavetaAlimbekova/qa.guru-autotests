package guru_qa.homework_3;

import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {

    private static final String  REPOSITORY = "ElizavetaAlimbekova/qa.guru-autotests";
    private WebSteps step = new WebSteps ();

    @Test
    public void annotatedSearchTest(){
        step.openMainPage ();
        step.searchForRepository (REPOSITORY);
        step.openRepository (REPOSITORY);
        step.checkNameIssues ();

    }
}
