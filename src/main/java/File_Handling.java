import java.io.*;

public class File_Handling {
    public static void main(String args[]) throws IOException {

        File f2 = new File("./Test2.txt");
        f2.createNewFile();

        FileWriter fw2 = new FileWriter(f2);
        fw2.write("shovishu@gmail.com");
        fw2.write("\n");
        fw2.write("Vishwajeet");
        fw2.write("\n");
        fw2.close();

        FileReader fr = new FileReader("./Test2.txt");
        BufferedReader br = new BufferedReader(fr);

        String str2;
        while ((str2=br.readLine())!=null)
        {
            System.out.println(str2);
        }
    }
}
