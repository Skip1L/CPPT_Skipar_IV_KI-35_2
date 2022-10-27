package KI35.Skipar.Lab7;

import java.util.ArrayList;

/**
 * Class <code>PenCase</code> implement pen-case
 * @param <T> type of stationery
 */
public class PenCase <T extends IStationery> {
    private final ArrayList<T> stationery;
    private static int count=0;

    /**
     * Default constructor
     */
    public PenCase() {
        stationery = new ArrayList<T>();
    }

    /**
     * Find element with minimal write length
     * @return element with minimal write length
     */
    public T findMin()
    {
        if (!stationery.isEmpty())
        {
            T min = stationery.get(0);
            for (T n : stationery) {
                if (n.compareTo(min) < 0) min = n;
            }
            return min;
        }
        return null;
    }

    /**
     * Add new stationery to pen-case
     * @param data type of stationery
     */
    public void addStationery(T data) {
        stationery.add(data);
        System.out.print("Stationery added: ");
        data.print();
        ++count;
    }

    /**
     * Delete element
     * @param i index of stationery
     */
    public void deleteStationery(int i) {
        stationery.remove(i);
        --count;
    }

    /**
     * Get count of stationery in pen-case
     * @return count of stationery
     */
    public int getCount()
    {
        return count;
    }
}
