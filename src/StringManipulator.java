import java.util.Scanner;

/*
 * String Manipulator
 * @author Sriman Selvakumaran
 */
public class StringManipulator
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.println("First Letter: " + str.charAt(0) + "\nLast Letter: " + str.charAt(str.length()-1) + "\nLength: " + str.length());
		System.out.println("First Half: " + str.substring(0,str.length()/2));
		System.out.print("Enter a character to search for: ");
		System.out.print(str.indexOf(input.nextLine()));
	}

}
