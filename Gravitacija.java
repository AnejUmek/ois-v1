import java.util.*;
public class Gravitacija{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double v = sc.nextInt();
        System.out.println(gravitacija(v));
    }
    public static double gravitacija(double v){
        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);
        double a = C * M;
        double b = r + v;
        double izracun = a / (Math.pow(b, 2));
        return izracun;
    }
}