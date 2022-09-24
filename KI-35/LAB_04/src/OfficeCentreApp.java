import KI_35.Skipar.Lab4.*;

import java.io.FileNotFoundException;

public class OfficeCentreApp {


    public static void main(String[] args) throws FileNotFoundException{
        OfficeCentre MyOffice = new OfficeCentre();
        System.out.print("Emp:"+MyOffice.getCitizens()+"\nBC: "+MyOffice.get_brick_count()+"\nBL: "+MyOffice.get_brick_length()+"\nBW: "+MyOffice.get_brick_width()+"\nBH: "+MyOffice.get_brick_height()+"\nD: "+MyOffice.get_door()+"\nW: "+MyOffice.get_window()+"\nNorm: "+MyOffice.NormalEmployeesCount());
        MyOffice.set_brick(65,150,300, 15000);
        MyOffice.setCitizens(1500);
        MyOffice.set_door(4);
        MyOffice.set_window(20);
        System.out.print("\n\n\nEmp:"+MyOffice.getCitizens()+"\nBC: "+MyOffice.get_brick_count()+"\nBL: "+MyOffice.get_brick_length()+"\nBW: "+MyOffice.get_brick_width()+"\nBH: "+MyOffice.get_brick_height()+"\nD: "+MyOffice.get_door()+"\nW: "+MyOffice.get_window()+"\nNorm: "+MyOffice.NormalEmployeesCount());
    }
}
