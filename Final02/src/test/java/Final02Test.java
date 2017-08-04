import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Final02Test {
    Final02 final02 = new Final02("A", "B","C", "D","E");
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

    @Test
    public void buy_A_1_B_1_C_1should_return_270() {
        final02.productA();
        final02.productB();
        final02.productC();
        double actualResult = final02.getResult();
        assertEquals( 270,actualResult,0);
    }

    @Test
    public void buy_A_1_B_1_C_1_D_1should_return_320() {
        final02.productA();
        final02.productB();
        final02.productC();
        final02.productD();
        double actualResult = final02.getResult();
        assertEquals( 320,actualResult,0);
    }

    @Test
    public void buy_A_1_B_1_C_1_D_1_E_1should_return_425() {
        final02.productA();
        final02.productB();
        final02.productC();
        final02.productD();
        final02.productE();
        double actualResult = final02.getResult();
        assertEquals( 375,actualResult,0);
    }

}
