package com.th;
import java.util.Scanner;
public class Chunhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height,width;
		int i;
		Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("height = ");
            height = scanner.nextInt();
        }while(height <= 0);
        do {
            System.out.print("width = ");
            width = scanner.nextInt();
        }while(width <= 0);
        for( i = 1 ; i <= height; i++) {
        	for(int j=1 ;j <= width; j++) {
        		 if(i == 1 || i == height || j == 1 || j == width)
                     System.out.print("*  ");
                 else
                     System.out.print("   ");
        	}
        	System.out.println("");
        }
        scanner.close();
	}

}
