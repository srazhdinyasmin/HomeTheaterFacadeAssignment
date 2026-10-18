
package hometheater;

public class Amplifier {
    private boolean isOn;
    private int volume;

    public void turnOn() {
        isOn = true;
        System.out.println("Amplifier is ON.");
    }

    public void setVolume(int volume) {
        if (!isOn) {
            throw new IllegalStateException(
                    "Turn on the amplifier first."
            );
        }

        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException(
                    "Volume must be between 0 and 100."
            );
        }

        this.volume = volume;
        System.out.println("Volume set to " + volume);
    }

    public void turnOff() {
        isOn = false;
        volume = 0;
        System.out.println("Amplifier is OFF.");
    }
}
