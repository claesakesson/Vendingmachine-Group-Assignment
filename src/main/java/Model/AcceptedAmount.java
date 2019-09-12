package Model;

public enum AcceptedAmount {
     ONE(1), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), FIVE_HUNDRED(500), ONE_THOUSAND(1000);

    private int amounts;



    AcceptedAmount(int acceptedAmounts) {
        this.amounts = acceptedAmounts;

    }

    public int getAmounts() {
        return amounts;
    }
}



