package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.getTime());//1970년 1월1일 
		//53년 6월 9일 *1000*60*60*24 = 초단위 결과값
		
		long curr = 1686283157912L/(1000*60*60*24);
		System.out.println(today.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String result = sdf.format(today);
		result = "2022/01/01 13:20:22";
		try {
			Date resultDate = sdf.parse(result);
			System.out.println(resultDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		result = dateToStr(today, "yyyy/MM");
		System.out.println(result);
	}

	private static String dateToStr(Date date, String pattern) {
		// 처리
		return null;
	}

}
