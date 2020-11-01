package huy.com;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// PHAM Khac Dat KKK
		int size;   
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào độ dài của mảng: ");
	    size= scanner.nextInt();
	         
	  	    int[] array = new int[size];
	         
	  
	    for (int i = 0; i < size; i++) {
	        System.out.println("Nhập vào phần tử thứ " + i + ": ");
	        array[i] = scanner.nextInt();   // nhập giá trị cho phần tử
	    }
	         
	  
	    for (int i = 0; i < size; i++) {
	        System.out.println("Phần tử thứ " + i + ": " + array[i]);
	    }	
}
}