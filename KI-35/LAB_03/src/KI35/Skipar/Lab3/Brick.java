package KI35.Skipar.Lab3;

/**
 * Class <code>Brick</code> implement brick
 * @author Ілля
 * @version 1.0
 */
public class Brick {

    /**
     * Default constructor
     */
    public Brick() {
        height =  65;
        width  = 120;
        length = 250;
        count  =   0;
    }

    /**
     * Constructor
     *
     * @param l     brick length
     * @param w     brick width
     * @param h     brick height
     * @param c     count of bricks
     */
    public Brick(int l, int w, int h, int c) {
        height = h;
        width  = w;
        length = l;
        count = c;
    }

    /**
     * Method return count of bricks
     * @return count of bricks
     */
    public int getCount() {
        return count;
    }
    private int height;
    private int width;
    private int length;
    private int count;

}
