package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		
		double N;	
		
		double[] data = new double[5];
		
		
		for(int i=0;i<data.length;i++)
						{
						data[i] = N=sc.nextInt();	
						}
		
		
		double sum = 0;
		
		for(int i=0;i<data.length;i++) {
			
			
						sum = sum+data[i];
			
										}
						System.out.println("평균은 "+(sum/5)+"입니다.");
			
		
		
		
		
		
		
		
	}

}
