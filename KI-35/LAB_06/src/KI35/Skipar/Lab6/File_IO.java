package KI35.Skipar.Lab6;

import java.io.*;

/**
 *  Class <code>File_IO</code> implements input and output to .bin a .txt files
 *  @author Illia
 *  @version 1.0
 */
public class File_IO {

    private FileInputStream in;
    private BufferedInputStream bin;
    private FileOutputStream out;
    private BufferedOutputStream bout;

    /**
     * Method for writing result to .txt files
     * @param fName file name
     * @param res result
     * @throws IOException input/output exception
     */
    public void writeResTxt(String fName, double res) throws IOException {
        out = new FileOutputStream(fName);
        bout = new BufferedOutputStream(out);
        bout.write(String.valueOf(res).getBytes());
        bout.flush();
        bout.close();
        out.close();
    }

    /**
     * Method for reading value from .txt files
     * @param fName file name
     * @return values from file
     * @throws FileNotFoundException when can't found file
     */
    public double readResTxt(String fName) throws FileNotFoundException {
        String num = "";
        var i = 0;
        try {
            /*FileInputStream in = new FileInputStream(fName);*/
            in = new FileInputStream(fName);
            bin = new BufferedInputStream(in);
            while(( i = bin.read())!=-1) {
                num += (char) i;
            }
            bin.close();
            in.close();
            assert num != null;
            return Double.parseDouble(num);
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    /**
     * Method for writing result to .bin files
     * @param fName file name
     * @param res result
     * @throws IOException input/output exception
     */
    public void writeResBin(String fName, double res) throws IOException
    {
        out = new FileOutputStream(fName);
        bout = new BufferedOutputStream(out);
        DataOutputStream dot = new DataOutputStream(bout);
        dot.write(String.valueOf(res).getBytes());
        dot.flush();
        dot.close();
        bout.close();
        out.close();
    }

    /**
     * Method for reading value from .bin files
     * @param fName file name
     * @return result
     * @throws IOException input/output exception
     */
    public double readResBin(String fName) throws IOException
    {
        String num = "";
        try {
            in = new FileInputStream(fName);
            bin = new BufferedInputStream(in);
            DataInputStream din = new DataInputStream(bin);
            int count = din.available();
            byte[] ary = new byte[count];
            din.read(ary);
            for (byte bt : ary) {
                char k = (char) bt;
                num += k;
            }
            return Double.parseDouble(num);
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
        return 0;
    }
}
