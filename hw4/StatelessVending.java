public class StatelessVending {
    public enum VendingStates {
        IDLE,
        DISPLAYING_ENTERED_COIN_AMOUNT,
        WAITING_FOR_PRODUCT_SELECTION,
        DISPLAYING_PRODUCT_SELECTED,
        DISPENSING_PRODUCT,
        REFUNDING_CHANGE
    }

    VendingStates currentState = VendingStates.IDLE;

    // select coim, select product, cancel
    void cancel() {
        if (currentState == VendingStates.WAITING_FOR_PRODUCT_SELECTION) {
            currentState = VendingStates.REFUNDING_CHANGE;
            System.out.println("Refunding change...");
        } else {
            // throw exception
            throw new IllegalStateException("Cannot select product in state: " + currentState);
        }

    }

    void enterCoin() {
        if (currentState == VendingStates.IDLE) {
            currentState = VendingStates.DISPLAYING_ENTERED_COIN_AMOUNT;
            System.out.println("Displaying entered coin amount...");
        } else {
            // throw exception
            throw new IllegalStateException("Cannot insert coing in state: " + currentState);
        }
    }

    void selectProduct() {
        if (currentState == VendingStates.WAITING_FOR_PRODUCT_SELECTION) {
            currentState = VendingStates.DISPLAYING_PRODUCT_SELECTED;
        } else {
            // throw exception
            throw new IllegalStateException("Cannot select product in state: " + currentState);
        }
    }

    void confirmSelection() {
        if (currentState == VendingStates.DISPLAYING_PRODUCT_SELECTED) {
            currentState = VendingStates.DISPENSING_PRODUCT;
            System.out.println("Dispensing product...");
        } else {
            // throw exception
            throw new IllegalStateException("Cannot confirm selection in state: " + currentState);
        }

    }

    void getChange() {
        if (currentState == VendingStates.DISPENSING_PRODUCT) {
            currentState = VendingStates.REFUNDING_CHANGE;
            System.out.println("Refunding change...");
        } else {
            // throw exception
            throw new IllegalStateException("Cannot refund change in state: " + currentState);
        }
    }

    void resetToIdle() {

        if (currentState == VendingStates.REFUNDING_CHANGE) {
            currentState = VendingStates.IDLE;
            System.out.println("Vending machine is now idle.");
        }

    }

    void showProducts() {
        if (currentState == VendingStates.DISPLAYING_ENTERED_COIN_AMOUNT) {
            currentState = VendingStates.WAITING_FOR_PRODUCT_SELECTION;
            System.out.println("Waiting for product selection...");
        } else {
            // throw exception
            throw new IllegalStateException("Cannot show products in state: " + currentState);
        }
    }

    public static void main(String[] args) {
        StatelessVending vending = new StatelessVending();
        vending.enterCoin();
        vending.showProducts();
        vending.selectProduct();
        vending.confirmSelection();
        vending.getChange();
        vending.resetToIdle();
    }

}