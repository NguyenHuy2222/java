package TUAN03;
import java.util.Scanner;
public class DemoCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CD cd1 = new CD(0, null, 0, 0);
		cd1.Nhap1CD();
		cd1.Xuat1CD();
		if(cd1.getMaCD() != 999999) {
			cd1.setGiaCD(10.0);
		}
		
		cd1.Xuat1CD();
		CD cd2 = new CD(0, null, 0, 0);
		cd2.Nhap1CD();
		cd2.Xuat1CD();
		if(cd2.getMaCD() != 999999) {
			cd2.setGiaCD(10.0);
		}
		cd2.Xuat1CD();
		CD cd3 = new CD(0, null, 0, 0);
		System.out.println("Dia CD co so bai hat lon hon la:");
		if(cd1.getSobh() >cd2.getSobh()) {
			cd1.Xuat1CD();
		}
		else {
			cd2.Xuat1CD();
		}
	}

}
