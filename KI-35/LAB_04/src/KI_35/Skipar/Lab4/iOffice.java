package KI_35.Skipar.Lab4;

/**
 * Office interface
 */
public interface iOffice {
    /**
     * Normal area for 1 person
     */
    static final long  AREA_FOR_PERSON = 6000000;
    /**
     * Normal floor height
     */
    static final long  FLOOR_HEIGHT = 3000;

    /**
     * Method which calculate normal count of employees
     * @return normal count of employees
     */
    long NormalEmployeesCount();
}
