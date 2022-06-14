import java.util.Scanner;

public class Zadani{
	
	Scanner scanner = new Scanner(System.in);
	
	Zadani(){
		
		System.out.println("Zapiste REALNE SLOZKY, pokud neznate, stisknete Enter: ");
		System.out.println("R: ");
		double rhodnota_R = scanner.nextDouble();
		System.out.println("f: ");
		double rhodnota_f = scanner.nextDouble();
		System.out.println("UR: ");
		double rhodnota_UR = scanner.nextDouble();
		System.out.println("UL: ");
		double rhodnota_UL = scanner.nextDouble();
		System.out.println("UC: ");
		double rhodnota_UC = scanner.nextDouble();
		System.out.println("U: ");
		double rhodnota_U = scanner.nextDouble();
		System.out.println("I: ");
		double rhodnota_I = scanner.nextDouble();
		System.out.println("IR: ");
		double rhodnota_IR = scanner.nextDouble();
		System.out.println("IL: ");
		double rhodnota_IL = scanner.nextDouble();
		System.out.println("IC: ");
		double rhodnota_IC = scanner.nextDouble();
		System.out.println("S: ");
		double rhodnota_S = scanner.nextDouble();
		System.out.println("P: ");
		double rhodnota_P = scanner.nextDouble();
		
		System.out.println("Zapiste IMAGINARNI SLOZKY, pokud neznate, stisknete Enter: ");
		System.out.println("UR: ");
		double ihodnota_UR = scanner.nextDouble();
		System.out.println("UL: ");
		double ihodnota_UL = scanner.nextDouble();
		System.out.println("UC: ");
		double ihodnota_UC = scanner.nextDouble();
		System.out.println("U: ");
		double ihodnota_U = scanner.nextDouble();
		System.out.println("I: ");
		double ihodnota_I = scanner.nextDouble();
		System.out.println("IR: ");
		double ihodnota_IR = scanner.nextDouble();
		System.out.println("IL: ");
		double ihodnota_IL = scanner.nextDouble();
		System.out.println("IC: ");
		double ihodnota_IC = scanner.nextDouble();
		System.out.println("S: ");
		double ihodnota_S = scanner.nextDouble();
		System.out.println("Q: ");
		double ihodnota_Q = scanner.nextDouble();
		
		System.out.println("Je to správně?");
		System.out.println("R: "+rhodnota_R);
		System.out.println("f: "+rhodnota_f);
		System.out.println("UR: "+rhodnota_UR+ihodnota_UR+"j");
		System.out.println("UL: "+rhodnota_UL+ihodnota_UL+"j");
		System.out.println("UC: "+rhodnota_UC+ihodnota_UC+"j");
		System.out.println("U: "+rhodnota_U+ihodnota_U+"j");
		System.out.println("I: "+rhodnota_I+ihodnota_I+"j");
		System.out.println("IR: "+rhodnota_IR+ihodnota_IR+"j");
		System.out.println("IL: "+rhodnota_IL+ihodnota_IL+"j");
		System.out.println("IC: "+rhodnota_IC+ihodnota_IC+"j");
		System.out.println("S: "+rhodnota_S+ihodnota_S+"j");
		System.out.println("P: "+rhodnota_P);
		System.out.println("Q: "+ihodnota_Q+"j");
		
		
		
		
		
	}
		
}
