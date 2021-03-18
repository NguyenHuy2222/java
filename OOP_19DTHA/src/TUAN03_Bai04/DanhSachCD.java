package TUAN03_Bai04;
import java.util.Scanner;
public class DanhSachCD {
	private int ma;
    private String tuade;
    private int sobh;
    private double gia;

    public DanhSachCD() {
    }

    public DanhSachCD(int ma, String tuade, int sobh, double gia) {
        this.ma = ma;
        this.tuade = tuade;
        this.sobh = sobh;
        this.gia = gia;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma CD: ");
        ma = Integer.parseInt(sc.nextLine());
        if(ma<0){
            ma = 99999;
        }
        System.out.print("Nhap tua CD: ");  
        tuade = sc.nextLine();
        //sc.hasNextInt();
        System.out.print("\nNhap so bai hat : ");
        sobh = Integer.parseInt(sc.nextLine());
        System.out.print("\nNhap gia CD : ");
        gia=sc.nextDouble();
    }
    
    public void showInfo(){
        System.out.println("\nMa CD: " +ma);
        System.out.println("Tua CD: " +tuade);
        System.out.println("So bai hat: " +sobh);
        System.out.println("Gia CD: " +gia);
    }
    
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTuade() {
        return tuade;
    }

    public boolean setTuade(String tuade) {
        if(tuade != null){
            this.tuade = tuade;
            return true;
        }
        else{
            return false;
        }
    }

    public int getSobh() {
        return sobh;
    }

    public boolean setSobh(int sobh) {
        if(sobh > 0){
            this.sobh = sobh;
            return true;
        }
        else{
            return false;
        }
    }

    public double getGia() {
        return gia;
    }

    public boolean setGia(double gia) {
        if(gia > 0){
            this.gia = gia;
            return true;
        }
        else{
            return false;
        }
    }

}
