package ch11_Collection;

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

public class TripTest {

	public static void main(String[] args) throws FileNotFoundException {
		
	
		Scanner sc = new Scanner(new File("src/ch11_Collection/Product.txt"));
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
		
		
		
	
		
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("여행가고 싶은 달을 입력하세요, 1월부터 12월까지");
		while(true) {
			
			String input = sc2.nextLine();
			
//			if(Integer.parseInt(input)>12 && Integer.parseInt(input)<1) {
//				continue;
//				
//			}
//			System.out.println("1월 12월사이의 월의 숫자를 입력하세요");
//			
		

			
			
			List<Trip> tli =map.get(input);
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
		
				
						/*for(int i =0;  i<li.size() ; i++) {
				if(li.get(i).stno.equals(input)) {
					System.out.println((i+1) + "등:" + li.get(i));
				}
			}
		*/ 			
				}
		
	
		
		
		
		
		
		

	}

}

class Trip {
	String month;
	String area;
	int price;
	String review;
	
	public Trip(String month, String area, String review, int price) {
		super();
		this.month = month;
		this.area = area;
		this.price =  price;
		this.review = review;

	}

	@Override
	public String toString() {
		return "Trip [가고싶은달=" + month + ", 여행지=" + area + ", 가격대=" + price +"만원"+ " 평가=" + review + "]";
	}

	

}
