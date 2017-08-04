import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinalExamTest {
    FinalExam finalExam = new FinalExam();
    @Test
    public void one_digit_input_should_return_input() {
        long actualResult = finalExam.getResult(8);
        assertEquals((long) 8, actualResult);
    }

    @Test
    public void input_10_should_return_9() {
        long actualResult = finalExam.getResult(10);
        assertEquals((long) 9, actualResult);
    }

    @Test
    public void input_20_should_return_19() {
        long actualResult = finalExam.getResult(20);
        assertEquals((long) 19, actualResult);
    }

    @Test
    public void input_132_should_return_129() {
        long actualResult = finalExam.getResult(132);
        assertEquals((long) 129, actualResult);
    }


}
