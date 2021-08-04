package JahidulAssingments;

import java.io.File;
public class Directory {

    public static void main(String args[])
    {
        String dir = "C:\\Users\\Farhan\\Desktop\\Danish\\Java_Workspace\\Directory";
        File file = new File(dir);
        boolean isFileCreate = file.mkdirs();
        if (isFileCreate == true)
        {
            System.out.println("New Folder is Created");
        }
        else
        {
            System.out.println("New Folder is not Created");
        }
    }
}
