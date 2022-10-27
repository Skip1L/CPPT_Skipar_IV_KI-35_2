import KI35.Skipar.Lab7.*;

public class PenCaseApp {

    public static void main(String[] args) {

        PenCase<? super IStationery> penCase = new PenCase<IStationery>();
        penCase.addStationery(new Pencil("Sanford", 800, "H1"));
        penCase.addStationery(new Pen("Skipar", 900, "Ballpoint"));
        penCase.addStationery(new Pencil("Gilbert", 901, "B2"));
        penCase.addStationery(new Pen("Parker", 1000, "Gel"));
        IStationery res = penCase.findMin();
        System.out.print("\nMin: ");
        res.print();
        System.out.print("\nCount of stationery: "+penCase.getCount());
    }

}
