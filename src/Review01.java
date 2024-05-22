public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double taxRate = 10;

        // 税額を計算
        int tax = tax(price, taxRate);

        // 税込価格を計算
        int taxIncludedPrice = price + tax;

        // 結果を出力
        System.out.println(price + "円の商品の税込価格は" + taxIncludedPrice + "円（消費税は" + tax + "円）です。");
    }

    // 税額を計算するメソッド
    public static int tax(int price, double taxRate) {
        return (int) (price * (taxRate / 100));
    }
}
