import java.util.Scanner;

public class Zadani{
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	Zadani(){

		System.out.println("Zapiste REALNE SLOZKY, pokud neznate, stisknete Enter: ");
		System.out.println("R: ");
		String rhodnota_R = scanner.nextLine();
		System.out.println("f: ");
		String rhodnota_f = scanner.nextLine();
		System.out.println("UR: ");
		String rhodnota_UR = scanner.nextLine();
		System.out.println("UL: ");
		String rhodnota_UL = scanner.nextLine();
		System.out.println("UC: ");
		String rhodnota_UC = scanner.nextLine();
		System.out.println("U: ");
		String rhodnota_U = scanner.nextLine();
		System.out.println("I: ");
		String rhodnota_I = scanner.nextLine();
		System.out.println("IR: ");
		String rhodnota_IR = scanner.nextLine();
		System.out.println("IL: ");
		String rhodnota_IL = scanner.nextLine();
		System.out.println("IC: ");
		String rhodnota_IC = scanner.nextLine();
		System.out.println("S: ");
		String rhodnota_S = scanner.nextLine();
		System.out.println("P: ");
		String rhodnota_P = scanner.nextLine();
		
		System.out.println("Zapiste IMAGINARNI SLOZKY, pokud neznate, stisknete Enter: ");
		System.out.println("UR: ");
		String ihodnota_UR = scanner.nextLine();
		System.out.println("UL: ");
		String ihodnota_UL = scanner.nextLine();
		System.out.println("UC: ");
		String ihodnota_UC = scanner.nextLine();
		System.out.println("U: ");
		String ihodnota_U = scanner.nextLine();
		System.out.println("I: ");
		String ihodnota_I = scanner.nextLine();
		System.out.println("IR: ");
		String ihodnota_IR = scanner.nextLine();
		System.out.println("IL: ");
		String ihodnota_IL = scanner.nextLine();
		System.out.println("IC: ");
		String ihodnota_IC = scanner.nextLine();
		System.out.println("S: ");
		String ihodnota_S = scanner.nextLine();
		System.out.println("Q: ");
		String ihodnota_Q = scanner.nextLine();
		
		System.out.println("Je to správně?");
		System.out.println("R: ("+rhodnota_R+") Ω");
		System.out.println("f: ("+rhodnota_f+") Hz");
		System.out.println("UR: ("+rhodnota_UR+" + "+ihodnota_UR+"j) V");
		System.out.println("UC: ("+rhodnota_UC+" + "+ihodnota_UC+"j) V");
		System.out.println("UL: ("+rhodnota_UL+" + "+ihodnota_UL+"j) V");
		System.out.println("U: ("+rhodnota_U+" + "+ihodnota_U+"j) V");
		System.out.println("I: ("+rhodnota_I+" + "+ihodnota_I+"j) A");
		System.out.println("IR: ("+rhodnota_IR+" + "+ihodnota_IR+"j) A");
		System.out.println("IL: ("+rhodnota_IL+" + "+ihodnota_IL+"j) A");
		System.out.println("IC: ("+rhodnota_IC+" + "+ihodnota_IC+"j) A");
		System.out.println("S: ("+rhodnota_S+" + "+ihodnota_S+"j) VA");
		System.out.println("P: "+rhodnota_P+" W");
		System.out.println("Q: "+ihodnota_Q+"j) var");
		
	}
}