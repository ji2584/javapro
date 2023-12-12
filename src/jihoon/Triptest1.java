package jihoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Triptest1 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/jihoon/triptest.txt"));
        List<Trip> li = new ArrayList<Trip>();
        Map<String, List<Trip>> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();// 한줄읽기
            String[] str = line.split(",");
            Trip t = new Trip((str[0]), str[1], str[2], Integer.parseInt(str[3]));
            li.add(t);
            if (!map.containsKey(t.month))
                map.put(t.month, new ArrayList<>());
            List<Trip> tli = map.get(t.month);
            tli.add(t);
            map.put(t.month, tli);
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("여행가고 싶은 달을 입력하세요, 1월부터 12월까지");
        while (true) {

            String input = sc2.nextLine();

           if (Integer.parseInt(input) > 12 || Integer.parseInt(input) < 1) {
                System.out.println("1월부터 12월 사이의 월의 숫자를 입력하세요");
                continue;
           }

            List<Trip> tli = map.get(input);
            if (tli != null) {
                Collections.sort(tli, new Comparator<Trip>() {
                    @Override
                    public int compare(Trip o1, Trip o2) {
                        return o1.price - o2.price;
                    }
                });

                for (Trip t : tli) {
                    System.out.println(t);
                }
            } else {
                System.out.println("해당 월의 데이터가 없습니다.");
            }
        }
    }
}


