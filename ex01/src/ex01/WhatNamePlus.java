package ex01;
import java.util.Scanner;

public class WhatNamePlus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String name = scanner.next();
		System.out.println(name + " 씨, 안녕하세요?");
		//이름 입력받고 출력
		
		System.out.println("JAVA 에 오신 것을 환영합니다.");
		System.out.print("첫 번째 정수를 입력하시오: ");
		int iA = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하시오: ");
		int iB = scanner.nextInt();
		//정수 두개 입력받고 출력
		
		System.out.print(iA + " 과 " + iB + " 의 합은 " + (iA + iB) +" 입니다.");
		
		scanner.close();
	}

}
