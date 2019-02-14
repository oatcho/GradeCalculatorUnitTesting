import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GradeCalculatorDemoTest {

    private GradeCalculatorDemo newDemo;

    @Before
    public void create(){
        newDemo = new GradeCalculatorDemo();
        newDemo.enterPercentageGradesIntoArray(45, 70, 100, 85, 90);
    }

    @Test
    public void shouldReturnCorrespondingLetterGradeFromPercentage(){
        String result = newDemo.returnLetterGradeFromPercentage(56);
        assertThat(result, equalTo("F"));
    }

    @Test
    public void shouldReturnAverageOfCollectionOfPercentages(){
        double result = newDemo.returnAveragePercentageFromCollectionOfPercentages();
        assertThat(result, equalTo(78.0));
    }

    @Test
    public void shouldReturnCorrespondingNumberGradeFromLetterGrade(){
        double result = newDemo.returnCorrespondingNumberGradeFromLetterGrade("A");
        assertThat(result, equalTo(4.0));
    }





}
