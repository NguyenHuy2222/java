package TUAN03_Bai04;
import java.util.Scanner;



import java.util.Scanner;

public class DanhSachCD {

	Scanner sc = new Scanner(System.in);
	CD[] dsCD;
	private int maCD;
	private String tenCD;
	private int sobh;
	private double giaCD;
	private int soluong;
	
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD>0) {
			this.maCD = maCD;
		}
		else
			this.maCD=999999;
	}
	public String getTenCD() {
		return tenCD;
	}
	public void setTenCD(String tenCD) {
		
		this.tenCD = tenCD;
	}
	public int getSobh() {
		return sobh;
	}
	public void setSobh(int sobh) {
		if(sobh > 0)
		this.sobh = sobh;
	}
	public double getGiaCD() {
		return giaCD;
	}
	public void setGiaCD(double gia) {
		if(giaCD>0)
		this.giaCD = gia;
	}
	public void Nhap1CD() {
		System.out.println("Nhap ma CD: ");
		maCD = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ten CD: ");
		sc.hasNext();
		tenCD = sc.nextLine();
		System.out.println("Nhap so bai hat: ");
		sobh = sc.nextInt();
		
		System.out.println("Nhap gia CD: ");
		giaCD = sc.nextFloat();
	}
	public void Xuat1CD() {
		
		System.out.println("Ma CD: " + maCD +" \tTua CD: "+ tenCD +"\tSo bai hat trong CD: "+ sobh + " \tGia CD: "+ giaCD );
	}
	public void NhapDSCD(int soluong) {
		dsCD = new CD[soluong];
		for(int i = 0 ; i < soluong ; i++) {
			System.out.println("Nhap dia CD thu: "+ (i+1));
			dsCD[i].Nhap1CD();
			
		}
	}
}
