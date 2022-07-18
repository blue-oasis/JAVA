package 삼성SDS알고리즘.day1;

import java.io.FileInputStream;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

// R행 C열 지도
// D 비버굴, . 빈칸, S 고슴도치, X 돌, * 물
// 1초마다 물 인접지역(4변)에 물 번짐(돌, 굴 제외)
// 물있는데, 돌, 물찰곳 이동 불가
// 최단시간 비버굴 가는 시간 구하기
// 동시에 움직이는 상황은 넓이우선탐색으로 하기 (BFS)
// 큐로 풀기. 스타트포인트 2개(고슴, 물) 각 조건 맞게 움직이기, 좌표로 기록 p(x, y, type)
// 방문 체크 판 int 기록해서 위치로 가는데 몇 턴 필요한지 구할 수 있음
public class 백준3055_탈출 {
	//                       좌, 우, 위, 아래
	static final int[] mx = {-1, 1, 0, 0}; //x좌표 이동
	static final int[] my = {0, 0, -1, 1}; //y좌표 이동
	
	static int[][] dp;
	static char[][] map;
	static int R, C;
	static Queue<Point> queue;
	static boolean foundAnswer;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/삼성SDS알고리즘/day1/input3.txt"));
		Scanner in = new Scanner(System.in);
		
		/*int x = 1;
		int y = 1;
		
		//조이스틱 이동
		for(int i = 0; i< 4; i++) {
			int tx = x + mx[i];
			int ty = y + my[i];
		} */
		
		R = in.nextInt();
		C = in.nextInt();
		
		map = new char[R][C];
		dp = new int[R][C];
		queue = new LinkedList<>();
		
		Point st = null;
		
		for(int r = 0; r<R; r++) {
			String line = in.next();
			for(int c = 0; c<C; c++) {
				map[r][c] = line.charAt(c);
				if(map[r][c] == '*') {
					queue.add(new Point(r, c, '*'));
				} else if (map[r][c] == 'S') {
					st = new Point(r, c, 'S');
				}
			}
		}
		
		queue.add(st);
		//Q[*, S] 물 먼저 넣음
		
		while (!queue.isEmpty()) {
			//1. 큐에서 꺼내옴 -> *, S, ., D
			Point p = queue.poll();
			//2. 목적지인가? -> D
			if(p.type == 'D') {
				// 답 출력
				foundAnswer = true;
				break;
			}
			//3. 연결된 곳을 순회 -> 좌우위아래
			for(int i =0; i<4; i++) {
				int ty = p.y + my[i];
				int tx = p.x + mx[i];
				//4. 갈 수 있는가?(공통): 맵 안에 들어오는가
				if(0 <= ty && ty < R && 0 <= tx && tx < C) {
				//4. 갈 수 있는가? (고슴도치) : . or D, 방문하지 않은 곳
					if(p.type == 'S' || p.type == '.') {
						if((map[ty][tx] == '.' || map[ty][tx] == 'D') && dp[ty][tx] == 0) {
							//5. 체크인(고슴도치) : dp[][] = 이동거리
							dp[ty][tx] = dp[p.y][p.x] + 1;
							// 6. 큐에 넣음
							queue.add(new Point(ty, tx, map[ty][tx]));
						}
					} else if (p.type == '*') {
						//확인용 물 점검
					//4. 갈 수 있는가?(물) : .
						if(map[ty][tx] == '.' || map[ty][tx] == 'S') {
							//5. 체크인 (물): map[][] = *
							map[ty][tx] = '*';
							//6. 큐에 넣음
							queue.add(new Point(ty, tx, '*'));
						}
					}
				}
				
			}
			
		}
		
		//D 좌표 얻어내서 답 출력하기 해야함
		
	}
}
	
	class Point {
		int y;
		int x;
		char type;
		
		public Point(int x, int y, char type) {
			this.y = y;
			this.x = x;
			this.type = type;
			
		}
		
		@Override
		public String toString() {
			return "Point{" + "y=" + y + "x=" + x + ", type=" + type ;
		}
	}


