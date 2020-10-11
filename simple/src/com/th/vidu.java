package com.th;
import java.util.Scanner;
public class vidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float height;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("height = ");
			height = scanner.nextInt();
			
		}while(height<=0);
		for(int i=1;i<height;i++) {
			for(int j = 1;j <= height -i;j++) {
				System.out.print("  ");
			}
			for(int k = 1;k <=2*i-1;k++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
