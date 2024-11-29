package Stateful;

public class DispensingProducState implements VendingState {

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
        context.setState(new RefundingChangeState());
        System.out.println("Change refunded");
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
