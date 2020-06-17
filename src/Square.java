import java.util.Scanner;

public class Square {
    public static void main(String[] args){
Scanner one = new Scanner(System.in);
System.out.println("enter a number");
int num = one.nextInt();
System.out.println("number\t square ");
for (int a = 1;a <= num; a ++) {
    System.out.print(a);
    System.out.print( "\t \t \t" + a * a);
    System.out.println();
}
}
    }

