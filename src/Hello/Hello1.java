package Hello;

import java.util.Scanner;

public class Hello1 {
	public static void main(String[] args) {
//	Thư viện cho phép nhận một gì đó từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm trung bình: ");
		double score = scanner.nextDouble();
		System.out.println(name + " có điểm trung bình =  " + score);
		System.out.println("Tên: " + name);
//		Rint làm tròn lên
		System.out.println("Điểm = " + Math.rint(score));
		scanner.close();
	}
}
