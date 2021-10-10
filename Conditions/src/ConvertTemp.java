import java.util.Scanner;

// 입력: 문자, 온도
// 출력: 바꾼 결과

//(조건) F=(9.0/5.0)*C + 32
//   	C=(5.0/9.0)*(F-32)

public class ConvertTemp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c; // 문자
		float temp = 0, result = 0;
		
		System.out.printf("온도를 입력해 주세요: ");
		c = s.next().charAt(0);
		temp = s.nextFloat();
		
		if(c == 'F' || c == 'f')
			result = (float) ((5.0 / 9.0) * (temp - 32.0));
		else if(c == 'C' || c == 'c')
			result = (float) ((9.0 / 5.0) * temp + 32.0);
		
		System.out.printf("변환 후 온도는 %f 입니다. ", result);
	}

}
