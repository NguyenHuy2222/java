package TUAN03_Bai04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class DemoQLCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DanhSachCD> cdList = new ArrayList<>();
		DanhSachCD cd = new DanhSachCD();
        int choose;
        Scanner sc = new Scanner(System.in);
        do{
            Menu();
            System.out.println("Lua chon: ");
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:
                    int n;
                    System.out.print("\nNhap so CD can them: ");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i=0; i<n; i++){
                        
                        System.out.println("CD thu " +(i+1)+ ": ");
                        cd.inputInfo();
                        cdList.add(cd);
                    }
                    break;
                    
                case 2:
                    for(int i=0; i<cdList.size(); i++){
                        cdList.get(i).showInfo();
                    }
                    break;
                    
              
                case 3:
                	
                	cd.inputInfo();
                    cdList.add(cd);
                    break;
              
                case 5:
                    System.out.println("End");
                    System.exit(0);
                    break;
                    
                default:
                    System.err.println("Nhap lai!");
                    break;
            }
        }while(choose != 0);
    }
    static void Menu(){
        System.out.println("1. Nhap thong tin CD");
        System.out.println("2. Xuat thong tin CD");
        System.out.println("3. Them 1 CD");
        System.out.println("5. Thoat");
    }

}
