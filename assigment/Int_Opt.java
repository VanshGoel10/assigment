import java.util.*;
public class Int_Opt{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(); 
	int b = sc.nextInt();
	int c = sc.nextInt();
    System.out.println((a+b*c) + ", "+ (a * b + c) + ", " + ( c + a / b) + " and " + ( a % b + c));
   }

}