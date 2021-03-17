package TUAN03;
import java.util.Scanner;

public class CD {
	
	public CD(int maCD, String tenCD, int sobh, double giaCD) {
		
		
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.sobh = sobh;
		this.giaCD = giaCD;
	}
	
	Scanner sc = new Scanner(System.in);
	private int maCD;
	private String tenCD;
	private int sobh;
	private double giaCD;
	
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
}
