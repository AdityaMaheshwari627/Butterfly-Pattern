//Butterfly Pattern
package Pattern;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter num:");
        int no=obj.nextInt();
        //upper half
        for(int i=1;i<=no;i++) {
        	//1st part
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	//spaces
        	int gap=2*(no-i);
        	for(int j=1;j<=gap;j++) {
        		System.out.print(" ");
        	}
        	//2nd part
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }	
        //lower half
        for(int i=no;i>=1;i--) {
        	//1st part
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	//space
        	int space=2*(no-i);
        	for(int j=1;j<=space;j++) {
        		System.out.print(" ");
        	}
        	//2nd part
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
