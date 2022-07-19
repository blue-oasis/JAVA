package 삼성SDS알고리즘.day2;
// 1번정렬 컴페러블 2번 컴퍼레터
// 추천받은 사진 게시
// 빈칸 없을 경우 추천수 가장 작은 사진 삭제, 동점일 때 게시된 지 오래된거 삭제
// 게시된 사진이 추천받는 경우 횟수증가
// 게시사진 삭제 시 추천수 0으로 바꿈
// 입력 :  사진틀 개수 N
// 전체 학생 총 추천 횟수
// 추천받은 학생 번호
// 출력 : 사진 게시된 학생 번호 오름차순 출력

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 백준_1713_후보추천 {
    static int N, K;
    static photo[] poto;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); //사진 틀 수 
        int K = in.nextInt(); // 추천받은 학생 수

        poto = new photo[101];
        List<photo> list = new ArrayList<>();
        for(int i = 0; i<K; i++) {
            int num = in.nextInt();
            //해당 후보 최초 호출 시
            if(poto[num] == null) {
                poto[num] = new photo(num, 0, 0, false);
            }
            //해당 후보가 사진틀에 있을 경우
            if(poto[num].isIn == true) {
                poto[num].count++;
            } else {
                //후보가 사진틀에 없음
                //틀이 가득 찬 경우
                if(list.size() == N) {
                    //정렬, 지울 후보 선정, 제거
                    Collections.sort(list);
                    photo poto = list.remove(0); //리스트에서 객체 지우면서 반환
                    poto.isIn = false;
                }
                // 사진틀에 여유가 있는 경우
                poto[num].count = 1;
                poto[num].isIn = true;
                poto[num].time = i;
                list.add(poto[num]);
            }
        }

        //번호순 정렬 출력
        Collections.sort(list, new Comparator<photo>() {
            @Override
            public int compare(photo o1, photo o2) {
                return Integer.compare(o1.num, o2.num);
            }
        } );

        System.out.println(list); //출력형식 손보기
    }
    
}

class photo implements Comparable<photo> {
    int count;  //추천수
    int num;  //번호
    int time;  // 게시순서
    boolean isIn; //게시여부 

    public photo (int num, int best, int gesi, boolean isIn) {
        this.num = num;
        this.count = best;
        this.time = gesi;
        this.isIn = isIn;
    }
   
    //정렬기준 1. 추천수, 2. 시간
    @Override
    public int compareTo(photo p) {
        int comp =  Integer.compare(count, p.count); //추천수 기준 정렬
        if(comp == 0) {
            //추천 동률 발생 시
            return Integer.compare(time, p.time); //시간순으로 정렬
        } else {
            return comp;
        }
    }

    @Override
    public String toString() {
        return "번호" + num + "추천수" + count + "게시시간" + time;
    }
}
