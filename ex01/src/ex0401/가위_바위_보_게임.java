package ex0401;
import java.util.Scanner;

public class 가위_바위_보_게임 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int com = (int)(Math.random()*3+1);
		while(true) {
			System.out.print("<<가위, 바위, 보 게임>>\n1)가위, 2)바위, 3)보\n선택하세요: ");
			int user = in.nextInt();
			if(user == 1) {
				switch(com) {
					case 1:
						System.out.print("비겼습니다.");
						break;
					case 2:
						System.out.print("컴퓨터가 승리했습니다.");
						break;
					case 3 :
						System.out.print("당신이 승리했습니다.");
						break;
				}
			}
			if(user == 2) {
				switch(com) {
					case 1:
						System.out.print("당신이 승리했습니다.");
						break;
					case 2:
						System.out.print("비겼습니다.");
						break;
					case 3 :
						System.out.print("컴퓨터가 승리했습니다.");
						break;
			}
		}
			if(user == 3) {
				switch(com) {
					case 1:
						System.out.print("컴퓨터가 승리했습니다.");
						break;
					case 2:
						System.out.print("당신이 승리했습니다.");
						break;
					case 3 :
						System.out.print("비겼습니다.");
						break;
			}
		}
			System.out.print("\n1) 다시하기, 2)게임종료");
			int play = in.nextInt();
			if(play == 1)
				;
			if(play == 2)
				break;

		}
		in.close();
	}
	
}

