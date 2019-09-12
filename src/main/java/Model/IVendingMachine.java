package Model;

public interface IVendingMachine {

    void addCurrency(AcceptedAmount x);
    Product productRequest(int productNumber );
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();






}
