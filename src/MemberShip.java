public class MemberShip extends Customer{
    private String phoneNumber;
    protected int point;

    MemberShip(){

    }
    MemberShip(String idCust, String custName, String phoneNumber, int point) {
        super(idCust, custName);
        this.phoneNumber = phoneNumber;
        this.point = point;
    }

    public String getIdMm() {
        return super.getIdCust();
    }

    public String getCustName() {
        return super.getCustName();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPoint() {
        return point;
    }

    public String getData() {
        Customer cust = new Customer();
        String info = "";
        info += "ID Customer : " + cust.getIdCust();
        info += "Customer name : " + cust.getCustName();
        info += "Phone number : " + this.phoneNumber;
        info += "Point : " + this.point;
        return info;
    }
    public void memberInfo() {
        System.out.println("ID Customer : " + super.getIdCust());
        System.out.println("Customer name : " + super.getCustName());
        System.out.println("Phone number : " + this.phoneNumber);
        System.out.println("Point : " + this.point);
    }
    // public String getIDCust() {
    //     Customer cust = new Customer();
    //     return cust.getIdCust();
    // }

}
