import java.util.*;
public class Main {
     public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printpattern(n);
    }
     public static void printpattern(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printpattern(n-1);
        System.out.print(n + " ");
        printpattern(n-1);
        System.out.print(n + " ");
    }
}
