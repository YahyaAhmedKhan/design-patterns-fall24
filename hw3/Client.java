public class Client {

    public static void main(String[] args) throws InterruptedException {

        ClockTimer ct = new ClockTimer();
        DigitalClock d = new DigitalClock();
        AnalogClock a = new AnalogClock();

        ct.attach(d); // attaching the digital clock
        ct.attach(a); // attaching the analog clock

        for (int i = 0; i < 10; i++) {
            ct.tick();
            Thread.sleep(1000);

            if (i == 4)
                ct.detach(d); // detaching the digital clock after 5 seconds
        }
    }

}