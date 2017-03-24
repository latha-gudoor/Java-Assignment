//Fibbonocci Series

package com.wbl.Loops;

public class Fibbonocci {

	public void fibsequence(int n){
		if(n==0)
			System.out.println(0);
		else if (n==1)
			System.out.println("0 1");
		else{
			int first=0;
			int second=1;
			System.out.print("0  1");
			for(int i=1;i<=n;i++){
				int next = first+second;
				System.out.print(" "+ next + " ");
				first=second;
				second=next;

			}
		}
	}

	public static void main(String[] args) {

		Fibbonocci num= new Fibbonocci();

		num.fibsequence(5);

	}

}
