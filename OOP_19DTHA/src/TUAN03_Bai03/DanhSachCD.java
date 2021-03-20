package TUAN03_Bai03;

import java.util.Scanner;



public class DanhSachCD {
	CD[] dsCD;//= new CD[n]; 
	DanhSachCD[] cd;
	private int sl = 0;
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public void NhapDSCD(int n) {
		dsCD = new CD[n];
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Nhap thong tin CD thu "+(i+1));
			
			//cd[i]= new DanhSachCD();
			dsCD[i] = new CD();
			dsCD[i].Nhap1CD();
			sl++;
		}
	}
	public void XuatDSCD() {
		int n = dsCD.length;
		//CD[] dsCD= new CD[n]; 
		for(int i = 0 ; i < n ; i++) {
			dsCD[i].Xuat1CD();
		}
	}
	
}

