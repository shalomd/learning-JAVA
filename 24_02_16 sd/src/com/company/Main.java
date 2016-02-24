package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("sqrt 15 = "+ sqrt(90));
    }
    public static double sqrt(double x){
        double root = 0;
        double s = 1.0;
        double nextResult;
            while ((root *root) <x ) {
                nextResult = root+s;
                if ((nextResult  * nextResult ) > x) {
                    s /= 10;
                    if (s < 0.00001)
                        break;
                }
                root += s;
            }
        return root;
    }
}
