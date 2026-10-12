package assignment4;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();

        facade homeTheater = new facade(amp, dvd, projector);

        homeTheater.watchMovie("Harry Potter and the Half-Blood Prince");

        homeTheater.endMovie();
    }
}