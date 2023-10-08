package com.test01;

import java.util.Scanner;

//[반복문]
//1) while문
//while(조건식) {조건식의 결과 값이 참일 동안 수행할 코드}
//조건식의 결과 값은 논리 값을 가져야하며, 조건식의 결과 값이 false이면 종료.
//while(true) 또는 while(false)는 무한 반복문.
//while문 안에 조건문 또는 반복문 중첩 가능.

//2) do - while문
//do {조건식의 결과 값이 참일 동안 수행할 코드} while(조건식);
//while문과 특징을 공유.
//단, while문과 다르게 최초 1회는 조건식과 관계없이 수행한다.
//다른 반복문과 다르게 끝에 세미콜론을 반드시 붙여야한다.

public class WhileTest01 {

	public static void main(String[] args) {
		//[static 메소드 실행]
		//클래스명.메소드명();
		
		//WhileTest01.testWhile();
		
		//WhileTest01.testWhile02();
		
		//WhileTest01.testWhile03();
		
		//WhileTest01.testWhile04();
		
		//WhileTest01.testWhile05();
		
		//WhileTest01.testDowhile01();
		
		//[non static 메소드 실행]
		//new 클래스명().메소드명();
		
		new WhileTest01().testDowhile02();

	}
	
	public static void testWhile() {
		//초기화
		int i = 10;
		
		while(i<=19) {//()안에 조건식. 조건식의 결과 값은 반드시 논리값(true, false)를 가져야한다.
			//반복하며 수행할 코드
			System.out.println(i+"번째 반복문 수행 중...");
			//증감문
			i++;
			
		}
		
		//System.out.println(i);
	}
	
	public static void testWhile02() {
		//초기화
		String str = "apple!";//String은 각 문자마다 index가 있다. index는 0부터 시작하고 1씩 증가한다.
		
		int index = 0;
		
		while(index < str.length()) {//(index < 6)
			
			char ch = str.charAt(index);
			
			System.out.println(index + " : " + ch);
			//System.out.println(index + " : " + str.charAt(index));
			
			index++;
			//index += 2;
			
		}
		
	}
	
	public static void testWhile03() {
		//1부터 입력받은 정수까지의 합
		System.out.print("정수 입력 : ");
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		scn.close();
		
		int i = 1;
		int res = 0;
		
		while(i<=num) {
			
			res += i;//res = res + i; 와 동일.
			i++;
			
		}
		
		System.out.println("1부터 입력받은 정수까지의 합 : " + res);
		
	}
	
	public static void testWhile04() {
		
		int i = 1;
		
		while(true) {
			
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;//여기서 break는 반복문 종료. if문에는 break가 듣지 않는다.
			}
			
		}
		
		System.out.println("종료 후 i값 : " + i);
			
	}
	
	public static void testWhile05() {
		//반복하며 키보드로 숫자를 입력받는다.
		//단, 4가 입력되면 while문 종료.
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 입력 : ");
			int num = scn.nextInt();//스캐너 단계에서 입력 값 범위자체를 제한하는 것은 불가능.
			
			if(num == 4) {
				System.out.println("종료");
				break;//여기서 break는 반복문 종료. if문에는 break가 듣지 않는다.
			}
			
			if(num == 5) {
				System.out.println("건너뛰기");
				continue;
			}
			
		}
		
		scn.close();

	}
	
	public static void testDowhile01() {
		
		int i = 1;
		
		do {
			
			System.out.println(i);
			i++;
			
		}while(i<=10); //do - while 문은 끝에 반드시 세미콜론을 붙여야한다.
		//while()의 ()안에 조건식의 결과 값이 false면 종료한다.
		//i=1이고, while(i==10)이면 1만 출력하고 종료.
	}
	
	public void testDowhile02() {
		//영어 문자열을 입력받아 입력받은 문자열을 출력.
		//단, "end"라는 문자열을 입력받으면 반복 종료.
		
		Scanner sc = new Scanner(System.in);
		String str = null;//String은 참조형 변수. null은 '비어있다'는 의미.
		
		do {
			
			System.out.print("문자열 입력 : ");
			str= sc.nextLine();
			//next()는 띄어쓰기 불가능. nextLine()은 띄어쓰기 가능.
			System.out.println(str);
	
		}while(!str.equals("end"));
		//str이 "end"이면 false이므로 반복 종료. str이 다른 문자열이면 true이므로 계속해서 반복.
		//문자열은 .equals(비교할 문자열 또는 변수)를 이용해 비교한다.
		//== != 등은 주소 값을 기준으로한 비교이므로 문자열 비교 불가능.
		
		sc.close();
		
	}
	

}
