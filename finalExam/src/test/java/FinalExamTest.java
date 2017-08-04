import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinalExamTest {
    FinalExam finalExam = new FinalExam();
    @Test
    public void one_digit_input_should_return_input() {
        long actualResult = finalExam.getResult(8);
        assertEquals((long) 8, actualResult);
    }


}
