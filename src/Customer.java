public class Customer {
    private String idCust, custName;


    Customer() {
        
    }
     
    Customer(String idCust, String custName) {
        this.idCust = idCust;
        this.custName = custName;
    }
    public void setIdCust(String idCust) {
        this.idCust = idCust;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getIdCust() {
        return idCust;
    }

    public String getCustName() {
        return custName;
    }


}
