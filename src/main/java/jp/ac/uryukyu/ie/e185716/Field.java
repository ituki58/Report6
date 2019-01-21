package jp.ac.uryukyu.ie.e185716;

import java.util.ArrayList;
import java.util.List;

//盤面を扱うためのクラス
public class Field{
    private List<Disc> Disclist;
    private int ynum = 0;
    private int xnum = 0;

    public Field(int xnum, int ynum){
        this.xnum = xnum;
        this.ynum = ynum;
    }
    public void prepare(){
        this.Disclist = new ArrayList<>();
        for(int y=0;y<this.ynum;y++){
            for(int x=0;x<this.xnum;x++){
                Disc disc = new Disc(x,y);
                this.Disclist.add(disc);
            }
        }
    }

    public Disc getDisc(int y, int x){
        for(Disc disc : this.Disclist){
            int[]pos = disc.getPosition();
            if(pos[0]==y && pos[1]==x){
                return disc;
            }
        }
        return null;
    }

    public void setDisc(int x, int y, String state){
        Disc disc = this.getDisc(x,y);
        disc.setState(state);
    }

    public void output(){
        String [][] board = new String[ynum][xnum];
        for(Disc disc : this.Disclist){
            int[] pos = disc.getPosition();
            String state = disc.getState();
            board[pos[1]][pos[0]] = state;
        }
        System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8");
        for(int y=1;y<board.length;y++){
            System.out.print(y+"\t");
            for(int x=1;x<board[0].length;x++){
                String b = board[y][x];
                System.out.print(b+"\t");
            }
            System.out.println("\n");
        }
    }
}