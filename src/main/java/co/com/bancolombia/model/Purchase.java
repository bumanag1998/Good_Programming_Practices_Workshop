package co.com.bancolombia.model;

public class Purchase {
    private final int orderId;
    private Product[] purchases;
    private static int purchaseCounter;
    private int productCounter;


    public Purchase() {
        this.orderId = ++purchaseCounter;
        this.purchases = new Product[3];
    }

    public void addProduct(Product product) {
        if (this.productCounter < 3) {
            this.purchases[this.productCounter++] = product;
        } else {
            System.out.println("You have exceeded the limit: 3");
        }
    }

    public void viewOrder() {
        System.out.println("Order " + this.orderId + ":");
        for (int i = 0; i < this.productCounter; ++i) {
            System.out.println("Product " + (i + 1) + ": " + this.purchases[i].getNameProduct());
        }
    }
}
