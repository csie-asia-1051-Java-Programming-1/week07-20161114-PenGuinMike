package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String x = scn.nextLine();
		int n =x.length()-1;
		char[] a = x.toCharArray();
		fun(a,n);
	}
	public static int fun (char a[],int n){
		if(n==0){
			System.out.print(a[n]);
		}else{
			System.out.print(a[n]);
			return fun(a,n-1);
		}
		return 0;
		
	}

}
