package com.wbl.Loops;

/*Write a program print "ping" if a number is divisible by 3,"pong" if a number 
 * is divisible by 5, and "ping pong" 
 * if number is divisible by both, else print the number.*/


public class PingPong_Divisible {

	public void divisionCheck(int a){
		if (a%3==0 && a%5==0){
			System.out.println(a + " is divisible by 3 and 5 : PingPong");
		}else if(a%3==0){
			System.out.println(a +" is divisible by 3 : Ping");
		}else if (a%5==0){
			System.out.println(a + " is divisible by 5 : Pong");

		}
		else{
			System.out.println(a + " is not divisible by 3 and 5");

		}
	}
	public static void main(String[] args) {

		PingPong_Divisible num = new PingPong_Divisible();
		num.divisionCheck(15);
		num.divisionCheck(10);
		num.divisionCheck(9);
		num.divisionCheck(11);
		}
	}
