// week 2:

package week2;

import java.util.Scanner;

class VarLenArgs{
	double mean(int ... a){
		double m = 0;

		for(int i:a) m += i;

		return m/a.length;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		VarLenArgs v = new VarLenArgs();

		System.out.print("Enter number of elements: ");
		int n = scan.nextInt();

		int data[] = new int [n];

		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++){
			data[i] = scan.nextInt();
		}

		double m = v.mean(data);

		System.out.print("Mean of the data = "+m);
		
		scan.close();
	}
}