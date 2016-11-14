package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請問要幾筆資料? ");
		int n = scn.nextInt();
		int sum = 0;
		int data [] = new int [n];
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();
			sum += data[i];
		}
		sum=sum/n;
		System.out.println(var(sum,data)/n);
		System.out.println(std(var(sum,data)/n));
	}
	public static float var(int x,int data[]){
		int y;
		float sum=0;
		for(int i=0;i<data.length;i++){
			y= x-(data[i]);
			sum=(float) (sum+(Math.pow(y, 2)));
		}
		
		return sum;
	}
	public static float std(float f){
		f=(float) Math.sqrt(f);
		return f;
		
	}

}