
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double taxRate = 10;
       
        int tax = (int) (price * taxRate / 100);
        int taxIncludedPrice = price + tax;
        
        System.out.println(price + "円の商品の税込価格は" + taxIncludedPrice + "円（消費税は" + tax + "円）です。");
    }
}