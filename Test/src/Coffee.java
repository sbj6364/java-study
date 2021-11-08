import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int coffee = 0;
		
		for(i = 0 ; i < 3 ; i++) {
			System.out.printf("-------%d번 손님, 어떤 커피를 드릴까요?-------\n\n"
							+ "\t\t1. 보통\n\t\t2. 설탕\n\t\t3. 블랙\n\n"
							+ "---------------------------------------\n\n"
							+ "입력: ", i + 1);
			coffee = s.nextInt();
			
			System.out.printf("\n\n# 1. 뜨거운 물을 준비한다.\n");
			System.out.printf("# 2. 종이컵을 준비한다.\n");
			switch(coffee) {
			case 1:
				System.out.printf("# 3. 보통 커피를 탄다.\n");
				break;
			case 2:
				System.out.printf("# 3. 설탕 커피를 탄다.\n");
				break;
			case 3:
				System.out.printf("# 3. 블랙 커피를 탄다.\n");
				break;
			}
			System.out.printf("# 4. 물을 붓는다.\n");
			System.out.printf("# 5. 스푼으로 저어서 녹인다.\n\n");
			System.out.printf("손님, 커피 여기 있습니다~\n\n");
		}
		System.out.printf("주문 끝!");
	}
}
