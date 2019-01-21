package jp.ac.uryukyu.ie.e185716;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Field field = new Field(9,9);
        field.prepare();
        //オセロの黒石、白石を最初の場所に配置する。
        field.setDisc(4,4,"W"); //W: 白石
        field.setDisc(4,5,"B"); //B: 黒石
        field.setDisc(5,4,"B");
        field.setDisc(5,5,"W");
        field.output();
    }
}