import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private int transactionId, productId, qty;
    private String transactionDate;
    private double discount, total;
    private Product product;
    private Cashier cashier;
    private Customer customer;
    private MemberShip memberShip;
    private double shopTotal = 0;
    ArrayList<Transaction> transactionList;

    Date date = new Date();

    Transaction(Product produk, int qty) {
        this.product = produk;
        this.qty = qty;
    }

    Transaction() {

    }

    public void updateTransaction(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void setTransaction(int transactionId, Date transactionDate, double discount, Customer customer,
            Cashier cashier) {
        this.transactionId = transactionId;
        this.date = transactionDate;
        this.discount = discount;
        this.customer = customer;
        this.cashier = cashier;
    }

    public void setTransactionMbr(int transactionId, Date transactionDate, double discount, MemberShip memberShip,Cashier cashier) {
        this.transactionId = transactionId;
        this.date = transactionDate;
        this.discount = discount;
        this.memberShip = memberShip;
        this.cashier = cashier;
    }

    public double calculateTotal(Product a) {
        double sum = a.getPrice() * this.qty;
        double disc = 100 - this.discount;
        return this.total = sum * disc / 100;
    }

    public double totalPayment(double sum) {
        double disc = 100 - this.discount;
        return this.total = sum * disc / 100;

    }

    public void updateProductStock() {
        this.product.updateStock(this.qty);
    }

    public void addPoint() {
        this.memberShip.point += totalPayment(shopTotal) / 1000;
    }

    public int getQty() {
        return qty;
    }

    public Product getPro() {
        return product;
    }

    public void printReceipt() {
        System.out.println("|====================================================================|");
        System.out.printf("|                    %-48s|\n", date);
        System.out.println("|                      ALFAMART KEBAYORAN LAMA                       |");
        System.out.println("|====================================================================|");
        System.out.printf("|Cashier : %-58s|\n",cashier.getName());
        System.out.println("|====================================================================|");
        System.out.println("|         PRODUCT          |   QTY    |    PRICE     |     TOTAL     |");
        System.out.println("|==========================|==========|==============|===============|");
        for (Transaction ts : transactionList) {
            System.out.printf("|-%-24s |%-10d|%-14d|%-15.2f|\n",
                    ts.getPro().getProductName(),
                    ts.getQty(), ts.getPro().getPrice(), ts.calculateTotal(ts.getPro()));
            shopTotal += ts.calculateTotal(ts.getPro());
        }
        System.out.println("|====================================================================|");
        System.out.printf("|                                   Total            : Rp.%-11.2f|\n", shopTotal);
        System.out.printf("|                                   Discount         : Rp.%-11.2f|\n", ((discount / 100) * shopTotal));
        System.out.printf("|                                   Total payment    : Rp.%-11.2f|\n", totalPayment(shopTotal));
        if (memberShip != null) {
            addPoint();
        System.out.printf("|                                   Your point       : %-14d|\n", memberShip.point);

        }
        System.out.println("|====================================================================|");
        System.out.println("|                TERIMAKASIH, SELAMAT BELANJA KEMBALI                |");
        System.out.println("|====================================================================|");

    }
}
