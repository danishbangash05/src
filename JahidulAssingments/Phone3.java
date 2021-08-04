package JahidulAssingments;

public class Phone3 {

    public static void main(String[] args) {

        sendText("Hello");

        Phone3 obj = new Phone3();
        obj.makeCall("0123456789");

    }
    public static void sendText(String message){
        System.out.println(message);
    }
    public static void makeCall(String number){
        System.out.println(number);

    }
}
