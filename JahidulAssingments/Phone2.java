package JahidulAssingments;

public class Phone2 {

    public static void main(String[] args) {
Phone2 obj = new Phone2();
obj.makeCall("0123456789");
obj.sendText("Danish");

        //sendText("Hello");
        //makeCall("0123456789");

    }
    public void sendText(String message){
        System.out.println(message);
    }
    public void makeCall(String number){
        System.out.println(number);

    }
}