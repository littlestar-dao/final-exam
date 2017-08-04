public class Final02 {
    private double price;
    private int buyA=0;
    private int buyB=0;
    private int buyC=0;
    private int buyD=0;
    private int buyE=0;
    private String pA;
    private String pB;
    private String pC;
    private String pD;
    private String pE;
//    private List<String> basket = new ArrayList<String>();

    public Final02(String product1, String product2, String product3, String product4, String product5) {
        this.pA = product1;
        this.pB = product2;
        this.pC = product3;
        this.pD = product4;
        this.pE = product5;
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

    public void productE() {
        buyE++;
    }

    public double getResult() {
        if(buyA == 2){
            price = buyA*100;
        }
        else if (buyA == 1 && buyB == 1 && buyC == 1 && buyD == 1 && buyE == 1) {
            price = (buyA + buyB + buyC + buyD + buyE) * 100 * 0.75;
        } else if (buyA == 1 && buyB == 1 && buyC == 1 && buyD == 1) {
            price = (buyA + buyB + buyC + buyD) * 100 * 0.8;
        } else if (buyA == 1 && buyB == 1 && buyC == 1) {
            price = (buyA + buyB + buyC) * 100 * 0.9;
        } else if (buyA == 1 && buyB == 1) {
            price = (buyA + buyB) * 100 * 0.95;
        } else {
            price = 100 * buyA;
        }
        return price;
    }
}
