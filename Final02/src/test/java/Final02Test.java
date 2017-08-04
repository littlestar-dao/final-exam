import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Final02Test {
    Final02 final02 = new Final02();

    @Test
    public void input_A_1_should_return_input() {
        int actualResult = final02.getResult("A",1);
        assertEquals( 100,actualResult);

    }
}
