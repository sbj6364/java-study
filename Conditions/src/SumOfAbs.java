import java.util.Scanner;

public class SumOfAbs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float x = 0, y = 0;
		float result = 0;
		
		System.out.printf("\nx와 y를 입력해주세요: ");
		x = s.nextFloat();
		y = s.nextFloat();
		
		if(x>0 && y>0)
			result = x + y;
		else if(x>0 && y<=0)
			result = x - y;
		else if(x<=0 && y>0)
			result = - x + y;
		else
			result = - x - y;
		
		System.out.printf("결과: %f", result);

	}

}
