import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("kashish");
        names.add("Shivani");
        names.add("Shaheen");
        names.add("Parth");
        names.add("Krish");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for(String name : names){
                pw.println(name);
            }

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cant write to file");
        }
    }
}
