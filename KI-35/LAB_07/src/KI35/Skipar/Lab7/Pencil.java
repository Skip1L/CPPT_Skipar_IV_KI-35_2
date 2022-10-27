package KI35.Skipar.Lab7;

/**
 * Class <code>Pencil</code> implement pencil
 */
public class Pencil implements IStationery{

    private String brand;
    private final int writeLength;
    private String hardness;

    /**
     * Constructor with parameters
     * @param brand brand
     * @param writeLength write length
     * @param hardness hardness type
     */
    public Pencil(String brand, int writeLength, String hardness) {
        this.brand = brand;
        this.writeLength = writeLength;
        this.hardness = hardness;
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
     * @param brand brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get hardness
     * @return hardness
     */
    public String getHardness() {
        return hardness;
    }

    /**
     * Set hardness
     * @param hardness hardness
     */
    public void setHardness(String hardness) {
        this.hardness = hardness;
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
     * Print info about pencil
     */
    @Override
    public void print() {
        System.out.print("Pencil brand: " + brand + ", Write length: " +
                writeLength + ", Hardness: " + hardness + "\n");
    }

    /**
     * Compare 2 pencil
     * @param o the object to be compared.
     * @return
     * the value 0 if this writes length is equal to the argument write length;
     * a value less than 0 if this writes length is numerically less than the argument writes length;
     * and a value greater than 0 if this writes length is numerically greater than the argument writes length
     */
    @Override
    public int compareTo(IStationery o) {
        Integer wl = writeLength;
        return wl.compareTo(o.getWriteLength());
    }
}
