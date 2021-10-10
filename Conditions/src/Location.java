import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		
			
		
		Scanner s = new Scanner(System.in);
		float x=1, y=1;
		int num = 0;
			
		while(x!=0 && y!=0) {
			System.out.printf("\n---------------\nx와 y를 입력해주세요: ");
			x = s.nextFloat();
			y = s.nextFloat();
			
			if (x>0 && y>0) num = 1;
			else if (x<0 && y>0) num = 2;
			else if (x<0 && y<0) num = 3;
			else if (x>0 && y<0) num = 4;
			else System.out.printf("올바른 좌표값을 입력해주세요. ", num);
			
			System.out.printf("해당 좌표는 %d사분면 입니다. ", num);
		}
	}

}
