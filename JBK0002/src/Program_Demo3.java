import java.util.Scanner;

public class Program_Demo3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1;
	String word1;
	System.out.print("Enter a number: ");
	num1 = sc.nextInt(); // read input for num1
	System.out.print("Enter a word: ");
	word1 = sc.next(); // read input for word1
	System.out.println("Your Inputs Are....");
	System.out.println("The number you have entered is: "+num1);
	System.out.println("The word you have entered is: "+word1);
}
}
