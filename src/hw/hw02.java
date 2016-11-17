package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
		System.out.println(fun(x)+1);
		
	}
	public static int fun(long x){
		long a=x/10;
		if(a==0){
			return 0;
		}else{
			return 1+fun(a);
		}
		
		
	}

}
