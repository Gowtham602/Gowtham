package digit;
import java.util.*;
public class dig_pro {

	public static void main(String[] args) {
		Scanner  s=new Scanner(System.in);
		System.out.println("enter the digit:");
		int n=s.nextInt();
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		System.out.println("the no.of.digit are"+c);
	}

}
