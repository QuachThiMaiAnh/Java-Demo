package Hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
//		int a = 6;
//		int b = 9;
//		int c = a + b;
//		System.out.println("Sum: " + c);
////		Kết thúc câu lệnh là dấu ;
//		int test = 20 + 9 * 3 - 10 / 2;
////		Kết quả thì sd với dấu cộng
//		System.out.println("Kết quả là: " + test);
////		In ra màn hình console
////		Không xuống dòng
//		System.out.print("abc");
////		Có xuống dòng
//		System.out.println("123");
//		System.out.println("1234");
//// 	In ra kết quả có định dạng: print format
//		System.out.printf("có %d người đăng ký ", 40000);
//		System.out.println();
//		System.out.printf("có %.3f người đăng ký", 40.123456);
//		System.out.println();
//		System.out.printf("có %s người đăng ký", "Mai Anh ");
//		System.out.println();
//		System.out.println("Bài tập VD: ");
//		String name = "Mai Anh";
//		int age = 22;
//		System.out.println("-------------In ra kết quả có xuống dòng-------------");
//		System.out.println("Tên: " + name);
//		System.out.println("Tuổi: " + age);
//		System.out.println("-------------In ra kết quả mà không xuống dòng-------------");
//		System.out.print("Tên: " + name + "\nTuổi: " + age);
//		System.out.println();
//		System.out.println("-------------In ra kết quả có định dạng format-------------");
//		System.out.printf("Tên là %s ", name);
//		System.out.println();
//		System.out.printf("Tuổi bằng %d ", age);
//		java.util.Scanner là công cụ được java hỗ trợ sẵn, dùng để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số a=  ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào số b=  ");
		int b = scanner.nextInt();
		System.out.println("Số lớn hơn là :" + Math.pow(a, b));
		scanner.close();

	}
}
