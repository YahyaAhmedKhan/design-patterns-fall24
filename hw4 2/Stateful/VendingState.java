package Stateful;

public interface VendingState {

    void doAction(VendingContext context);

    // IDLE,
    // DISPLAYING_ENTERED_COIN_AMOUNT,
    // WAITING_FOR_PRODUCT_SELECTION,
    // DISPLAYING_PRODUCT_SELECTED,
    // DISPENSING_PRODUCT,
    // REFUNDING_CHANGE

}