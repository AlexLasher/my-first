
public class Main {

	public static void main(String[] args) {
		GetTerms gain = new GetTerms();
		Calculate calc = new Calculate();
		PayGrafic graf = new PayGrafic();
		gain.Terms();
		calc.Announcement();
		calc.Calc();
		calc.PrintDeal();
		graf.Get();
	}

}
