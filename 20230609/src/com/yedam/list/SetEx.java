package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// Set컬렉션 살펴보기
		// 중복값은 제거되고 값을 출력한다
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");// 인덱스값으로 값을 가져오는게 아니고 "반복자" 라는것을 통해서 값을 가져온다
		Iterator<String> iterator = set.iterator();// 반복자 지정
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);// set 컬렉션 출력 방법

		}
		System.out.println("-------");
		for (String str : set) {
			System.out.println(str);// 중복값은 제거되고 값을 출력한다
		}
		Set<Integer> iSet = new HashSet<>();
		iSet.add(100);
		iSet.add(200);
		iSet.add(100);
		System.out.println("-------");
		for (Integer str : iSet) {
			System.out.println(str);// 중복값은 제거되고 값을 출력한다
		}

		// 정수를 담을수있는 배열[] 하나를 선언
		// 임의의값을 5개 저장한다 (1~10까지 생성해주는 math random)
		//
		System.out.println("==============");
		int[] numbers = new int[5];
		Set<Integer> aset = new HashSet<>();
		while (aset.size()<5){
			aset.add((int)(Math.random()*10+1));
		}
		int idx = 0 ; //numbers 배열의 인덱스로 사용
		Iterator<Integer> itr = aset.iterator();
		while(itr.hasNext()) {
			numbers[idx++]=itr.next();
		}
		System.out.println("--numbers--");
		for(int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
