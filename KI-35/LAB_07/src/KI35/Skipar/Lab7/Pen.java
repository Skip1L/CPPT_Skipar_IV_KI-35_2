package KI35.Skipar.Lab7;

/**
 * Class <code>Pen</code> implement pen
 */
public class Pen implements IStationery{

    private String brand;
    private final int writeLength;
    private String type;

    /**
     * Constructor with parameters
     * @param brand brand
     * @param writeLength write length
     * @param type type of pen
     */
    public Pen(String brand, int writeLength, String type) {
        this.brand = brand;
        this.writeLength = writeLength;
        this.type = type;
    }

    /**
     * Get brand
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set brand
     * @param brand pen brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Set type
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get write length
     * @return write length
     */
    @Override
    public int getWriteLength() {
        return writeLength;
    }

    /**
     * Print info about pen
     */
    @Override
    public void print() {
        System.out.print("Pen brand: " + brand + ", Write length: " +
                writeLength + ", Type: " + type + "\n");
    }

    /**
     * Compare 2 pen
     * @param o the object to be compared.
     * @return the value 0 if this writes length is equal to the argument write length;
     * a value less than 0 if this writes length is numerically less than the argument writes length;
     * and a value greater than 0 if this writes length is numerically greater than the argument writes length
     */
    @Override
    public int compareTo(IStationery o) {
        Integer wl = writeLength;
        return wl.compareTo(o.getWriteLength());
    }
}
