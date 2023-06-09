package com.yedam;

import java.lang.reflect.Method;

public class ClassEx {

	public static void main(String[] args) {
		Class cls = Member.class;
		try {
			cls = Class.forName("com.yedam.Member");
		} catch (ClassNotFoundException e) {// 이건아니지
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Member m1 = new Member();
		System.out.println(cls.getName());
		
		Method[] methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
