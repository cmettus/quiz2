package tuition;

import java.util.Scanner;

public class costincrease {
	public static void main(String args[]){
	int tuition;
	Scanner in = new Scanner(System.in);
	System.out.println("What is the Tuition cost of your school?");
	tuition=in.nextInt();
	System.out.println(String.format("%.2f",costcalculator(tuition)));
	}
	public static double costcalculator(int tuition){
		int years=0;
		double total=0;
		double cost=tuition;
		double pctincrease;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the percentage increase in Tuition cost of your school?");
		pctincrease=in.nextDouble()/100;
		while(years<4){
			total+=cost;
			cost+=tuition*pctincrease;
			years++;
		}
		return total;
	}
}
