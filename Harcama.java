import java.util.Scanner;

public class Harcama {
	
	Investment investment = new Investment();
	
	public void harcama() {
		int miktar;
		int harcamaSonrasi=0;
		
		System.out.println("Harcamak istediginiz miktari giriniz: ");
		Scanner girdi = new Scanner(System.in);
		miktar=girdi.nextInt();
		
		if(investment.getUnstakeAltin()<miktar) 
		{
			System.out.println("islem onaylanamdı. Bakiye yetersiz");
		}
		else
		{
		  harcamaSonrasi= (int) (investment.getUnstakeAltin()- miktar);	
		  System.out.println("islem onaylandi. Guncel bakiyeniz: " +harcamaSonrasi);
		}
		
		
	}

	
	
	
	
}
