import java.util.Scanner;

// 입력: h 신장, w 몸무게
// 출력: bmi BMI 정도
// BMI = 몸무게 kg / (신장 * 신장) m^2

// 공식 기준(https://www.oc.go.kr/health/contents.do?key=1487&)에 따르면,
// BMI가 18.5 이하면 저체중
// 18.5 ~ 22.9 사이면 정상
// 23.0 ~ 24.9 사이면 과체중
// 25.0 이상부터는 비만


public class BMICalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float h = 0, w = 0; // 키, 몸무게 변수 선언
		float bmi = 0;
		
		System.out.printf("\n키와 몸무게를 입력해주세요: ");
		h = s.nextFloat();
		w = s.nextFloat();
		
		h = h/100; // 키 입력이 cm이므로 미터로 변환하는 과정
		
		bmi = w / (h*h); // bmi 공식
		
		if (bmi <= 18.5)
			System.out.printf("당신의 BMI는 %.2f (으)로, 저체중입니다. ", bmi);
		else if (bmi <= 22.9)
			System.out.printf("당신의 BMI는 %.2f (으)로. 정상입니다. ", bmi);
		else if (bmi < 25.0)
			System.out.printf("당신의 BMI는 %.2f (으)로. 과체중입니다. ", bmi);
		else
			System.out.printf("당신의 BMI는 %.2f (으)로. 비만입니다. ", bmi);

	}

}
