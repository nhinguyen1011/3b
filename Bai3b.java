import java.util.Scanner;
public class Bai3b{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int  k=0;
        System.out.println("enter the high:  ");
        int high = scan.nextInt();
        for(int i=1;i<= high;i++){
            for(int space=1;space<=high-i;space++){
                String x = "  ";
                System.out.println(x);
            }
        while(k!=2*high-1){
            System.out.println("*");
            k++;
        }
      System.out.println();
    }
 
    }
}