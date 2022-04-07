package ex0407;

public class EX01_IfControlStatment {

	public static void main(String[] args) {
		int value1 = 5;
		if(value1>3) {
			System.out.println("실행1");
		}
		if(value1<5) {
			System.out.println("실행2");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if(bool1) {
			System.out.println("실행3");
		}
		if(bool2) {
			System.out.println("실행4");
		}
		
	    int value2 = 5;
	    if(value2>3) {
	    	System.out.println("실행5"); //실행됨
	    }
	    else {
	    	 System.out.println("실행6"); //실행안됨
	    }
	    	
	    //@cf. 삼항연산자와 변환 가능
	    System.out.println((value2>3)? "실행5":"실행6"); //실행5
	    System.out.println();
	   
	    //#3. Type3 : if - else if - else if - ...- else
	    int value3 = 85;
	    if(value3>=90) {
	    System.out.println("A학점");
	    }
	    else if(value3>=80) {
	    System.out.println("B학점"); //실행 후 탈출
	    }
	    else if(value3>=70) {
	    System.out.println("C학점");
	    }
	    else {
	    System.out.println("F학점");
	    }
	    	
	    if(value3>=70) {
	    System.out.println("C학점"); //실행 후 탈출
	     }
	    else if(value3>=80) {
	    System.out.println("B학점");
	    }
	    else if(value3>=90) {
	    System.out.println("A학점");
	    }
	    else {
	    System.out.println("F학점");
	    }
	    	
	}

}
