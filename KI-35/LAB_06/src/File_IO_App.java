import KI35.Skipar.Lab6.Equations;
import KI35.Skipar.Lab6.File_IO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import static java.lang.System.out;

public class File_IO_App {

    public static void main(String[] args) {
        try {
            File_IO file_io = new File_IO();
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            double deg_txt = file_io.readResTxt(fName+".txt");
            /*file_io.writeResBin("file.bin", 44);*/
            double deg_bin = file_io.readResBin(fName+".bin");
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
            out.println(deg_txt);
            out.println(file_io.readResTxt("result.txt"));
            out.println(deg_bin);
            out.println(file_io.readResBin("result.bin"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
