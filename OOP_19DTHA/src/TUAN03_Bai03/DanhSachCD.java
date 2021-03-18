package TUAN03_Bai03;

import java.util.Scanner;



public class DanhSachCD {
	CD[] dsCD;//= new CD[n]; 
	DanhSachCD[] cd;
	
	
	public void NhapDSCD(int n) {
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Nhap thong tin CD thu "+(i+1));
			
			cd[i]=new DanhSachCD();
			dsCD[i].Nhap1CD();
			
		}
	}
	public void XuatDSCD() {
		int n = 0;
		CD[] dsCD= new CD[n]; 
		for(int i = 0 ; i < n ; i++) {
			dsCD[i].Xuat1CD();
		}
	}
}

