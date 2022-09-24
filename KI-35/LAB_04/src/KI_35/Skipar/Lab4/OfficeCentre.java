package KI_35.Skipar.Lab4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class <code>OfficeCentre</code> implement office centre
 * @author Ілля
 * @version 4.0
 */
public class OfficeCentre extends House implements iOffice {

    /**
     * Default constructor <code>OfficeCentre</code>
     * @throws FileNotFoundException Not found log-file
     */
    public OfficeCentre() throws FileNotFoundException {
        super();
    }

    /**
     * Constructor <code>OfficeCentre</code>
     * @param employees count of citizens in the house
     * @param br_length brick length
     * @param br_width brick width
     * @param br_height brick height
     * @param br_count count of bricks
     * @param dr_count count of doors
     * @param wd_count count of windows
     * @throws FileNotFoundException Not found log-file
     */
    public OfficeCentre(int employees, int br_length, int br_width, int br_height, int br_count, int dr_count, int wd_count) throws FileNotFoundException {
        super(employees,  br_length,  br_width,  br_height,  br_count, dr_count, wd_count);
    }

    /**
     * Method which calculate normal count of employees
     * @return normal count of employees
     */
    @Override
    public long NormalEmployeesCount() {
        return (long) ((Math.pow(get_brick_count()*get_brick_height()*get_brick_length()/FLOOR_HEIGHT, 2)/16)/AREA_FOR_PERSON);
    }

    /**
     * Override method from <code>House</code>
     * @param citizens count of citizens in the house
     * @throws FileNotFoundException Not found log-file
     */
    @Override
    public void setCitizens(int citizens) throws FileNotFoundException {
        if (super.getCitizens()<citizens)
            super.fout.print(citizens-super.getCitizens() + " new employees in the office\n");
        else fout.print(super.getCitizens()-citizens + " employees leave the office\n");
        this.citizens = citizens;
        fout.flush();
    }
}
