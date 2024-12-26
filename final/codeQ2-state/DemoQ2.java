public class DemoQ2 {
    public static void main(String[] args) {
        ShipmentContext shipmentContext = new ShipmentContext();
        shipmentContext.transition("XYZ");

        // shipmentContext.transition("CANCEL");
        shipmentContext.transition("PICK");
        shipmentContext.transition("OUT_FOR_DELIVERY");
        // shipmentContext.transition("CANCEL");
        shipmentContext.transition("DELIVER");
    }

}
