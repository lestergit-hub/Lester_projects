/**
 * 
 */
package hw1;

import java.util.ArrayList;
/**
 * 
 */
import java.util.Scanner;
public class Sydiv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> nlist = new ArrayList<Double>();
		ArrayList<Double> anlist = new ArrayList<Double>();
		ArrayList<Integer> ex = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me the number next to x the divider");
		Double big = scan.nextDouble();
		String x = "";
		while(!x.equals("y")) {
			System.out.println("give me a number: ");
			Double newnum = scan.nextDouble();
			System.out.println("Give me exponent");
			int exp = scan.nextInt();
			ex.add(exp);
			if(ex.size()> 1 && !(ex.get(ex.size()-2)-1 == exp)) {
				nlist.add(0.0);
			}
			nlist.add(newnum);
			System.out.println();
			System.out.println("Is that it? ");
			 x = scan.next();
		}
		 System.out.println(nlist);
		 anlist.add(nlist.get(0));
		for(int i = 0; i<nlist.size()-1; i++) {
		Double ans = nlist.get(i+1)+ anlist.get(i)*big;
		anlist.add(ans);
			
		}
		int bigx = ex.get(0);
		for(int i = 0; i<anlist.size(); i++) {
			bigx--;
			if(anlist.get(i)!= 0.0) {
				
			if(nlist.get(nlist.size()-1)== nlist.get(i)) {
				System.out.print(" Remainder: ");
			}
		System.out.print(anlist.get(i));
		if(bigx>0) {
			System.out.print("x^"+bigx);
		}
		
		if(anlist.get(i)>0 && i > nlist.size()-1) {
			System.out.print(" +");
		}
		
		System.out.print(" ");
		}
		}
		 

}
}