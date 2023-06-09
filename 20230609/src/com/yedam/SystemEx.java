package com.yedam;

import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) {
		long stime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.출력 2. 종료");
			int menu = sc.nextInt();
			if(menu ==1) {
				System.out.println("pirnt");
			}
			else if (menu ==2) {
//				System.exit(0);
				break;
			}
		}
		System.out.println("end of prog");
		long etime = System.currentTimeMillis();
				System.out.println("실행시간: "+(etime-stime));
	}

}
