import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GradeCalculatorDemoTest {

    private GradeCalculatorDemo newDemo;

    @Before
    public void create(){
        newDemo = new GradeCalculatorDemo();
        newDemo.enterGradePercentage();
    }

    @Test
    public void shouldReturnCorrespondingLetterGradeFromPercentage(){
        String result = newDemo.returnLetterGradeFromPercentage();
        assertThat(result, equalTo("F"));
    }





}
