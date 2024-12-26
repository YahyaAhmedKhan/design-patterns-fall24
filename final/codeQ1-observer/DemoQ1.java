public class DemoQ1 {

    public static void main(String[] args) {
        Webinar webinar = new Webinar();
        User user1 = new User();
        User user2 = new User();

        webinar.changeAvailability();
        ;

        webinar.registerObserver(user2);

        webinar.changeAvailability();
        webinar.changeSchedule();

        webinar.registerObserver(user1);

        webinar.changeAvailability();

        webinar.removeObserver(user2);

        webinar.changeSchedule();

    }
}