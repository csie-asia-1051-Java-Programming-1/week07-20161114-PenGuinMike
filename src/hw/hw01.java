package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.println("最小公倍數是: "+lcm(x,y,z));
	}
	public static int lcm(int x,int y,int z){
		int a =1;//a++;
		//System.out.println("a="+a);
		int b =0;//&&a==x&&a==y&a==z
		int sum=0;//&&a<x||a<y||a<z
		/*for(int i=0;i<3;i++){
			if(x>y){
				b=x;
				x=y;
				y=b;
			}
			if(y>z){
				b=y;
				y=z;
				z=b;
			}
		}*/
		while(a!=0){
			if(a%x!=0||a%y!=0||a%z!=0){
				a++;
			}
			/*else if(a<x||a<y||a<z){
				a++;
			}*/
			else{
				sum=a;
				a=0;
			}
		}
		return sum;
	}

}
