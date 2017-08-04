import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Final02Test {
    Final02 final02 = new Final02("A", "B");
    @Test
    public void buy_A_1_should_return_100() {
        final02.productA();
        double actualResult = final02.getResult();
        assertEquals( 100,actualResult,0);
    }

    @Test
    public void buy_A_1_B_1_should_return_190() {
        final02.productA();
        final02.productB();
        double actualResult = final02.getResult();
        assertEquals( 190,actualResult,0);
    }

}
