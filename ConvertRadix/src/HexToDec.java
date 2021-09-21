import java.util.Scanner; // 입력을 위한 클래스 import

public class HexToDec {

	public static void main(String[] args) {
		
		String hexNum; // 문자가 포함된 16진수를 입력받기 위한 변수 생성
		int num; // 입력받은 16진수를 정수형으로 변환하여 저장할 변수 생성
		
		Scanner sc = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
		
		System.out.print("16진수를 입력하세요: ");
		hexNum = sc.next(); // 16진수를 문자열 형태로 입력받아 hexnum에 저장 
		
		num = Integer.parseInt(hexNum, 16); // 입력받은 문자열을 parseInt함수를 통해 16진수에 맞춰 정수형으로 변환
		
		System.out.printf("입력한 16진수 \"%X\" 는 10진수로 \"%d\" 입니다. \n", num, num); // 출력

	}

}
