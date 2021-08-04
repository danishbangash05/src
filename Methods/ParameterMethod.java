package Methods;

public class ParameterMethod {
    public static void main(String[] args) {
        //here for the first method we have to create an object
        // for the second method we dont have to because it is in static
        ParameterMethod obj = new ParameterMethod();
        obj.SendMessage();
        ReceivedMessage("Danish", "Bangash");

    }
    public void SendMessage(){
        System.out.println("Sending message.....");
    }
    public static void ReceivedMessage(String firstname, String lastname){
        System.out.println(firstname + " " + lastname);
    }
}
