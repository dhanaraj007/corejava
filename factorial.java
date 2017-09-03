import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c,fact=1;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
n = sc.nextInt();
if(n<0)
	System.out.println("factorialisnot" );
else
{
for(c=1;c<=n;c++)
{
fact = fact*c;	
}
System.out.println("factorialof"+n+"is="+fact);
}

	}

}
