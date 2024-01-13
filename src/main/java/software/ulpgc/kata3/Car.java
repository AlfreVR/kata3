package software.ulpgc.kata3;

public class Car {
    private final String model;
    private final double mpg;
    private final int cyl;
    private final double disp;
    private final int hp;
    private final double drat;
    private final double wt;
    private final double qsec;
    private final int vs;
    private final int am;
    private final int gear;
    private final int carb;

    public Car(String model, double mpg, int cyl, double disp, int hp, double drat, double wt, double qsec, int vs, int am, int gear, int carb) {
        this.model = model;
        this.mpg = mpg;
        this.cyl = cyl;
        this.disp = disp;
        this.hp = hp;
        this.drat = drat;
        this.wt = wt;
        this.qsec = qsec;
        this.vs = vs;
        this.am = am;
        this.gear = gear;
        this.carb = carb;
    }


    public int getHp() {
        return hp;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mpg=" + mpg +
                ", cyl=" + cyl +
                ", disp=" + disp +
                ", hp=" + hp +
                ", drat=" + drat +
                ", wt=" + wt +
                ", qsec=" + qsec +
                ", vs=" + vs +
                ", am=" + am +
                ", gear=" + gear +
                ", carb=" + carb +
                '}';
    }
}
