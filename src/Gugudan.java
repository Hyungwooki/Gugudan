import java.util.Scanner;
public class Gugudan {
	public static void main (String [] a) {
		System.out.println("8,9단 값 입력 및 조건문 연습");
		System.out.println("구구단을 외자 구구단을 외자 ! : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = 1; i < 10; i ++) {
		System.out.println(number * i);
		}
		
		if (number < 2) {
			System.out.println("수가 2보다 작습니다");
		} else if(number > 9) {
			System.out.println("수가 9보다 큽니다");
		} else {
			System.out.println("앙 기모띠");
		}
	}
}