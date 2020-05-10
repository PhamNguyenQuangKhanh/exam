import java.util.Scanner;
import java.util.Random;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  diemKetThucA, diemKetThucB, diemKetThucC, diemKetThucD, diemKetThucE, diemTrungBinh;
		String datXepLoai = null;
	
		String n;
		String y;
		String a;
		
		//nhập thông tin sinh viên
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nhập họ tên sinh viên: ");
		n= scanner.nextLine();
		System.out.println("Nhập ngày tháng năm sinh: ");
		y = scanner.nextLine();
		System.out.println("Nhập mã số sinh viên: ");
		a = scanner.nextLine();
		
		//suất ra thông tin sinh viên
		System.out.println("Họ tên sinh viên: " + n);
		System.out.println("ngày tháng năm sinh:"+ y);
		System.out.println("mã số sinh viên: " + a); 
		System.out.println("-----------");

		//random điểm 5 môn
		Random random = new Random();
		int number = random.nextInt(11);  // trả về 1 số nguyên nằm trong phạm vi [0...n-1]
		int number1 = random.nextInt(11);
		int number2 = random.nextInt(11);
		int number3 = random.nextInt(11);
		int number4 = random.nextInt(11);
		int number5 = random.nextInt(11);
		int number6 = random.nextInt(11);
		int number7 = random.nextInt(11);
		int number8 = random.nextInt(11);
		int number9 = random.nextInt(11);
		
		
		//suất điểm đã random
			diemKetThucA = (number * 0.7 + number1 * 0.3);
			System.out.println("Môn A điểm70% là: "+ number  + " _Điểm30% là: "+ number1); 
			System.out.println("Điểm kết thúc của môn A: "+(Math.round(diemKetThucA)));
			if (diemKetThucA>= 5) {
				System.out.println("môn A đậu");
			} else {
				System.out.println("Môn A rớt");
			}
			//-------------------------------------------------------------------------------
			System.out.println("----------");
			diemKetThucB = (number2 * 0.7 + number3 * 0.3);
			System.out.println("Môn B điểm70% là: "+ number2 + " _Điểm30% là: "+ number3);	
			System.out.println("Điểm kết thúc của môn B: "+(Math.round(diemKetThucB ))); 
			if (diemKetThucB>= 5) {
				System.out.println("môn B đậu");
			} else {
				System.out.println("Môn B rớt");
			}
			
			//---------------------------------------------------------------------------------
			System.out.println("----------");
			diemKetThucC = (number4 * 0.7 + number5 * 0.3);
			System.out.println("Môn C điểm70% là: "+ number4 + " _Điểm30% là: "+ number5);
			System.out.println("Điểm kết thúc của môn C: "+(Math.round(diemKetThucC ))); 
			if (diemKetThucC>= 5) {
				System.out.println("môn C đậu");
			} else {
				System.out.println("Môn C rớt");
			}
			
			//--------------------------------------------------------------------------------
			System.out.println("----------");
			diemKetThucD = (number6 * 0.7 + number7 * 0.3);
			System.out.println("Môn D điểm70% là: "+ number6 + " _Điểm30% là: "+ number7);
			System.out.println("Điểm kết thúc của môn D: " + (Math.round(diemKetThucD ))); 
			if (diemKetThucD>= 5) {
				System.out.println("môn D đậu");
			} else {
				System.out.println("Môn D rớt");
			}			
			
			//---------------------------------------------------------------------------------
			System.out.println("----------");
			diemKetThucE = (number8 * 0.7 + number9 * 0.3);
			System.out.println("Môn E điểm70% là: "+ number8 + " _Điểm30% là: "+ number9);
			System.out.println("Điểm kết thúc của môn E: "+ (Math.round(diemKetThucE ))); 
			if (diemKetThucE>= 5) {
				System.out.println("môn E đậu");
			} else {
				System.out.println("Môn E rớt");
			}
			System.out.println("----------");
			
			//điểm cuối kì= (điểm kết thúc học phần x số tín chỉ mỗi môn) / cho tổng số tín chỉ 
			diemTrungBinh = (((diemKetThucA + diemKetThucB + diemKetThucC + diemKetThucD + diemKetThucE) * 3) / 15);
			
			//điểm cuối kì
			System.out.println("Điểm trung bình học kì là:  "+ (Math.round(diemTrungBinh)));
			if (diemTrungBinh >= 9) {
				datXepLoai = "Giỏi";
			} else if (diemTrungBinh >= 7) {
				datXepLoai = "Khá";
			} else if (diemTrungBinh >= 5) {
				datXepLoai = "Trung Bình";
			} else if (diemTrungBinh <= 5) {
				datXepLoai = "Yếu";
			}
			System.out.println("xếp loại: "+ datXepLoai );
}
		
}				 
	
		
		
	
				
	
		
	

			
			
			
