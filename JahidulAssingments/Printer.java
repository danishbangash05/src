package JahidulAssingments;

import java.sql.PreparedStatement;

public class Printer {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.Connect();
        obj.PrintPaper("Danish", "Bangash", 100);
    }
    public void Connect(){
        System.out.println("Connect through wifi");
    }
    public void PrintPaper(String FirstName, String LastName, Integer id){
        System.out.println(FirstName + " " + LastName + " " + id);
    }
}
