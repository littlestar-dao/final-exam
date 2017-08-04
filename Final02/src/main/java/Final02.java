public class Final02 {
    private int price;
    public int getResult(String productType,int piece){
        if(productType == "A"){
            price = 100*piece;
        }
        return price;
    }
}
