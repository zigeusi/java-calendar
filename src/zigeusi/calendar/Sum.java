package zigeusi.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		
//		System.out.println("더하기 할 수를 입력하세요");
//		Scanner scanner = new Scanner(System.in);
//		String inputValue = scanner.nextLine();
//		
//		String[] splitedValue = inputValue.split(",");
//		
//		int first = Integer.parseInt(splitedValue[0]);
//		int second  = Integer.parseInt(splitedValue[1]);
//		System.out.println(first + second);
		
		
		//입력: 키보드로 두 수의 입력을 받는다.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + "," + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//출력: 화면의 두 수의 합을 출력한다.
		System.out.printf("%d와 %d의 합은 %d입니다",a,b, a+b);
		scanner.close();
	}
}
