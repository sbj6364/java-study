import java.util.Scanner; // 입력을 위한 클래스 import

public class DecToHex {

	public static void main(String[] args) {
		
		int num; // 문자가 포함된 10진수를 입력받기 위한 변수 생성		
		Scanner sc = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
		
		System.out.print("10진수를 입력하세요: ");
		num = sc.nextInt(); // 10진수를 정수 형태로 입력받아 num에 저장 
		
		System.out.printf("입력한 10진수 \"%d\" 는 10진수로 \"%X\" 입니다. \n", num, num); // 해당 정수를 형태에 따라 출력

	}

}
