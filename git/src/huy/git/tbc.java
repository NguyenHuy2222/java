package huy.git;
import java.util.Scanner;
public class tbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    int[] soNguyen;
	    float ketQua = 0;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Nhap n:");
	    n = sc.nextInt();
	    soNguyen = new int[n];
	    for (int i = 0; i < n; i++)
	    {
	       System.out.println("Nhap so nguyen:");
	       soNguyen[i] = sc.nextInt();
	    }

	    for (int i = 0; i < n; i++)
	       ketQua += soNguyen[i];
	       ketQua = ketQua/n;

	    System.out.println("Trung binh cong: " + ketQua);
	}

}
