
package hometheater;

public class Lights {
    private int brightness = 100;

    public void setBrightness(int level) {
        if (level < 0 || level > 100) {
            throw new IllegalArgumentException(
                    "Brightness must be between 0 and 100."
            );
        }

        brightness = level;
        System.out.println(
                "Lights brightness: " + brightness + "%"
        );
    }

    public void dim() {
        setBrightness(20);
    }

    public void restore() {
        setBrightness(100);
    }
}
