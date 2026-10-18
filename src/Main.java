package hometheater;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade();

        try {
            homeTheater.watchMovie("Interstellar");
            homeTheater.endMovie();
        } catch (IllegalArgumentException |
                 IllegalStateException exception) {
            System.err.println(
                    "Error: " + exception.getMessage()
            );
        }
    }
}
