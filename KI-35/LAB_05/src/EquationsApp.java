import KI35.Skipar.Lab5.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class EquationsApp {

    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(fName);
            try {
                try {
                    Equations equations = new Equations();
                    out.print("Enter X: ");
                    fout.print(equations.calculate(in.nextDouble()));
                } finally {
                    fout.flush();
                    fout.close();
                    out.print("End program\n");
                }
            } catch (ArithmeticException e) {
                out.print(e.getMessage());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
