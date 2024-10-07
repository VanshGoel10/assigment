import java.util.*;
public class PrintThreeNames{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		String name3 = sc.nextLine();
	  printThreeNames(name1,name2,name3);
         }
         public static void printThreeNames(String name1, String name2, String name3){
        System.out.println("Hi " + name3 + ", " + name2 + " and " + name3);
    }
}