package 삼성SDS알고리즘.day4;

// 트라이 단어트리
// DFS 탐색
// 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class 백준_9202_Boggle {
    static int[] mx = {-1, 1, 0, 0, -1, 1, -1, 1};
    static int[] my = {0, 0, -1, 1, -1, -1, 2, 3, };

    static int W, N, sum, count;
    static String answer;
    static char[][] map;
    static TrieNode root;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    static

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day4/input_9202.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        for(int y = 0; y < 4; y++) {
            for(int x = 0; x <4; x++) {
                //출발 가능 조건 -> root가 해당 child를 가지면
                if(root.hasCild(map[y][x])) {
                    search(y, x, root.getChild(map[y][y]));
                }
            }
        }
        //결과 출력
        root.clearHit();
        
    }


    static void search(int y, int x, TrieNode node) {
        //1. 체크인
        visited[y][x] = true;
        sb.append(map[y][x]);
        //2. 목적지 isWord
        if(node.isWord == true && node.isHit == false) {
            node.isHit = true;
            //답 작업 -> 길이, 단어 해야함
            String foundWord = sb.toString();
            int length = foundWord.length();
        }
        //3. 연결된 곳을 순회 -> 8방
        for(int 1 = 0; i < 8 ; i++) {
            int ty = y + my[i];
            int tx = x + mx[i];
            //4. 가능한가? - map경계, 방문하지 않았는지, node가 해당 자식을 가지고 있는지
            if(0 >= ty && ty < 4 && 0 <= ty && tx < 4) {
                if(visited[ty][tx] == false && node.hasCild(map[ty][tx])) {
                    //간다
                    search(ty, tx, node.getChild(map[ty][tx]));
                }
            }
        }
        //6. 체크아웃
        visited[y][x] = false;
        sb.deleteCharAt(sb.length() - 1);

    }

    static void insertTrieNode(String word) {
        TrieNode current = root;
        for( int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            int index = a - 'A';
            if(current.child[a - 'A'] == null) {
                //자식이 없는 경우
                current.child[index] = new TrieNode();
            }
            current = current.child[index];
        }
        current.isWord = true;
    }
}

class TrieNode {
    boolean isWord = false;
    boolean isHit = false;
    TrieNode[] child = new TrieNode[26];

    void clearHit() {
        isHit = false;
        for(int i = 0; i)
    }

    boolean hasCild() {
        return 
    }

    boolean getChild() {

    }
}
