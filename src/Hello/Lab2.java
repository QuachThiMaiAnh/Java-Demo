package Hello;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giải phương trình ax +b =0");
		System.out.println("Nhập a = ");
		double a = scanner.nextDouble();
		System.out.println("Nhập b= ");
		double b = scanner.nextDouble();
		System.out.println("Nhập c= ");
		double c = scanner.nextDouble();
//	Sử dụng câu lệnh điều kiện if
//		if (a == 0 && b == 0) {
//			System.out.println("Phương trình vô số nghiệm");
//		} else if (a == 0 & b != 0) {
//			System.out.println("Phương trình vô nghiệm");
//		} else {
//			System.out.println("Nghiệm = " + (-b / a));
//		}
		System.out.println("Giải phương trình bậc 2 ax^2 +bx+c=0");
		switch ((int) a) {
		case 0: {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				System.out.println("Nghiệm của pt = " + (-c / b));
			}
			break;
		}
		default: {
			double d = Math.pow(b, 2) - 4 * a * c;
			if (d < 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (d == 0) {
				System.out.println("Pt có nghiệm kép= " + (-b / (2 * a)));
			} else {
				System.out.println("Phương trình có 2 nghiệm x1= " + ((-b + Math.sqrt(d)) / (2 * a)));
				System.out.println("Phương trình có 2 nghiệm x2= " + ((-b - Math.sqrt(d)) / (2 * a)));
			}
			break;
		}
		}
		scanner.close();
	}
}
