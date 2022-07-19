package 삼성SDS알고리즘.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Compare {
    public static void main(String[] args) {
        Item item1 = new Item(1, 3, 1);
        Item item2 = new Item(1, 2, 3);
        Item item3 = new Item(1, 1, 2);

        List<Item> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Comparator<Item> comp = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.c - o2.c;
            }
        };

        Collections.sort(list, comp); // Comparator 이용 정렬
        System.out.println(list);
                                                //클래스::메소드 인터페이스 메소드 문법 (함수를 객체처럼 사용)
        Collections.sort(list, Comparator.comparingInt(Item::getB).reversed());
        // geter 이용 정렬 (리버스) 기준잡아서 정렬
        System.out.println(list);
    }
}

class Item implements Comparable<Item> {
    int a;
    int b;
    int c;

    public Item(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "a=" + a + " b=" + b + " c=" + c;
    }

    @Override
    public int compareTo(Item o) {
        //음수 -> 원래순서 유지
        //0 ->  동일
        //양수 -> 스왑
      /*  if(b < o.b) {  방법1
            return -1;
        } else if(b == o.b) {
            return 0;
        } else {
            return 1;
        } */

    //    return b - o.b; //순서따라 오름차순 내림차순 바뀜 방법2
        return Integer.compare(b, o.b); //방법3 오름차순
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}