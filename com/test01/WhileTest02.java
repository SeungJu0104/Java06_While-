package com.test01;

public class WhileTest02 {
	
	public static void main(String[] args) {
		//[static 메소드 실행]
		//클래스명.메소드명();
		
		//WhileTest02.prn01();
		//WhileTest02.prn02();
		WhileTest02.prn03();
		
	}
	
	public static void prn01() {
		
		System.out.println("[prn01]");
		//1. 1-100까지의 숫자를 역순으로 출력한다.
		//while문 이용.
		
		int i = 100;
		
		while(i > 0) {
			
			System.out.print(i + " ");//i값을 반복해 출력.
			
			i--;//i = i-1;과 동일. i값은 반복할 때마다 1씩 감소.
			
		}
		
		System.out.println();
		
		for(i = 100; i >= 1; i--) {
			
			System.out.print(i + " ");
		}
		
		
	}
	
	public static void prn02() {
		
		System.out.println("[prn02]");
		//2. 1-100까지의 숫자 중, 2의 배수만 출력한다.
		//while문 이용.
		
		int i = 1;
		
		while(i <= 100) {//1부터 100까지의 숫자 범위.
			
			if(i % 2 == 0) System.out.print(i + " ");//2의 배수만 반복 출력.
			
			i++;//i = i+1과 동일. i값은 반복할 때마다 1씩 증가.
			
		}
		
		System.out.println();
		
		for(i = 1; i <= 100; i++) {
			
			if(i % 2 == 0) System.out.print(i + " ");
		}
		
	}
	
	public static void prn03() {
		
		System.out.println("[prn03]");
		//3. 1-100까지의 숫자 중, 7의 배수의 개수와 총합을 구해 출력한다.
		//while문 이용.
		
		int i = 1, cnt = 0, sum = 0;
		
		
		while(i <= 100) {
			
			if(i % 7 == 0) {
				sum += i;
				cnt++;
			}
			
			i++;
			
		}
		
		i = 1; cnt = 0; sum = 0;
		
		for(i = 1; i <= 100; i++) {
			
			if(i % 7 == 0) {
				
				cnt += 1;
				sum += i;
				
			}
			
		}
		
		System.out.println("7의 배수 개수 : " + cnt);
		System.out.println("7의 배수 총합 : " + sum);
	
	}
}
