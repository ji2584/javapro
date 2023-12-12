package ch10_Util;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		int year = 2023; 		int month = 11;
		Calendar sDay = Calendar.getInstance(); //시작일
		Calendar eDay = Calendar.getInstance();// 끝일
		//월의 경우 0부터 11까지의 값을 가지므로 1을 뺴주어야 한다.
		//예를 들어 2021년 7월 1일은 sDay.set(2021,6,1);과 같이 해줘야 한다.
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);//2021,8,1
		//다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 왼다.
		//12월 일에서 하루를 빼면 11월 30일이 된다.
		eDay.add(Calendar.DATE,-1);
		//
		// 첫번째 요일이 무슨 요일인지 알아낸다.
		int START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		int END_DAY = eDay.get(Calendar.DATE);
		System.out.println("1일 요일:" + START_DAY_OF_WEEK);
		System.out.println("마지막 일:" + END_DAY);
		
		System.out.println("     " + year + "년" + month + "월");
		System.out.println("SU MO TU WE TH FR SA");
		//해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
		//만일 1일이 수요일이라면 공백을 세번 찍는다.(일요일부터 시작)
		
		for(int i=1; i< START_DAY_OF_WEEK; i++ ) {
			System.out.print("   ");
		}

		for(int   i= 1, n=START_DAY_OF_WEEK; i<= END_DAY; i++,n++ ) {
			System.out.print((i<10)?"  "+i:" "+i);
			if(n%7==0) System.out.println();
		} 

	}

} 
