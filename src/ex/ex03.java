package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請問要幾筆資料? ");
		int n = scn.nextInt();
		int a = scn.nextInt();
		float sum = 0;
		float data [][] = new float [n][a];
		for(int i=0;i<n;i++){
			for(int j=0;j<a;j++){
			data[i][j]=scn.nextInt();
			sum += data[i][j];
			}
		}
		sum=sum/(n*a);
		System.out.println(var(sum,data,n,a)/(n*a));
		System.out.println(std(var(sum,data,n,a)/(n*a)));
	}
	public static float var(float x,float data[][],int n,int a){
		float y;
		float sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<a;j++){
			y=(float) (data[i][j])-x;
			//System.out.println("y"+y);
			sum=(float) (sum+(Math.pow(y, 2)));
			//System.out.println("sum"+sum);
			}
		}
		
		return sum;
	}
	public static float std(float f){
		f=(float) Math.sqrt(f);
		return f;
		
	}

}