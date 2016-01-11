import java.util.ArrayList;

public class PayGrafic {
	int x;
	ArrayList<Double> listToPay = new ArrayList<Double>();
	GetTerms gain = new GetTerms();
	Calculate calc = new Calculate();
	public void Get(){
		listToPay = calc.PayList();
		for(x=0;x<listToPay.size();x++){
			System.out.println(listToPay.get(x));			
		}
	}
}
