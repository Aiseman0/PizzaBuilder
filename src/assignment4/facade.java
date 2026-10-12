package assignment4;

public class facade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;

    public facade(Amplifier amp, DvdPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("--- Preparing to watch a movie ---");
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        System.out.println("Movie session started! Enjoy watching.");
    }

    public void endMovie() {
        System.out.println("\n--- Shutting down home theater ---");
        dvd.off();
        amp.off();
        projector.off();
        System.out.println("All systems are shut down.");
    }
}