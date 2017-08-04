public class Final02 {
    private double price;
    private int buyA;
    private int buyB;
    private String pA;
    private String pB;
    public Final02(String firstProduct, String secondProduct) {
        this.pA = firstProduct;
        this.pB = secondProduct;
    }

    public void productA() {
        buyA++;
    }
    public void productB() {
        buyB++;
    }

    public double getResult(){
        if (buyA ==1 && buyB ==1){
            price = (buyA+buyB) *100 *0.95;
        }else{
            price = 100*buyA;

        }
        return price;
    }

}
