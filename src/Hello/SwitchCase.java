package Hello;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("| 1. Cộng	|");
		System.out.println("| 2. Trừ    |");
		System.out.println("| 3. Kết thúc   |");
		System.out.println("++++++++++++++++++++++++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int select = scanner.nextInt();
		switch (select) {
		case 1: {
			System.out.println("Bạn đã lựa mchọn phép cộng");
			break;
		}
		case 2: {
			System.out.println("Bạn đã lựa chọn phép trừ");
			break;
		}
		case 3: {
			System.out.println("Bạn đã lựa chọn kết thúc");
			break;
		}
		default:
//			throw new IllegalArgumentException("Unexpected value: " + select);
			System.out.println("Không tìm thấy " + select);
			System.exit(0);
		}
		scanner.nextInt();
		scanner.close();
	}
}
