package basics;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int row_size= 3;
		int col_size=4;
		System.out.println("Enter 2D array values");
		Scanner sc=new Scanner(System.in);
		String[][] data=new String[row_size][col_size];
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				data[i][j]=sc.next();
			}
		}
		System.out.println();
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
