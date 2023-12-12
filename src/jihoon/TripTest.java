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

public class TripTest {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("src/jihoon/triptest.txt"));//Scanner를 사용하여 파일을 읽습니다.
		
		List<Trip> li = new ArrayList<Trip>();
		Map<String, List<Trip>> map = new HashMap<>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();// 파일의 각 라인을 sc.nextLine()을 통해 한 줄씩 읽어들입니다
			String[] str = line.split(","); //String[] str 배열에 저장합니다.
			Trip t = new Trip((str[0]), str[1], str[2], Integer.parseInt(str[3]));//Trip 객체를 생성하고, 이 객체들은 List<Trip>인 li에 추가됩니다.
			li.add(t); 
			if (!map.containsKey(t.month))
				map.put(t.month, new ArrayList<>());
			List<Trip> tli = map.get(t.month);  //월별로 Trip 객체들을 Map<String, List<Trip>>인 map에 분류하여 저장
			tli.add(t);
			map.put(t.month, tli);  

		}

		List<Trip> templi = map.get("10");
		
		Collections.sort(templi, new Comparator<Trip>() {

			@Override
			public int compare(Trip o1, Trip o2) {

				return o1.price - o2.price;
			}

		});

		for (Trip t : templi) {
			System.out.println(t);
		}

		System.out.println("========================================================");

	System.out.println("1) 월별 리스트");
		
		Iterator<Trip> it = li.iterator();  //Iterator를 사용하여 li의 Trip 객체들을 가져옵니다.
		Map<String, List<Trip>> map1 = new HashMap<>();
		while(it.hasNext()) {   //각 Trip 객체의 월을 기준으로 Map<String, List<Trip>> map1에 분류합니다.
									//map1의 키는 월을 나타내며,
									//값은 해당 월에 해당하는 Trip 객체들의 리스트입니다
			Trip t = it.next();
			if(!map1.containsKey(t.month)) map1.put(t.month, new ArrayList<>());
			map1.get(t.month).add(t);
			      
		}
		
//		for (String m : map1.keySet()) {
//			System.out.println(m+"월================");
//			for(Trip p : map1.get(m)) { //map1.get(m) List
//				System.out.println(p);
//			}
//		}
		for (int i = 1; i <= 12; i++) {
		    String month = String.valueOf(i);// 현재 월을 문자열로 변환합니다. 
		    if (map1.containsKey(month)) {  //당 월에 해당하는 데이터가 map1에 있는지 확인합니다.
		    									//해당 월에 데이터가 있다면, 해당 월을 출력하고 그 월에 해당하는 Trip 객체들을 출력
		        System.out.println(i + "월================");
		        for (Trip t : map1.get(month)) {
		            System.out.println(t);
		        }
		    }
		}

		System.out.println("2) 월별 지역별 여행 가는 인원  현황");

		
		Map<String, Integer> map2 = new TreeMap<String, Integer>();//String 형태의 키(월:지역)와 Integer 형태의 값(여행 가는 인원 수)을
																	//가지는 맵을 생성합니다
		for (Trip str : li) {
			
			String key = ((str.month.length()!=1)? str.month : "0" + str.month)+ ":" + str.area;
			if(!map2.containsKey(key)) map2.put(key, 0);//for (Trip str : li) { ... }: li에 있는 Trip 객체들을 반복하면서
														//	각 객체의 정보를 이용하여 map2에 
														//	월과 지역을 조합한 키로 여행 인원을 저장합니다
			
			map2.put(key, map2.get(key)+1);//이미 키가 있는 경우 해당 키의 값을 가져와 여행 인원 수를 증가시킵니다.
			
			
		}
		
		String mon = "";
		for (String key : map2.keySet()) {
			String[]temps = key.split(":");//key 값을 콜론(:)을 기준으로 나누어 월과 지역으로 분리합니다.
			if(!temps[0].equals(mon)) //월은 한번만 표현으로 한다
				System.out.println(temps[0] + "월>");
			mon = temps[0];//변수를 현재 월로 업데이트합니다.
			System.out.print("\t" + temps[1] + "\t"+ map2.get(key)); //해당 지역과 여행 가는 인원을 출력합니다.
			
			System.out.println();
		}
		
		System.out.println("3) 월별 지역별 여행 가는 매출 현황");

		
		Map<String, Integer> map3 = new TreeMap<String, Integer>();
		for (Trip str : li) {
			
			String key = ((str.month.length()!=1)? str.month : "0" + str.month)+ ":" + str.area ;//str의 월과 지역을 조합하여 고유한 키인 key를 만듭니다.
			if(!map3.containsKey(key)) map3.put(key, 0); //
			map3.put(key, map3.get(key)+str.price);//키가 있는 경우 해당 키의 값을 가져와 여행 매출에 현재 여행의 가격을 더합니다.
			
			
		}
		
		mon = "";
		for (String key : map3.keySet()) {
			String[]temps = key.split(":");
			if(!temps[0].equals(mon)) //월은 한번만 표현으로 한다
				System.out.println(temps[0] + "월>");
			mon = temps[0];
			System.out.print("\t" + temps[1] + "\t"+ map3.get(key)); 
			
			System.out.println();
		}
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("여행가고 싶은 달을 입력하세요, 1월부터 12월까지");//ㅏ 용자가 입력한 달에 해당하는 Trip 리스트를 tli에 할당
		while(true) {
			
			String input = sc2.nextLine();
			
	
			
			List<Trip> tli =map.get(input);//사용자가 입력한 달에 해당하는 Trip 리스트를 tli에 할당.
			if (Integer.parseInt(input) > 12 || Integer.parseInt(input) < 1) {
                System.out.println("=====1월부터 12월 사이의 월의 숫자를 입력하세요======");
                continue;//continue를 사용하여 다시 입력을 받도록 함
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
