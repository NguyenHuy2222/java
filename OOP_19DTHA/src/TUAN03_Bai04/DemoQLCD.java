package TUAN03_Bai04;
import java.util.Scanner;



public class DemoQLCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DanhSachCD ds = new DanhSachCD();
		System.out.println("Nhap so luong CD: ");
		
		int n =sc.nextInt();
		ds.NhapDSCD(n);
	}

}
