public class Mart {
    private String idMart, martName, address, postalCode;
    
    public void setIdMart(String idMart) {
        this.idMart = idMart;
    }

    public void setMartName(String martName) {
        this.martName = martName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    // public String getDataMart() {
    //     String info = "";
    //     info += "ID Mart      : " + idMart;
    //     info += "Mart name    : " + martName;
    //     info += "Address      : " + address;
    //     info += "Postal code  : " + postalCode;
    //     return info;
    // }

    public void getDataMart() {
        System.out.println("ID Mart      : " + idMart);
        System.out.println("Mart name    : " + martName);
        System.out.println("Address      : " + address);
        System.out.println("Postal code  : " + postalCode);
    }

}
