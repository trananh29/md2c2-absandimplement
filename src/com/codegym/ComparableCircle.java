package com.codegym;


import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable <ComparableCircle> {
    public ComparableCircle(){
    }
    public ComparableCircle (double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String colour, boolean filled){
        super(radius,colour,filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius()<o.getRadius()) return  -1;
        else return 0;
    }

    public static void main(String[] args) {
        ComparableCircle[] com1= new ComparableCircle[3];
        com1[0]=new ComparableCircle(3.6);
        com1[1]=new ComparableCircle();
        com1[2]=new ComparableCircle(3.5,"yellow", false);
        System.out.println("Pre sorted");
        for (ComparableCircle c1: com1) {
            System.out.println(c1);
        }
        Arrays.sort(com1);
        System.out.println("sorted");
        for (ComparableCircle c2: com1) {
            System.out.println(c2);
        }
    }
}
