public class User implements Observer {

    void scheduleChange() {
        System.out.println("The schedule was just changed!");
    }

    void availabilityChange() {
        System.out.println("The availability was just changed!");
    }

    @Override
    public void update(String update) {

        switch (update) {
            case "SCHED_CHANGE":
                scheduleChange();
                break;
            case "AVAIL_CHANGE":
                availabilityChange();
                break;
            default:
                break;
        }

    }

}
