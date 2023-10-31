public class Manager extends Employee {
    private double salaryPerHurs;
    private int workHours;
    private Mart mart;
    
    Manager(Mart mart) {
        this.mart = mart;
    }

    public void cetakStatus() {
        System.out.println("Branch         : " + mart);
        super.getData();
        System.out.println("Salary per hours : " + salaryPerHurs);
        System.out.println("Work hours       : " + workHours);
        System.out.println("Salary           : " + calculateSalary());
    }

    public double calculateSalary() {
        return salaryPerHurs * workHours;
    }

}
