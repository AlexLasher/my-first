import java.util.ArrayList;

public class Calculate {
	ArrayList<Double> list = new ArrayList<Double>();
	static double proc, loanPay,loanAm,monthProc,monProcDebt,loanAmCountable1,loanAmCountable2;
	int monthsPayed;
	boolean ifCanPay;
	public void Announcement(){
		GetTerms terms = new GetTerms();
		proc = terms.ProcRate();
		loanPay = terms.LoanP();
		loanAm = terms.LoanAmount();
		System.out.println("���������� ������ ����� " + proc+"%");
		System.out.println("����������� ������ ����� " +loanPay+"�.");
		System.out.println("����� ������� ����� "+loanAm+"�.");
	}
	
	public void Calc(){
		
		monthProc = ((loanAm*(proc/100))/365)*30;
		if(loanPay>monthProc){
		loanAmCountable1=loanAm;
			while(loanAmCountable1>0){
			monthProc = ((loanAm*(proc/100))/365)*30;
			monProcDebt = monthProc + loanAmCountable1;
			loanAmCountable1 = monProcDebt - loanPay;
			list.add(monthProc);
			monthsPayed++;
			}
			ifCanPay=true;
			
		}
		else{
			ifCanPay=false;
		}
	
	}

	public void PrintDeal(){
		if(ifCanPay=true){
			System.out.println("���� ������ ����� ������� �� "+monthsPayed+" �������");
		}else
			System.out.println("����������� �������� ������ ��� ����������� ������");
	}
	public ArrayList<Double> PayList(){
		loanAmCountable2=loanAm;
		monthsPayed=0;
		while(loanAmCountable2>0){
			monthProc = ((loanAmCountable2*(proc/100))/365)*30;
			monProcDebt = monthProc + loanAmCountable2;
			loanAmCountable2 = monProcDebt - loanPay;
			monthProc = Math.rint(monthProc*100)/100;
			list.add(monthProc);
			monthsPayed++;
			}
		return list;
		
	}
}
