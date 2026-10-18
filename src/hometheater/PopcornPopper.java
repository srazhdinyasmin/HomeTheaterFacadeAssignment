
package hometheater;

public class PopcornPopper {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Popcorn Popper is ON.");
    }

    public void pop() {
        if (!isOn) {
            throw new IllegalStateException(
                    "Turn on the popcorn popper first."
            );
        }

        System.out.println("Popcorn is ready!");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Popcorn Popper is OFF.");
    }
}
