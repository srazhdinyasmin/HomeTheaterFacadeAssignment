
package hometheater;

public class Projector {
    private boolean isOn;
    private String inputSource;

    public void turnOn() {
        isOn = true;
        System.out.println("Projector is ON.");
    }

    public void setInput(String source) {
        if (!isOn) {
            throw new IllegalStateException(
                    "Turn on the projector first."
            );
        }

        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException(
                    "Input source cannot be empty."
            );
        }

        inputSource = source;
        System.out.println(
                "Projector input: " + inputSource
        );
    }

    public void turnOff() {
        isOn = false;
        inputSource = null;
        System.out.println("Projector is OFF.");
    }
}
