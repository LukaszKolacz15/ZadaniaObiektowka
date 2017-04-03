package pl.akademiakodu.zad10;

/**
 * Created by Moody on 2017-03-15.
 */
public class Punkt3D extends Punkt2D{
    private int z;

    public Punkt3D(int z) {
        super();
        this.z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public void setZ(int Z){
        this.z = z;
    }
}
