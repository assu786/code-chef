import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner n=new Scanner (System.in);
	    int X=n.nextInt();
	    int Y=n.nextInt();
	    int z=2*X;
	    if(z<Y)
	    System.out.println("PLASTIC");
	    else
	    System.out.println("METAL");
	}
}