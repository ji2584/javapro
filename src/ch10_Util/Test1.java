package ch10_Util;

import java.time.Month;
import java.time.YearMonth;

public class Test1 {
    public static void main(String[] args) {
        int year = 2023; // 연도 설정
        for (Month month : Month.values()) {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            
            System.out.println(month + " " + year); 
            System.out.println("일 월 화 수 목 금 토");
            
            // 시작 요일(1일의 요일) 계산
            int dayOfWeek = yearMonth.atDay(1).getDayOfWeek().getValue();
            
            // 첫 주에서 시작 요일까지 공백 출력
            for (int i = 1; i < dayOfWeek; i++) {
                System.out.print("   ");
            }
            
            // 각 날짜 출력
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%2d ", day);
                if (dayOfWeek == 7) {
                    System.out.println();
                    dayOfWeek = 1;
                } else {
                    dayOfWeek++;
                }
            }
            System.out.println("\n");
        }
    }
}