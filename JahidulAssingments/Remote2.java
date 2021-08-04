package JahidulAssingments;

public class Remote2 {
    public static void main(String[] args) {

        Remote2 obj = new Remote2();
        obj.ChangeChannel();
        VolumeDown();
        VolumeUp();
        VolumeMute();
    }
    public void ChangeChannel(){
        System.out.println("When press on Channel up, the channel will change upwards");
        System.out.println("When press on Channel down, the channel will change downards");
    }
    public static void VolumeUp(){
        System.out.println("When click on +, the volume of the tv will increase");
        System.out.println("Volume of the tv is increasing");
    }
    public static void VolumeDown(){
        System.out.println("When click on the -, the volume of the tv will decrease");
        System.out.println("Volume of the tv is decreasing");
    }
    public static void VolumeMute(){
        System.out.println("When click on the x, the volume of the tv will mute");
        System.out.println("Volume of the tv is muted");
    }
}