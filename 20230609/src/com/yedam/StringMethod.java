package com.yedam;

public class StringMethod {
	

	public static void main(String[] args) {
		//split
		String str;
		str ="The class String includes methods for examining individual";
		String[] strs = str.split(" ");
		for(String word : strs) {
			System.out.println(word);
		}
		
		
		str = "c:/temp/images/sample.jpg";
		
		
		//주민등록번호 남녀
		String[] ssn = { "950102-1234567", "950405 2345678", "9703041234567", "0501013456789","0604014545678",
				"250903-3234567" };
		for(int i =0;i<ssn.length;i++) {
			String result = check(ssn[i]);
			System.out.printf("번호는 "+ssn[i]+"성별은"+result+"\n");
		}

	}

	public static String check(String str) {
		String gender = str;
		int wrong = Integer.parseInt(gender.substring(0, 2));
		gender = gender.replace("-","").replace(" ","");
		char c = gender.charAt(6);
		if(c=='1'||c=='3'&& wrong <=23) {
			return  "남";
		}
		else if ( c=='2'||c=='4'&& wrong <=23) {
			return "여";
		}
		return " 잘못된값입니다";


	}
}
