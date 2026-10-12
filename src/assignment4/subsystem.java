package assignment4;

class Amplifier {
    public void on() {
        System.out.println("Amplifier is turned ON.");
    }
    public void setVolume(int level) {
        System.out.println("Amplifier volume set to level: " + level);
    }
    public void off() {
        System.out.println("Amplifier is turned OFF.");
    }
}

class DvdPlayer {
    public void on() {
        System.out.println("DVD Player is turned ON.");
    }
    public void play(String movie) {
        System.out.println("Playing movie: \"" + movie + "\".");
    }
    public void off() {
        System.out.println("DVD Player is turned OFF.");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is turned ON.");
    }
    public void wideScreenMode() {
        System.out.println("Projector set to widescreen mode (16:9).");
    }
    public void off() {
        System.out.println("Projector is turned OFF.");
    }
}