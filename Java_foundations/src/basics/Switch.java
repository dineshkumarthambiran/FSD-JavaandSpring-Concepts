package basics;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		char a;
		Scanner s = new Scanner(System.in);
		a=s.next().charAt(0);
		
		switch(a)
		{case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a vowel");
			
		
			
		}
		
	}

}
