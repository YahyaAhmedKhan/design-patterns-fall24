public class AnalogClock implements Observer {

    int hour;
    int minute;
    int second;

    void draw() {
        // prints the analog time
        String s = String.format("Analog time is: %d:%d:%d ", hour, minute, second);
        System.out.println(s);
    }

    @Override
    public void update(Subject subject) {
        // updates the time and calls the draw method
        String state = subject.getState();
        String[] times = state.split(",");

        hour = Integer.parseInt(times[0]);
        minute = Integer.parseInt(times[1]);
        second = Integer.parseInt(times[2]);

        draw();
    }
}
