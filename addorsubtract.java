
import java.util.*;
class Num
{
    int a,b;
    void print()
    {
        if(a>b)
        System.out.println(a-b);
        else
        System.out.println(a+b);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Num n=new Num();
		System.out.println("Enter 2 integers:");
		n.a=sc.nextInt();
		n.b=sc.nextInt();
		n.print();
	}
}
