import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumOfEach {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\NadiaCaspa\\Idea-projects\\homeWork3\\data.txt");
        try {
            Scanner scan = new Scanner(f1);
            //this i s all in the try block
            while (scan.hasNext()) ;
            String s1 = scan.nextLine();
            String s2 = s1.replace(",", "");
            String[] s3 = s2.split("");
            int max = Integer.parseInt(s3[2]);

            int i;
            for (i = 3; i < s3.length; i++) ;
            int num = Integer.parseInt(s3[i]);
            if(num>max){
                max = num;
            }
            System.out.println(s3[0] + s3[1] + "\t" + "max: " + max);

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
