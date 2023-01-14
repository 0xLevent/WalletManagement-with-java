import java.util.Scanner;

public class InvestmentManegement  {
	
	
	
	public int miktar;
	public int toplam=0;

	
	public void addStakeAltin() {
		Investment investment = new Investment();

		
		System.out.println("Eklemek istediginiz altin miktarini gram cinsinden yaziniz: ");
		Scanner girdi = new Scanner(System.in);
		miktar=girdi.nextInt();
		
		toplam=(int) (investment.getStakeAltin()+miktar);
	    System.out.println("Stake basari ile eklendi. Toplam stake altin miktari: " +toplam);
		
		
	}
		
	public void addStakeDolar() {

			Investment investment = new Investment();

			
			System.out.println("Eklemek istediginiz dolar miktarini yaziniz: ");
			Scanner girdi = new Scanner(System.in);
			miktar=girdi.nextInt();
			
			toplam=(int) (investment.getStakeDolar()+miktar);
		    System.out.println("Stake basari ile eklendi. Toplam stake dolar miktari: " +toplam);

	
	
	
}

	public void addStakeKripto() {
		
		Investment investment = new Investment();

		
		System.out.println("Eklemek istediginiz kripto miktarini yaziniz: ");
		Scanner girdi = new Scanner(System.in);
		miktar=girdi.nextInt();
		
		toplam=(int) (investment.getStakeKripto()+miktar);
	    System.out.println("Stake basari ile eklendi. Toplam stake kripto miktari: " +toplam);

	}
	
	
	
	public void unStakeAltin() {
		Investment investment = new Investment();

		
		System.out.println("Cikarmak istediginiz altin miktarini gram cinsinden yaziniz: ");
		Scanner girdi = new Scanner(System.in);
		miktar=girdi.nextInt();
		
		toplam=(int) (investment.getStakeAltin()-miktar);
	    System.out.println("Stake basari ile cikarildi. Toplam stake altin miktari: " +toplam);
		
		
	}
	
	public void unStakeDolar() {
		Investment investment = new Investment();

		
		System.out.println("Cikarmak istediginiz dolar miktarini  yaziniz: ");
		Scanner girdi = new Scanner(System.in);
		miktar=girdi.nextInt();
		
		toplam=(int) (investment.getStakeDolar()-miktar);
	    System.out.println("Stake basari ile cikarildi. Toplam stake dolar miktari: " +toplam);
			
	}
	
	public void unStakeKripto() {
		Investment investment = new Investment();

		
		System.out.println("Cikarmak istediginiz kripto miktarini yaziniz: ");
		Scanner girdi = new Scanner(System.in);
		miktar=girdi.nextInt();
		
		toplam=(int) (investment.getStakeAltin()-miktar);
	    System.out.println("Stake basari ile cikarildi. Toplam stake kripto miktari: " +toplam);	
		
	}
	
		
	
	
	
	
}