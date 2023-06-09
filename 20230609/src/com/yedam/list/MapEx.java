package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.yedam.Member;

public class MapEx {

	public static void main(String[] args) {
		//키와 값 두개를 저장 해야함 
		Map<String,Integer> map ;//키 타입 , 값 타입 두개다 지정
		map= new HashMap<>();//<>안에 안넣으면 앞에 넣었던 타입 그대로 따라감
		//등록
		map.put("홍길동", 90);
		map.put("김민기", 88);
		map.put("김민수", 85);//앞은 키 뒤에는 값
		map.put("홍길동", 95);//키값은 중복할수없다. 값은 중복가능, 중복하면 마지막값이 저장됨
		
		//조회
		Integer result= map.get("홍길동");//get에 키를 넣어주면  value를 반환해준다
		System.out.println(result);//값이 나옴
		
		//제거
//		map.remove("홍길동");//조회랑 똑같이 remove 키값을 넣어주면 value도 삭제
		
		//키값을 담은 set컬렉션을 반환 (키만 출력)
		Set<String> keys = map.keySet();
		Iterator<String> itr= keys.iterator();//저장된 객체를 한번씩 가져오는 반복자 리턴
		while(itr.hasNext()) {
			String key = itr.next();//하나씩하나씩가져오는역할 next
			Integer val = map.get(key);
			System.out.println(key+val);
		}
		
		//key : Member타입 Value : Integer타입
		Map<Member,Integer>members = new HashMap<>();
		members.put(new Member("user1","1111"), 100);
		members.put(new Member("user2","2222"), 120);
		members.put(new Member("user1","1111"), 140);//키값은 중복 안되기때문에 마지막 인 140이 출력
		
		Integer point = members.get(new Member("user1","1111"));
		System.out.println(point);
		
		
		//
	}
}
