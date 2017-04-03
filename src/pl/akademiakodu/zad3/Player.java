package pl.akademiakodu.zad3;

/**
 * Created by Moody on 2017-03-14.
 */
public class Player {

    private String name;
    private String username;
    private int points;


    public Player(String name, String username, int points) {
        this.name = name;
        this.username = username;
        this.points = points;
    }



    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getFullName(){
        return name + " " + username;
    }
}
