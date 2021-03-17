package TUAN03;
import java.util.Scanner;
import java.lang.*;
public class DanhSachCD {
	Scanner sc = new Scanner(System.in);
	CD[] dsCD;
	
	private int soluong;
	
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	
	public void NhapDSCD(int soluong) {
		dsCD = new CD[soluong];
		for(int i = 0 ; i < soluong ; i++) {
			System.out.println("Nhap dia CD thu: "+ (i+1));
			dsCD[i].Nhap1CD();
			
		}
	}
	
	/*public void XuatDSCD(int n) {
		
		for(int i=0;i<n;i++) {
			dsCD[i].Xuat1CD();
		}
	}*/
	
}
