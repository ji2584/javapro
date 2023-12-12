package jihoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



// 월별 지역별  



public class TripTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		
	
		Scanner sc = new Scanner(new File("src/jihoon/triptest.txt"));
		List<Trip> li = new ArrayList<Trip>();
		Map<String,List<Trip>> map = new HashMap<>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();// 한줄읽기
			String[] str = line.split(",");
			Trip t = new Trip((str[0]), str[1], 
								str[2], Integer.parseInt(str[3]));
			li.add(t); 
			if (!map.containsKey(t.month)) map.put(t.month, new ArrayList<>());
			List<Trip> tli = map.get(t.month);
			tli.add(t);
			map.put(t.month, tli);
			
			
		}
		
		
		
		
		List<Trip>  templi = map.get("10");
		System.out.println(templi.size());
		Collections.sort(templi,new Comparator<Trip>() {

			@Override
			public int compare(Trip o1, Trip o2) {
				
				return o1.price-o2.price;
			}
			
		});
		
		for (Trip t : templi) {
			System.out.println(t);
		}
		
		
		System.out.println("========================================================");
		
		
		
		
		
		
		for (Trip t : li) {
			System.out.println(t);
		}
		
		System.out.println("4) 월별 지역별 여행 가는 인원  현황");
		
	   ArrayList<Trip> list = new ArrayList<Trip> ();   
	   System.out.println("원본 : " + list); // [A, B, C, A, B, A]         // ArrayList 원소 빈도수를 Map에 저장  
	   Map<String, Integer> map2 = new HashMap<String, Integer>(); 
	   for (Trip str : list) {
		   List<Trip> count = map.get(str);  
		   if (count == null) {  map.put(Trip, 1);    }
		   else { map.put(str, count + 1);   }   }   
	      }
		
		
	
		
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("여행가고 싶은 달을 입력하세요, 1월부터 12월까지");
		while(true) {
			
			String input = sc2.nextLine();
			
	
			
			List<Trip> tli =map.get(input);
			if (Integer.parseInt(input) > 12 || Integer.parseInt(input) < 1) {
                System.out.println("=====1월부터 12월 사이의 월의 숫자를 입력하세요======");
                continue;
           }
			Collections.sort(tli,new Comparator<Trip>() {

				@Override
				public int compare(Trip o1, Trip o2) {
					// TODO Auto-generated method stub
					return o1.price - o2.price;
				}
								
			});
			
			
			for(Trip t :tli) {
				
										
				System.out.println(t);			
			} 
					}
				}
	}


