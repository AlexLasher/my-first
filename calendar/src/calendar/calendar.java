package calendar;
import java.util.Scanner;
public class calendar {
	public static double corectirovka,viscosThousand,viscosThousandDouble,viscosHundred,viscos,daysInYears,daysInMonths,
	viscosLi,countYearsDouble, yearDouble,yearHundredDouble;
	
	public static int corectirovkaInt,viscosThousandInt,yearHundredInt,countYearsInt,
	monday,tuesday,wednesday,thursday,friday,saturday,sunday,
	x,countable,i,day,year,month,jan,feb,febS,febV,mar,apr,may,jun,jul,aug,sep,oct,nov,dec;
	
	public static String corectirovkaString,date,day_str,month_str,year_str,viscosString;
	
	public static void main(String[] args) {
		monday = 1;tuesday = 2;wednesday = 3;thursday = 4;friday = 5;saturday = 6;sunday = 7;
		
		jan = 31;febS = 28;febV = 29;mar = 31;apr = 30;may = 31;jun = 30;
		jul = 31;aug = 31;sep = 30;oct = 31;nov = 30;dec = 31;
		
		System.out.println("¬ведите дату в формате дд.мм.гггг");	// считываем дату
		Scanner scn_date = new Scanner(System.in);
		date = scn_date.next();	
		System.out.println(date);
		day_str = date.substring(0,2);
		day = Integer.parseInt(day_str);
		month_str = date.substring(3,5);
		month = Integer.parseInt(month_str);
		year_str = date.substring(6);
		year = Integer.parseInt(year_str);							// считали и записали переменные отдельно число, мес€ц и год

		countYearsInt = (year - 1900)/4;							// провер€ем не високосный ли год
		yearDouble = year;
		yearHundredDouble = yearDouble/100;							// каждый сотый год не високосный(1800, 1900 и т.д.)
		yearHundredInt = year/100;
		viscosHundred = yearHundredDouble - yearHundredInt;
		viscosThousandDouble = yearDouble/1000;						// а вот каждый тыс€чный - високосный
		viscosThousandInt = year/1000;
		viscosThousand = viscosThousandDouble - viscosThousandInt;
		countYearsDouble = (yearDouble - 1900)/4;
		daysInYears = (countYearsInt*1461) + ((countYearsDouble - countYearsInt)/0.25)*365;
		System.out.println(daysInYears);
		viscosString = Integer.toString(countYearsInt);
		viscos = Double.parseDouble(viscosString);
		viscosLi = countYearsDouble - viscos;
		corectirovka = (yearDouble/100 - 19) - (yearDouble/1000);
		viscosString = Integer.toString(countYearsInt);
		corectirovkaString = Double.toString(corectirovka);
		corectirovkaInt = Integer.parseInt(corectirovkaString);
		daysInYears = daysInYears - corectirovkaInt;
		System.out.println(daysInYears);
		if (viscosLi != 0 || viscosHundred == 0){					// указываем сколько в феврале указанного в дате года дней
			if(viscosThousand != 0){feb = febS;}
				else{feb = febV;}
		} else {
			feb = febV;
		}
		switch (month) {
	    case 1:  daysInMonths = 0;
	             break;
	    case 2:  daysInMonths = 31;
	             break;
	    case 3:  daysInMonths = 31+feb;
	             break;
	    case 4:  daysInMonths = 31+feb+31;
	             break;
	    case 5:  daysInMonths = 31+feb+31+30;
	             break;
	    case 6:  daysInMonths = 31+feb+31+30+31;
	             break;
	    case 7:  daysInMonths = 31+feb+31+30+31+30;
	             break;
	    case 8:  daysInMonths = 31+feb+31+30+31+30+31;
	             break;
	    case 9:  daysInMonths = 31+feb+31+30+31+30+31+31;
	             break;
	    case 10: daysInMonths = 31+feb+31+30+31+30+31+31+30;
	             break;
	    case 11: daysInMonths = 31+feb+31+30+31+30+31+31+30+31;
	             break;
	    case 12: daysInMonths = 31+feb+31+30+31+30+31+31+30+31+30;
	             break;
	    default: System.out.println("Fucking bullshit!!!");;
	             break;
	}
		System.out.println(daysInMonths);
	}
}
