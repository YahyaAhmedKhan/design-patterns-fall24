import java.util.Scanner;

// Define the State interface
interface VendingMachineState {
    void handleRequest(VendingMachine context, String input);
}

// Concrete State: Idle
class IdleState implements VendingMachineState {
    @Override
    public void handleRequest(VendingMachine context, String input) {
        System.out.println("Idle State: Please select an item.");
        if (!input.isEmpty()) {
            System.out.println("Item '" + input + "' selected.");
            context.setState(new AcceptingMoneyState(input));
        }
    }
}

// Concrete State: Accepting Money
class AcceptingMoneyState implements VendingMachineState {
    private final String selectedItem;

    public AcceptingMoneyState(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    @Override
    public void handleRequest(VendingMachine context, String input) {
        System.out.println("Accepting Money State: Insert money for '" + selectedItem + "'.");
        try {
            double moneyInserted = Double.parseDouble(input);
            if (moneyInserted >= 1.5) { // Assume all items cost $1.5
                System.out.println("Sufficient money inserted. Dispensing item...");
                context.setState(new DispensingItemState(selectedItem));
            } else {
                System.out.println("Insufficient money. Please insert more.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please insert money.");
        }
    }
}

// Concrete State: Dispensing Item
class DispensingItemState implements VendingMachineState {
    private final String selectedItem;

    public DispensingItemState(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    @Override
    public void handleRequest(VendingMachine context, String input) {
        System.out.println("Dispensing Item State: Enjoy your '" + selectedItem + "'.");
        System.out.println("Returning to Idle State...");
        context.setState(new IdleState());
    }
}

// Context Class
class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        this.currentState = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void processInput(String input) {
        currentState.handleRequest(this, input);
    }
}

// Main Class to Demonstrate the Pattern
public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vending Machine Initialized. Enter inputs to interact.");
        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();
            vendingMachine.processInput(input);
        }
    }
}
