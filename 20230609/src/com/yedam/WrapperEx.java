package com.yedam;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		int n1 = i1; //객체 -> 기본타입: 언박싱
		i1=100; //기본타입 -> 객체타입 : 박싱
		n1 = 50;
		Integer result = i1 +n1;
		System.out.println(result);
		
		n1= Integer.parseInt("100");//문자열을 정수타입으로 바꿪는
		byte b1 = Byte.parseByte("10");//바이트타입 127까지만 가능
		
		Byte b2 = Byte.valueOf("10");// == new Byte(2);
		b2.byteValue();//객체타입을 기본타입으로 변경
		
		
		Short s1 = Short.valueOf("100");
		short s2 = s1.shortValue();
		
		//포장객체의 값 비교
		Integer w1 = Integer.valueOf("100");
		Integer w2 = Integer.valueOf("100");
		//객체의 값을 비교하지말고 기본타입으로 변경하는방식선호 
		
		System.out.println(w1==w2);
		System.out.println(w1.equals(w2));
		}

}
