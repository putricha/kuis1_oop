public class Suplier {
    private String idSuplier, suplierName, contact;
    private Product pdc;

    Suplier(String idSuplier, String suplierName, String contact, Product pdc) {
        this.idSuplier = idSuplier;
        this.suplierName = suplierName;
        this.contact = contact;
        this.pdc = pdc;
    }

    public void getData() {
        System.out.println("ID Suplier   : " + idSuplier);
        System.out.println("Suplier name : " + suplierName);
        System.out.println("Contact      : " + contact);
        System.out.println("Product      : " + pdc.getProductName());
    }
    


    public void addStock(Product pdc, int qty) {
        int newStock = pdc.getStock() + qty;
        pdc.setStock(newStock);
    }
}
