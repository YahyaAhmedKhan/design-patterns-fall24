package Stateful;

public interface VendingState {

    void enterCoin(VendingContext context);

    void showProducts(VendingContext context);

    void selectProduct(VendingContext context);

    void confirmSelection(VendingContext context);

    void getChange(VendingContext context);

    void resetToIdle(VendingContext context);

    void cancel(VendingContext context);

    // IDLE,
    // DISPLAYING_ENTERED_COIN_AMOUNT,
    // WAITING_FOR_PRODUCT_SELECTION,
    // DISPLAYING_PRODUCT_SELECTED,
    // DISPENSING_PRODUCT,
    // REFUNDING_CHANGE

}