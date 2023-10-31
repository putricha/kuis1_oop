public class Employee {
    private String idEmployee, employeeName, address;
    private int age;

    Employee(String idEmployee, String employeeName, int age, String address) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.age = age;
        this.address = address;
    }

    Employee() {
        
    }
    public void setData(String idEmployee, String employeeName, int age, String address) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.age = age;
        this.address = address;
    }

    public String getData() {
        String info = "";
        info += "ID Employee : " + idEmployee + "\n";
        info += "Employee name : " + employeeName + "\n";
        info += "Age : " + age + "\n";
        info += "Address : " + address + "\n";
        return info;
    }

    public String getId() {
        return idEmployee;
    }

    public String getName() {
        return employeeName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

}
