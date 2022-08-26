import java.io.*;
import java.util.*;

/**
 * Клас Lab_02_Skipar реалізує приклад програми до лабораторної роботи №2
 *
 * @author skip1l
 * @version 1.0
 * @since version 1.0
 *
 */


public class LAB_02_Skipar {
    /**
     * Статичний метод main є точкою входу в програму
     * @param args const args
     * @throws FileNotFoundException check file existing
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        int nRows;
        char[][] arr;
        int b;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        b = nRows%2;

        arr = new char[nRows][];

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        exit:
        for(int i = 0; i < nRows; i++)
        {
            if (i<nRows/2+b)
                arr[i] = (i+1)*2<=nRows?new char[(i+1)*2]:new char[(i+1)*2-1];
            else arr[i] = arr[nRows-i-1];

            for(int j = 0; j < arr[i].length; j++)
            {
                if(filler.length() == 1)
                {
                    arr[i][j] = (char) filler.codePointAt(0);
                    for (int k = 0; k<nRows-arr[i].length && j==arr[i].length/2; k++) {
                        System.out.print("  ");
                        fout.print("  ");
                    }
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
                else if (filler.length() == 0)
                {
                    System.out.print("\nНе  введено  символ заповнювач");
                    break exit;
                }
                else
                {
                    System.out.print("\nЗабагато  символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();

    }
}
