package sss;
import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF a: ");
		a=sc.nextInt();
		System.out.println("ENTER THE VALUE OF b: ");
		b=sc.nextInt();
		System.out.println("SELECTS THE OPERAND");
		System.out.println("a.ADDITION\n");
		System.out.println("s.SUBTRACTION\n");
		System.out.println("m.MULTIPLICATION\n");
		System.out.println("d.DIVISION\n");
		char ch=sc.next().charAt(0);
	
	switch(ch)
	{
	case 'a':
		System.out.println("THE SUM OF GIVEN NUMBER IS "+(a+b));
		break;
	case 's':
		System.out.println("THE DIFFERENCE OF GIVEN NUMBER IS "+(a-b));
		break;
	case 'm':
		System.out.println("THE PRODUCT OF GIVEN NUMBER IS "+(a*b));
		break;
	case 'd':
		System.out.println("THE RESULT OF GIVEN NUMBER IS "+(a/b));
		break;
	default:
		System.out.println("INVALID OPTION");
		break;
	}
	}
}