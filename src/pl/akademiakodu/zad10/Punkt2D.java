package pl.akademiakodu.zad10;

/**
 * Created by Moody on 2017-03-15.
 */
public class Punkt2D {
    private  int x;
    private  int y;

    public Punkt2D(){
        x=0;
        y=0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
