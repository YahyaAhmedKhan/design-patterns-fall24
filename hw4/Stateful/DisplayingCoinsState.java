package Stateful;

public class DisplayingCoinsState implements VendingState {

    @Override
    public void enterCoin(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterCoin'");
    }

    @Override
    public void showProducts(VendingContext context) {
        // TODO Auto-generated method stub
        context.setState(new DisplayingProductState());
        System.out.println("Products displayed");
    }

    @Override
    public void selectProduct(VendingContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
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
