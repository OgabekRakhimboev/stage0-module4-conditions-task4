package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String [] args){
        printGreatest(1, 2, 3);
    }
    public static void printGreatest(int first, int second, int third) {
        System.out.println(first>=second?(first>=third?first:third):second>=third?second:third);
    }
}
