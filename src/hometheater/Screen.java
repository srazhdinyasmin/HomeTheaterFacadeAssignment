
package hometheater;

public class Screen {
    private boolean isDown;

    public void lower() {
        if (!isDown) {
            isDown = true;
            System.out.println("Screen is lowered.");
        }
    }

    public void raise() {
        if (isDown) {
            isDown = false;
            System.out.println("Screen is raised.");
        }
    }
}
