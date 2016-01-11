import java.util.Scanner;

public class GetTerms {
	static double pRate, loanPay, loanAm;
	public void Terms(){
		Scanner scn_pRate = new Scanner(System.in);
		pRate = scn_pRate.nextDouble();
		Scanner scn_loanPay = new Scanner(System.in);
		loanPay = scn_loanPay.nextDouble();
		Scanner scn_loanAm = new Scanner(System.in);
		loanAm = scn_loanAm.nextDouble();
	}
	public double ProcRate(){
		return pRate;
	}
	public double LoanP(){
		return loanPay;
	}
	public double LoanAmount(){
		return loanAm;
	}
}
