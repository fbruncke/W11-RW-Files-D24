import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String testData = "A rose is a rose is like a rose100rose";

        Scanner sc = new Scanner(testData).useDelimiter("rose");

        String data = sc.next();
        String data2 = sc.next();

        int dataNo = 0;
        while(sc.hasNext()) {
            if(sc.hasNextInt())
                dataNo = sc.nextInt();
            else
                sc.next();
        }

        System.out.println("Data:" + data);
        System.out.println("Data2:" + data2);
        System.out.println("DataNo:" + dataNo);



    }

    public static void write()
    {
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter("calories.txt");
            pw.println("Cola 200 calories");
            pw.println("Milk 100 calories");
            pw.println("Beer 150 calories");
            pw.println("Wine 400 calories");

        }
        catch ( FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            pw.close();
        }

    }

}