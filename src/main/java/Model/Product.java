package Model;

public abstract class  Product {
    private int price;
    private String ProcuctName;
    private String calories;
    private int productNumber;
    private String contains;

    public Product(int price, String procuctName, String calories, int productNumber, String contains) {
        this.price = price;
        ProcuctName = procuctName;
        this.calories = calories;
        this.productNumber = productNumber;
        this.contains = contains;
    }

    public int getPrice() {
        return price;
    }

    public String getProcuctName() {
        return ProcuctName;
    }

    public String getCalories() {
        return calories;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getContains() {
        return contains;
    }

    public abstract String examaninerad();
    public abstract String use();

}
