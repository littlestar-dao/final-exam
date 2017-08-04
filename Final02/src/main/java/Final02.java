public class Final02 {
    private double price;
    private int buyA;
    private int buyB;
    private int buyC;
    private int buyD;
    private String pA;
    private String pB;
    private String pC;
    private String pD;

    public Final02(String product1, String product2, String product3,String product4) {
        this.pA = product1;
        this.pB = product2;
        this.pC = product3;
        this.pD = product4;
    }

    public void productA() {
        buyA++;
    }

    public void productB() {
        buyB++;
    }

    public void productC() {
        buyC++;
    }
    public void productD() {
        buyD++;
    }

    public double getResult() {
        if(buyA == 1 && buyB ==1 && buyC ==1 && buyD ==1){
            price =(buyA+buyB+buyC+buyD) * 100 *0.8;
        }
        else if (buyA == 1 && buyB == 1 && buyC == 1) {
            price = (buyA + buyB + buyC) * 100 * 0.9;
        } else if (buyA == 1 && buyB == 1) {
            price = (buyA + buyB) * 100 * 0.95;
        } else {
            price = 100 * buyA;
        }
        return price;
    }

}
