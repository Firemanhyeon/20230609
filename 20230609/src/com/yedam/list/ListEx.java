package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> strList;
		strList = new ArrayList<String>();//  
		strList.add("Hello");// 인덱스 0번째
//		strList.add(100);스트링만 담을수있어서 오류
		strList.add("World");// 인덱스 1번째
		// 특별한 위치에 지정해서 담기
		strList.add(0, "good");// 0번째에 good 추가
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));// 굿이 젤 처음 와서 헬로 월드 각각 하나의인덱스씩 밀림
		}
		System.out.println("====================================");

		strList.set(0, "Nice");// 변경
		for (String word : strList) {
			System.out.println(word);// 굿을 나이스로 변경
		}

		System.out.println("===============================");
		strList.remove(0);// 제거
		for (String word1 : strList) {
			System.out.println(word1);
		}
		//어레이리스트와 링크리스트 두개의 실행시간속도 비교 하는 예제 
		long start = System.currentTimeMillis();
		strList = new ArrayList<>();//객체 제거하는경우에 바로 뒤에 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨진다
		for(int i = 0 ; i <100000;i++) {
			strList.add(0,"i"+i);
			
		}
		long end = System.currentTimeMillis();
		System.out.printf("arryList걸린시간 %d\n", (end - start));
		//인터페이스변수에는 모든 구현클래스의 변수값을 담을 수 있다
		long start1 = System.currentTimeMillis();
		strList = new LinkedList<String>();//사용방식도 똑같고 처리되는구현방식도 똑같다 
		// 제거하거나 삽입하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지않는다.(변경속도빠름)
		for(int i = 0 ; i <100000;i++) {
			strList.add(0,"i"+i);
			
		}
		long end1 = System.currentTimeMillis();
		System.out.printf("LinkedList걸린시간 %d", (end1 - start1));
		//처리된 시간을 보면 어레이리스트가 좀 더 빨리 추가된다
		//하지만 0번째에 계속 삽입(변경과같음) 하면 LinkedList가 훨씬 빠르다 저장방식이 달라서
	}
}
