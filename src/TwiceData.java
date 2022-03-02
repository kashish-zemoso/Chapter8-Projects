import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {

    public static void main(String[] args) {

        Scanner numsFile;
        PrintWriter pw;

        try {
            numsFile = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");

            int num;
            while(numsFile.hasNext()){
                num = numsFile.nextInt();
                pw.println("Twice of " + num + " is " + 2*num);
            }
            numsFile.close();
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
