import java.util.InputMismatchException;  // 입력 예외 처리를 위한 Class import
import java.util.Scanner;  // 입력을 위한 Class import

public class SumOfMultiple {

	public static void main(String[] args) {
		
		int start, end, mul;  // 입력값 저장할 변수 (시작 값, 끝 값, 배수 연산 기준 값)
		int sum = 0;  // 출력값 저장할 변수
		int i = 0;  // 반복문 제어를 위한 변수
		int status = 1;  // 종료 여부를 확인하는 변수
		
		Scanner input = new Scanner(System.in);  // 입력을 위한 Scanner 객체 생성
		
		while(true) {
			try {  
				System.out.printf("----------------------------\n합계의 시작 값을 입력하세요: ");
				start = input.nextInt();  // 첫 입력값을 정수형으로 start에 저장
			
				System.out.printf("합계의 끝 값을 입력하세요: ");
				end = input.nextInt();  // 두번째 입력값을 정수형으로 end에 저장
				
				System.out.printf("배수를 입력하세요: ");
				mul = input.nextInt();  // 두번째 입력값을 정수형으로 mul에 저장
			}
			catch(InputMismatchException e) {  // 정수가 아닌 값이 들어왔을 경우에 대한 예외 처리
				System.out.println("입력 값이 정수가 아닙니다. 처음부터 다시 입력해주세요!\n");
				continue;
			}

			for (i = start; i <= end; i++)  // i를 이용해 범위 순회
				if (i % mul == 0)  // i가 배수로 나누어떨어질 때,
					sum += i;  // 해당 i 값을 기존 sum값에 더한다.
			
			System.out.printf("\n -> %d부터 %d까지 %d배수의 합계는 \"%d\" 입니다.\n\n", start, end, mul, sum);  // 출력
			System.out.printf("종료하시려면 0을 입력해주세요: ");  // 종료 의사 질문
			
			try {
				status = input.nextInt();  // 종료 여부 입력
			}
			catch(InputMismatchException e) {  // 정수가 아닌 값이 들어왔을 경우에 대한 예외 처리
				input.next();  // 로그 출력값이 다음 입력으로 들어오는 현상 방지
				status = 1;  // 정수가 아닌 경우 모두 1로 취급
			}
			if (status == 0)  // 종료 여부 판단 후
				break;  // 무한 반복 종료
		}
		input.close();  // resource 누수 방지
		System.out.println("\n\n프로그램이 종료되었습니다!\n----------------------------");  // 프로그램 종료
	}
}



