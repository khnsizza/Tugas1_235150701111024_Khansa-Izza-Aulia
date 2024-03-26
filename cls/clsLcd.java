package cls;
import java.util.*;

public class clsLcd {

   private String Status;
   private int Volume; 
   private int Brightness;
   private String Cable;

   //construktor
    public clsLcd () {
    this.Status = "off";
    this.Volume = 50;
    this.Brightness = 50;
    this.Cable = "HDMI";

        
    }

    public void setTurnOff () {
        this.Status = "Off";
    }

    public void setTurnOn () {
        this.Status = "On";
    }

    public void setFreeze () {
        this.Status = "Freeze";
    }

    public void setVolumeUp () {
        this.Volume++;
    }

    public void setVolumeDown () {
        this.Volume--;
    }
    public void setVolume (int Volume){
        this.Volume = Volume;
    }

    public void setbrightnessUp (){
        this.Brightness++;
    }

    public void setbrightnessDown () {
        this.Brightness--;
    }

    public void setbrightness (int Brightness){
        this.Brightness = Brightness;
    }

    public void setCable (String Cable){
        switch (Cable) {
            case "VGA":
                this.Cable = "VGA";
            break;
            case "DVI":
                this.Cable = "DVI";
            break;
            case "HDMI":
                this.Cable = "HDMI";
            break;
            case "DisplayPort":
                this.Cable = "DisplayPort";
            break;
        
            default:
               System.out.println("Kabel tidak valid");
        }
       
    }

    public void display(){
        System.out.println("LCD Status : " + this.Status);
        System.out.println("Volume: " + this.Volume);
        System.out.println("Brightness: " + this.Brightness);
        System.out.println("Cable: " + this.Cable);
    }








}