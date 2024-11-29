package Stateful;

public class DisplayingProductState implements VendingState {

    @Override
    public void enterCoin(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterCoin'");
    }

    @Override
    public void showProducts(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showProducts'");
    }

    @Override
    public void selectProduct(VendingContext context) {
        // TODO Auto-generated method stub
        context.setState(new WaitSelectionState());
        System.out.println("Product selected");
    }

    @Override
    public void confirmSelection(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmSelection'");
    }

    @Override
    public void getChange(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void resetToIdle(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetToIdle'");
    }

    @Override
    public void cancel(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancel'");
    }

}
