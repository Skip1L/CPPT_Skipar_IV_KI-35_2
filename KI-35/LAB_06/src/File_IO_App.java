import KI35.Skipar.Lab6.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class File_IO_App {

    public static void main(String[] args) {
        try {
            File_IO file_io = new File_IO();
            /*out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();*/
            double deg_txt = file_io.readResTxt("txt.txt");
            double deg_bin = file_io.readResBin("bin.bin");
            try {
                try {
                    Equations equations = new Equations();
                    file_io.writeResTxt("result.txt",
                            equations.calculate(deg_txt));
                    file_io.writeResBin("result.bin",
                            equations.calculate(deg_bin));
                } finally {
                    out.print("End program\n");
                }
            }
            catch (ArithmeticException e) {
                out.print(e.getMessage());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
