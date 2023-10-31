public class Product {
    private String productId;
    private int stock, price;
    private String productName, expDate;
    private Category ctg;

    Product(String productId, String productName, int stock, int price, String expDate, Category ctg) {
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
        this.price = price;
        this.expDate = expDate;
        this.ctg = ctg;
    }

    public void getProductData() {
        System.out.println("Product ID   : " + this.productId);
        System.out.println("Product name : " + this.productName);
        System.out.println("Stock        : " + this.stock);
        System.out.println("Price        : " + this.price);
        System.out.println("Exp. date    : " + this.expDate);
        this.ctg.getCategoryData();
    }

    public String getProductId() {
        return productId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int newStock) {
        this.stock = newStock;
    }

    public int getPrice() {
        return this.price;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getExp() {
        return expDate;
    }

    public String getCategory() {
        return ctg.getCategoryData();
    }

    public int updateStock(int qty) {
        return this.stock -= qty;
    };
}
