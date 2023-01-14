import java.util.Scanner;

public class Father extends FamilyInfo implements Ifamily{

	public int durum=1;
	private int islem;
	public double maas;
	public double gider;
	int emtia;
	
	
	Investment investment = new Investment();
	Harcama harcama = new Harcama();
	InvestmentManegement investmentManagement = new InvestmentManegement();
	Stake stake = new Stake();

	public Father(String name, String surname, int password, int age, double maas, double gider) {        
		super(name, surname, password, age);
		this.maas = maas;
		this.gider = gider;
	}
	

	
	
	public void yetki(){
		while(durum==1) {
		System.out.println();
		System.out.println("1-Bakiye Görüntüleme");
		System.out.println("2-Harcama yapma");
		System.out.println("3-Stake ekleme");
		System.out.println("4-Stakeden cikarma");
		System.out.println("5-Sifre degistirme");
		System.out.println("6-Aylık bilanço görüntüleme");
		System.out.println("7-Hesap bilgileri görüntüleme");
		System.out.print("Yapmak istediginiz islemi seciniz: "+"\n" +"\n");
		Scanner girdi2 = new Scanner(System.in);
		islem=girdi2.nextInt();
		if(islem==1){
		
		 System.out.println("Stake edilmis dolar bakiyeniz: " + investment.getStakeDolar() + "\n" + "Stake edilmis toplam altin bakiyeniz: "+investment.getStakeAltin() + "\n" +"Stake edilmis toplam kripto varliginiz: " +investment.getStakeKripto());
		 		System.out.println("unStake dolar bakiyeniz: "+investment.getUnstakeDolar() + "\n" + "unStake toplam altin bakiyeniz: "+investment.getUnstakeAltin() + "\n" +"unStake toplam kripto varliginiz: "+investment.getUnstakeKripto());		
		}
		else if(islem==2) {
		 harcama.harcama();
		 }
		else if(islem==3) {
			System.out.println("Emtia seciniz"); 
			System.out.println("1-Altin stake" +" " + "2-Dolar stake"+ " " + "3-Kripto Stake");
			Scanner girdi3 = new Scanner(System.in);
			emtia=girdi3.nextInt();
			switch (emtia) {
			case 1: investmentManagement.addStakeAltin();   break;
			case 2: investmentManagement.addStakeDolar();   break;
			case 3: investmentManagement.addStakeKripto(); break;
				}
			}
			
			else if(islem==4) {
			System.out.println("Emtia seciniz"); 
			System.out.println("1-Altin Unstake" + " " + "2-Dolar Unstake"+ " " + "3-Kripto UnStake");
			Scanner girdi4 = new Scanner(System.in);
			emtia=girdi4.nextInt();
			switch (emtia) { 
			case 1: investmentManagement.unStakeAltin();  break;
			case 2: investmentManagement.unStakeDolar(); break;
			case 3: investmentManagement.unStakeKripto(); break;
			}}
			
			else if(islem==5) {
			sifreDegistirme(); }
			else if(islem==6) {
				System.out.println(stake.stakeHesapla(1) +stake.stakeHesapla(2) + stake.stakeHesapla(3)); 
			
			}
			else if(islem==7)
			{
				bilgileriGoruntule();
			}
			else {
				System.out.println("Hatali tuslama");
				}
		System.out.println("Bir daha islem yapmak ister misiniz(Evet:E Hayır:H");
		String dirim=girdi2.next();
		if(dirim.equals("E") || dirim.equals("e")) {
				durum=1;
		}
		else if(dirim.equals("h") || dirim.equals("H") )
		{
			durum=0;
			System.out.println("Hoscakalın");
			
		}
		else
		{
			System.out.println("Yanlis bir tuslama yaptiniz.Uygulama sonlandı!!!");
		}
		
		
		}
		
		
			
		
	}
	@Override
	public void bilgileriGoruntule() {
		System.out.println("İsim:"+getName());
		System.out.println("Soyad:"+getSurname());
		System.out.println("Şifre:"+getPassword());
		System.out.println("Yaş:"+getAge());
		System.out.println("Maas:"+this.maas);
		System.out.println("Gider:"+this.gider);
		
	}



	@Override
	public void sifreUnutma() {
		String kizlikSoyad="haksever";
		Scanner klavye=new Scanner(System.in);
		System.out.println("Annenizin kızlık soyadını giriniz");
		;
		String durum=klavye.next();
		if(durum.equals("haksever"))
		{
			System.out.println("Yanıt Doğrudur.Lütfen yeni şifrenizi giriniz");
			sifreDegistirme();
		}
		else
		{
			System.out.println("Yanıt doğru değildir.Oturmunuz sonlandırılmıştır.");
			
		}
		
	}



	



	












	
	


	
	
	
	

	
}