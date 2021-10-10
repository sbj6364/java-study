import java.util.Scanner;

// 입력: sex, h, w
// 출력: status 비만
// 조건
// 비만도 : 10% 미만 저체중
// ±10% 정상,
// 10~20% 과체중,
// 20%초과 비만


// 비만지수를 구한다.
// 그리고 비만지수를 조건에 따라 나눠서 현재 상태를 출력한다.
// 비만지수를 구하려면 표준체중이 필요하다.
// 표준체중은 남자일 경우 신장제곱 *22
// 여자일 경우 신장제곱 *21

public class Obesity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String gender; // 성별 저장
		float h = 0, w = 0, std = 0; // 키, 몸무게, 표준체중 변수 선언
		float obesity = 0;
		
		
		System.out.printf("male / female: ");
		gender = s.next();
		System.out.printf("\n키: ");
		h = s.nextFloat();
		System.out.printf("\n몸무게: ");
		w = s.nextFloat();
		
		h = h/100;
		
		if(gender.equals("male")) // 동일 문자열 여부 비교
			std = h * h * 22;
		else if(gender.equals("female"))
			std = h * h * 21;

		obesity = w / std * 100;
		
		
		if (obesity < 90)  // -10% 미만
			System.out.printf("당신의 비만도는 %.2f (으)로, 저체중입니다. ", obesity);
		else if (obesity < 110)  // +_ 10%
			System.out.printf("당신의 비만도는 %.2f (으)로. 정상입니다. ", obesity);
		else if (obesity < 120)  // 10~20%
			System.out.printf("당신의 비만도는 %.2f (으)로. 과체중입니다. ", obesity);
		else  // 20% 이상
			System.out.printf("당신의 비만도는 %.2f (으)로. 비만입니다. ", obesity);
		
//		System.out.printf("\n표준체중: %s %f ", gender, std);
		

	}

}
