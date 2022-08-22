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
     *
     *
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
        for(int i = 0; i < nRows; i++)
        {
            arr[i]= new char[nRows];
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();


        exit:
        for(int i = 0; i < nRows; i++)
        {
            for(int j = 0; j < nRows; j++)
            {
                if(filler.length() == 1)
                {
                    if ((j < i+1 || j>nRows-2-i) && i<nRows/2+b)
                        arr[i][j] = (char) filler.codePointAt(0);
                    arr[i][j] = (arr[i][j] != '-') ? ' ' : arr[i][j];
                    arr[nRows - i - 1][j] = arr[i][j];
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
