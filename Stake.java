
public class Stake extends InvestmentManegement{
	
	private double dolarFaizOrani=5;
	public double dolarKar;
	private double altinFaizOrani=0.08;	
	public double altinKar=0;
	private double kriptoFaizOrani=0.2;
	public double kriptoKar=0;

	Investment investment = new Investment();
	
	
	
	public int stakeHesapla(int secim) {
		
		
		switch(secim) {
		
		case 1: dolarKar=(investment.getStakeDolar()) +(investment.getStakeDolar()*dolarFaizOrani/100); 
			System.out.println("Dolar Kar: "+ dolarKar);  
			break;
		
		case 2: altinKar=investment.getStakeAltin() +(investment.getStakeAltin()*altinFaizOrani); 	
			System.out.println("Altin Kar: "+ altinKar);  	
			break;
		
		case 3: kriptoKar=investment.getStakeKripto() +(investment.getStakeKripto()*kriptoFaizOrani); 
			System.out.println("Kripto Kar: "+ kriptoKar); 
			break;
	
		}
		
		
		
		
		return 0;
	}
	
	

}
