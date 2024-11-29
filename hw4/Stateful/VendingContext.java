package Stateful;

public class VendingContext {

    VendingState state;

    public VendingContext() {
        state = null;
    }

    public void setState(VendingState state) {
        this.state = state;
    }

    void enterCoin() {
        state.enterCoin(this);
    };

    void showProducts() {
        state.showProducts(this);
    };

    void selectProduct() {
        state.selectProduct(this);
    };

    void confirmSelection() {
        state.confirmSelection(this);
    };

    void getChange() {
        state.getChange(this);
    };

    void resetToIdle() {
        state.resetToIdle(this);
    };

    void cancel() {
        state.cancel(this);
    };

}
