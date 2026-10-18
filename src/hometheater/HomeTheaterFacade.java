
package hometheater;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;
    private final Lights lights;
    private final PopcornPopper popcornPopper;

    private boolean movieSessionActive;

    public HomeTheaterFacade() {
        amplifier = new Amplifier();
        dvdPlayer = new DvdPlayer();
        projector = new Projector();
        screen = new Screen();
        lights = new Lights();
        popcornPopper = new PopcornPopper();
    }

    public void watchMovie(String movie) {
        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie title cannot be empty."
            );
        }

        if (movieSessionActive) {
            throw new IllegalStateException(
                    "End the current movie first."
            );
        }

        System.out.println(
                "\n--- Preparing Home Theater ---"
        );

        popcornPopper.turnOn();
        popcornPopper.pop();
        popcornPopper.turnOff();

        lights.dim();
        screen.lower();

        projector.turnOn();
        projector.setInput("DVD");

        amplifier.turnOn();
        amplifier.setVolume(50);

        dvdPlayer.turnOn();
        dvdPlayer.play(movie);

        movieSessionActive = true;

        System.out.println(
                "--- Enjoy your movie! ---"
        );
    }

    public void endMovie() {
        if (!movieSessionActive) {
            throw new IllegalStateException(
                    "No movie session is active."
            );
        }

        System.out.println(
                "\n--- Shutting Down Home Theater ---"
        );

        dvdPlayer.stop();
        dvdPlayer.turnOff();

        amplifier.turnOff();
        projector.turnOff();

        screen.raise();
        lights.restore();

        movieSessionActive = false;

        System.out.println(
                "--- Home Theater is OFF ---"
        );
    }
}
