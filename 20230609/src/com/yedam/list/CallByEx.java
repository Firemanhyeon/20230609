package com.yedam.list;

class Emp{//참조값에 의한 호출이면 어떻게변하는지 
	int id ;
	String name;
	
}
public class CallByEx {

	public static void main(String[] args) {
		//값에 의한 호출
		//메소의 매개값이 value에 대한 호출인지 아니면 참조값에 대한 호출인지에 따라 어떻게 변하는지 확인하는 예제
		int a =10;
		meth1(a);
		System.out.println(a);//a라는값이 참조되어지는값이아니라 실제 값이기때문에 10*10 = 100 이 안되고 그냥 10이출력이된다
		//원래있던값을 그대로 출력
		
		
		Emp emp = new Emp();//참조값에 의한 호출
		emp.name = "홍길동";
		meth2(emp);
		System.out.println(emp.name);//원래는 홍길동이였는데 참조값에 의해 김길동으로 바뀜
		
		//문자열
		
		String b ="Hello";
		meth3(b);
		System.out.println(b);//참조값인데도 불구하고 문자열같은경우에는 값이 바뀌지않음
		//String , Wrapper객체는 기본타입 유형처럼 처리한다.
	}
	
	public static void meth1(int a) {//매개값으로 들어온 값을 제곱해주는 메소드
		a= a*a;
	}
	public static void meth2(Emp e) {
		e.name = "김길동";
	}
	public static void meth3(String str) {
		str = "World";
	}

}
