package jp.ac.uryukyu.ie.e185716;

public class Disc{
    private String state;
    private int x;
    private int y;

    public Disc(int x,int y){
        this.state = "E";
        this.x = x;
        this.y = y;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int[] getPosition(){
        int[]pos = {this.x, this.y};
        return pos;
    }
}