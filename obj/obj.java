package obj;
import java.util.*;
import cls.clsLcd;

public class obj {
    public static void main(String[] args) {
        clsLcd lcdBaru = new clsLcd();


        lcdBaru.setTurnOn();
        lcdBaru.setVolume(50);
        lcdBaru.setVolumeUp();
        lcdBaru.setVolumeDown();
        lcdBaru.setFreeze();
        lcdBaru.setbrightness(50);
        lcdBaru.setbrightnessDown();
        lcdBaru.setbrightnessUp();
        lcdBaru.setCable("HDMI");

        lcdBaru.display();





    }
}
