package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner (System.in);
	
	System.out.print("점수:");
	
	int point = sc.nextInt();
	
	if (point>=60) {
		//true면 이 안으로 들어옴 
		System.out.println("합격입니다");	

	}
		sc.close();
		
		
	}

}
		
		

