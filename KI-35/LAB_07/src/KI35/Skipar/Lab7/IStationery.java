package KI35.Skipar.Lab7;

/**
 * Interface <code>IStationery</code> implement stationery
 */
public interface IStationery extends Comparable<IStationery>{
    /**
     * Get write length
     * @return write length
     */
    int getWriteLength();

    /**
     * Print info
     */
    void print();
}
