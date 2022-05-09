import java.io.*;
import java.util.Scanner;

class Prac21 {
    public static void main(String[] args) 
    {

        try 
        {
            File file = new File("123.txt");
            FileOutputStream fStream = new FileOutputStream(file,true);
            PrintWriter pWriter = new PrintWriter(fStream, true);
            for (int i = 0; i < 150; i++) 
            {
                pWriter.append((int) (Math.random() * 150) + " ");
            }
            pWriter.println("");
            pWriter.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}