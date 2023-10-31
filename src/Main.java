import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Manager> managerList = new ArrayList<>();
    static ArrayList<Cashier> cashierList = new ArrayList<>();
    static ArrayList<Customer> customerList = new ArrayList<>();
    static ArrayList<MemberShip> mbrShipList = new ArrayList<>();
    static ArrayList<Product> productsList = new ArrayList<>();
    static ArrayList<Suplier> suplierList = new ArrayList<>();
    static ArrayList<Transaction> productTransaction = new ArrayList<>();

    static Date date = new Date();

    static Mart m = new Mart();
    static Manager manager1 = new Manager(m);
    static Cashier cashier1 = new Cashier();
    static Cashier cashier2 = new Cashier();
    static String jawab;
    static int pilih;
    static Category c,c1;
    static Suplier s;

    static int idx;

    public static void main(String[] args) {
        m.setIdMart("M001");
        m.setMartName("Alfamart");
        m.setAddress("Jl. Raya Kebayoran Lama No. 12");
        m.setPostalCode("12210");
        manager1.setData("M1", "Putri", 20, "Malang");
        managerList.add(manager1);
        cashier1.setData("C1", "Sella", 19, "Surabaya");
        cashierList.add(cashier1);
        c = new Category(1, "Food & Beverages");

        c1 = new Category(1, "Home Care");

        Product product = new Product("001", "Indomie goreng 75g", 10, 3500, "2023", c);
        productsList.add(product);
        Product product2 = new Product("002", "Sari roti tawar 20s ", 10, 19000, "2023", c);
        productsList.add(product2);
        Product product3 = new Product("003", "Sunlight 200ml", 10, 2000, "2023", c1);
        productsList.add(product3);

        MemberShip m1 = new MemberShip("MS1", "Aisya", "0998176541", 0);
        mbrShipList.add(m1);
        System.out.println(mbrShipList.size());
        System.out.println();
        System.out.println("|================================================================|");
        System.out.printf("|                %-48s|\n", date);
        System.out.println("|           WELCOME TO SUPERMARKET MANAGEMENT SYSTEM             |");
        while (true) {
            System.out.println("|----------------------------------------------------------------|");
            System.out.println("|                      SUPERMARKET SYSTEM                        |");
            System.out.println("|----------------------------------------------------------------|");

            System.out.println("[1] Supermarket Information\n[2] Employee\n[3] Customer\n[4] Product\n[5] Transaction");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Choose menu :");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("|================================================================|");
                    System.out.println("|                  SUPERMARKET INFORMATION                       |");
                    System.out.println("|================================================================|\n");
                    m.getDataMart();
                    continu();
                    break;
                case 2:
                    System.out.println("|================================================================|");
                    System.out.println("|                           EMPLOYEE MENU                        |");
                    System.out.println("|================================================================|\n");
                    System.out.println("[1] Check Employee Data\n[2] Add Cashier");
                    System.out.println("------------------------------------------------------------------");
                    System.out.print("Choose menu :");
                    pilih = sc.nextInt();
                    if (pilih == 1) {
                        checkEmployeeData();
                        continu();

                    } else if (pilih == 2) {
                        addCashier();
                        continu();

                    } else {
                        System.out.println("Input the menu correctly!");
                    }
                    break;

                case 3:
                    System.out.println("|================================================================|");
                    System.out.println("|                         CUSTOMER MENU                          |");
                    System.out.println("|================================================================|\n");
                    System.out.println("[1] Check Customer Data\n[2] Check Membership Data\n[3] Add Membership Data");
                    System.out.println("------------------------------------------------------------------");
                    System.out.print("Choose menu :");
                    pilih = sc.nextInt();

                    if (pilih == 1) {
                        checkCustomerData();
                        continu();
                    } else if (pilih == 2) {
                        checkMemberShipData();
                        continu();
                    } else if (pilih == 3) {
                        addMembershipData();
                        continu();
                    } else {
                        System.out.println("Input the menu correctly!");
                    }
                    break;
                case 4:
                    System.out.println("|================================================================|");
                    System.out.println("|                         PRODUCT MENU                           |");
                    System.out.println("|================================================================|\n");
                    System.out.println("[1] Check Product\n[2] Add Product\n[3] Add Stock");
                    System.out.print("Choose menu :");
                    pilih = sc.nextInt();
                    if (pilih == 1) {
                        checkProduct();
                        continu();
                    } else if (pilih == 2) {
                        addProduct();
                        continu();
                    } else if (pilih == 3) {
                        addStock();
                        continu();
                    } else {
                        System.out.println("Input the menu correctly!");
                    }
                    break;
                case 5:
                    System.out.println("|================================================================|");
                    System.out.println("|                            TRANSACTION                         |");
                    System.out.println("|================================================================|");
                    transaction();
                    continu();
                    break;

            }
        }

    }

    public static void checkEmployeeData() {

        System.out.println("|================================================================|");
        System.out.println("|                         EMPLOYEE DATA                          |");
        System.out.println("|================================================================|");
        System.out.println("| NO PEGAWAI |    NAMA PEGAWAI    |    ALAMAT    |     USIA      |");
        System.out.println("|============|====================|==============|===============|");
        for (Manager manager : managerList) {
            System.out.printf("|-%-10s |%-20s|%-14s|%-15d|\n", manager.getId(), manager.getName(),
                    manager.getAddress(), manager.getAge());
        }
        for (Cashier cashier : cashierList) {
            System.out.printf("|-%-10s |%-20s|%-14s|%-15d|\n", cashier.getId(), cashier.getName(),
                    cashier.getAddress(), cashier.getAge());
        }

        System.out.println(
                "|================================================================|");

    }

    public static void checkCustomerData() {
        System.out.println("|==================================|");
        System.out.println("|           CUSTOMER DATA          |");
        System.out.println("|==================================|");
        System.out.println("| ID CUSTOMER |   CUSTOMER NAME    |");
        System.out.println("|=============|====================|");
        for (Customer customer : customerList) {
            System.out.printf("|-%-11s |%-20s|\n", customer.getIdCust(), customer.getCustName());
        }
        System.out.println("|==================================|");

    }

    public static void checkMemberShipData() {
        System.out.println("|================================================================|");
        System.out.println("|                       MEMBERSHIP DATA                          |");
        System.out.println("|================================================================|");
        System.out.println("| ID MEMBER  |    MEMBER NAME     |    PHONE     |     POINT     |");
        System.out.println("|============|====================|==============|===============|");

        for (MemberShip memberShip : mbrShipList) {
            System.out.printf("|-%-10s |%-20s|%-14s|%-15d|\n", memberShip.getIdCust(), memberShip.getCustName(),
                    memberShip.getPhoneNumber(), memberShip.getPoint());
        }
        System.out.println("|================================================================|");

    }

    public static void addCashier() {
        System.out.print("Employee ID     : ");
        String id = sc.next();
        System.out.print("Name            : ");
        String name = sc.next();
        System.out.print("Age             : ");
        int age = sc.nextInt();
        System.out.print("Address         : ");
        String address = sc.next();
        // Membuat objek Employee
        Cashier cashier = new Cashier(id, name, age, address);
        cashierList.add(cashier);
    }

    public static void addMembershipData() {
        System.out.println("------------------------------------------------------------------");
        System.out.print("Membership ID   : ");
        String id = sc.next();
        System.out.print("Name            : ");
        String name = sc.next();
        System.out.print("Phone number    :");
        String phone = sc.next();
        MemberShip memberShip = new MemberShip(id, name, phone, 0);
        mbrShipList.add(memberShip);

    }

    public static void checkProduct() {
        System.out.println(
                "|====================================================================================================|");
        System.out.println(
                "|                                             PRODUCT DATA                                           |");
        System.out.println(
                "|====================================================================================================|");
        System.out.println(
                "| ID PRODUCT |    PRODUCT NAME    |    STOCK     |     PRICE     |    EXP DATE   |      CATEGORY     |");
        System.out.println(
                "|============|====================|==============|===============|===============|===================|");
        for (Product product : productsList) {
            System.out.printf("|-%-10s |%-20s|%-14d|%-15d|%-15s|%-19s|\n", product.getProductId(),
                    product.getProductName(),
                    product.getStock(), product.getPrice(), product.getExp(), product.getCategory());
        }
        System.out.println(
                "|====================================================================================================|");
    }

    public static void addProduct() {
        System.out.println("\n------------------------------");
        System.out.println("        ADD PRODUCT           ");
        System.out.println("------------------------------");

        while (true) {
            System.out.println("Masukkan data suplier:");
            System.out.print("Suplier id : ");
            String id = sc.next();
            System.out.print("Suplier name : ");
            String name = sc.next();
            System.out.print("Contact : ");
            String contact = sc.next();

            System.out.println("Input product data:");

            System.out.print("Product id: ");
            String productId = sc.next();
            sc.nextLine(); // Membersihkan newline dari buffer
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Membersihkan newline dari buffer
            System.out.print("EXP date (yyyy-mm-dd): ");
            String expDate = sc.nextLine();
            System.out.println(
                    "Category\n(1) Food & Beverages\n(2) Cooking corner\n(3) Personal care\n(4) Home care\n(5) Medicine");
            System.out.print("Catagery: ");
            int category = sc.nextInt();
            sc.nextLine();
            // Membuat objek kategori

            if (category == 1) {
                c = new Category(1, "Food & Brverages");
            } else if (category == 2) {
                c = new Category(2, "Cooking corner");
            } else if (category == 3) {
                c = new Category(3, "Personal care");
            } else if (category == 4) {
                c = new Category(4, "Home care");
            } else if (category == 5) {
                c = new Category(4, "Medicine");
            } else {
                System.out.println("Input the category correctly!");
            }

            Product product = new Product(productId, productName, stock, price, expDate, c);
            productsList.add(product);
            s = new Suplier(id, name, contact, product);
            System.out.print("Do you want to add product again? (y/n): ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

    }

    static void addStock() {
        System.out.println("\n------------------------------");
        System.out.println("     ADD PRODUCT STOCK        ");
        System.out.println("------------------------------");

        System.out.print("Masukkan id product : ");
        String id = sc.next();
        System.out.print("Masukkan stock tambahan : ");
        int stck = sc.nextInt();
        for (int i = 0; i < productsList.size(); i++) {
            if (id.equalsIgnoreCase(productsList.get(i).getProductId())) {
                idx = i;
                break;
            }
        }
        s.addStock(productsList.get(idx), stck);
    }

    static void continu() {
        System.out.println("------------------------------------------------------------------\n");
        System.out.print("Do you want to continue this system? (y/n)  ");
        jawab = sc.next();
        if (jawab.equalsIgnoreCase("n")) {
            System.exit(0);
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static void transaction() {
        System.out.print("Cashier ID : ");
        String cashierId = sc.next();
        Cashier cs=cashier1;
        for (Cashier cashier : cashierList) {
            if (cashierId.equalsIgnoreCase(cashier.getId())) {
                cs = cashier;
                    break;
                }
        }
        System.out.print("\nTransaction id : ");
        int idTrs = sc.nextInt();
        while (true) {
            System.out.print("Input id product : ");
            String idP = sc.next();
            System.out.print("Qty : ");
            int qty = sc.nextInt();
            for (int i = 0; i < productsList.size(); i++) {
                if (idP.equalsIgnoreCase(productsList.get(i).getProductId())) {
                    idx = i;
                    Product p = productsList.get(i);
                    Transaction t = new Transaction(p, qty);
                    t.updateProductStock();
                    productTransaction.add(t);
                    break;
                }
            }

            System.out.print("Do you want to add product again ? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.print("Diskon : ");
        int disc = sc.nextInt();
        Transaction t = new Transaction();

        System.out.print("Do you have a membership  ? (y/n) ");
        jawab = sc.next();
        if (jawab.equalsIgnoreCase("y")) {
            System.out.print("Input your id : ");
            String ids = sc.next();
            for (int i = 0; i < mbrShipList.size(); i++) {
                if (ids.equalsIgnoreCase(mbrShipList.get(i).getIdMm())) {
                    idx = i;
                    System.out.println(idx);
                    break;
                }
            }
            t.setTransactionMbr(idTrs, date, disc, mbrShipList.get(idx),cs);
            t.addPoint();
        } else {
            String s = " " + customerList.size()+1;
            System.out.print("Customer name : ");
            String name = sc.next();
            Customer c = new Customer(s, name);
            customerList.add(c);
            t.setTransaction(idTrs, date, disc, c,cs);
        }
        t.updateTransaction(productTransaction);
        t.printReceipt();
        System.out.println();

    }
}
