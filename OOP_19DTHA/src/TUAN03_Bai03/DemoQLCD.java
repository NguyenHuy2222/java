package TUAN03_Bai03;
import java.util.Scanner;
public class DemoQLCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nhap so luong cd: ");
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		DanhSachCD cd = new DanhSachCD();
		cd.NhapDSCD(n);
		cd.XuatDSCD();
		
	}

}
