package hw;
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println("最大公因數: "+gcd(x,y));
		
	}
	public static int gcd(int x,int y){
		int max = Math.max(x,y);
		int min = Math.min(x,y);
		if(max%min!=0){
			return gcd(min,(max%min));
		}else{
			return min;
		}
		
		
		
	}

}
