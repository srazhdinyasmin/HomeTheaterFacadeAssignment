
package hometheater;

public class DvdPlayer {
    private boolean isOn;
    private boolean isPlaying;
    private String currentMovie;

    public void turnOn() {
        isOn = true;
        System.out.println("DVD Player is ON.");
    }

    public void play(String movie) {
        if (!isOn) {
            throw new IllegalStateException(
                    "Turn on the DVD player first."
            );
        }

        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie title cannot be empty."
            );
        }

        if (isPlaying) {
            throw new IllegalStateException(
                    "A movie is already playing."
            );
        }

        currentMovie = movie;
        isPlaying = true;
        System.out.println("Playing: " + movie);
    }

    public void stop() {
        if (isPlaying) {
            System.out.println(
                    "Stopped: " + currentMovie
            );
            isPlaying = false;
            currentMovie = null;
        }
    }

    public void turnOff() {
        stop();
        isOn = false;
        System.out.println("DVD Player is OFF.");
    }
}
