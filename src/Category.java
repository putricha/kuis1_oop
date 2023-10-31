public class Category {
    private int categoryId;
    private String categoryName;

    Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public String getCategoryData(){
        // System.out.println("Category ID   : " + this.categoryId);
        // System.out.println("Category name : " + this.categoryName);
        return categoryName;
    }
}
