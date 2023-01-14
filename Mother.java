import java.util.Scanner;

public class Mother extends FamilyInfo implements Ifamily {
	int durum=1;
	public double maas;
	public double gider;
	int emtia;
	int islem,islem2;
	
	
	
	Investment investment = new Investment();
	Harcama harcama = new Harcama();
	InvestmentManegement investmentManagement = new InvestmentManegement();
	
	
	public void yetki(){
		while(durum==1) {
		System.out.println();
		System.out.println("1-Bakiye Görüntüleme:");
		System.out.println("2-Harcama yapma");
		System.out.println("3-Stake ekleme");
		System.out.println("4-Stakeden cikarma");
		System.out.println("5-Sifre degistirme");
		System.out.println("6-Hesap bilgileri görüntüleme");	
		System.out.print("Yapmak istediginiz islemi seciniz: "+"\n" +"\n");
		Scanner girdi2 = new Scanner(System.in);
		islem=girdi2.nextInt();
		if(islem==1)
		{
		
		 System.out.println("Stake edilmis dolar bakiyeniz: "+investment.getStakeDolar() + "\n" + "Stake edilmis toplam altin bakiyeniz: "+investment.getStakeAltin() + "\n" +"Stake edilmis toplam kripto varliginiz: " +investment.getStakeKripto());
		 		System.out.println("unStake dolar bakiyeniz: "+investment.getUnstakeDolar() + "\n" + "unStake toplam altin bakiyeniz: "+investment.getUnstakeAltin() + "\n" +"unStake toplam kripto varliginiz: "+investment.getUnstakeKripto());		
		
		}
		else if(islem==2) { harcama.harcama();}
		else if(islem==3)
		{
			System.out.println("Emtia seciniz"); 
			System.out.println("1-Altin stake" + " " + "2-Dolar stake"+ " " + "3-Kripto Stake");
			Scanner girdi3 = new Scanner(System.in);
			emtia=girdi3.nextInt();
			switch (emtia) {
			case 1: investmentManagement.addStakeAltin();   break;
			case 2: investmentManagement.addStakeDolar();   break;
			case 3: investmentManagement.addStakeKripto(); break;
				}
		}
		else if(islem==4) { System.out.println("Bu islem icin yetkiniz yok!");}
		else if(islem==5) {
			sifreDegistirme(); }
		else if(islem==6) { bilgileriGoruntule();}
		
		else System.out.println("Hatali tuslama");
		String kosul;
		System.out.println("Bir daha işlem yapmak istermisiniz(Evet:E Hayır:H");
		kosul=girdi2.next();
		if(kosul.equals("E") || kosul.equals("e"))
		{
			durum=1;
		}
		else if(kosul.equals("H") || kosul.equals("e"))
		{
			durum=0;
			System.out.println("Hoşcakalın");
		}
		else
		{
			System.out.println("Yanlış bir tuşlama yaptınız.Uygulama sonlandı!!!");
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




	public Mother(String name, String surname, int password, int age, double maas, double gider) {
		super(name, surname, password, age);
		this.maas = maas;
		this.gider = gider;
	}







	@Override
	public void sifreUnutma() {
		Scanner klavye=new Scanner(System.in);
		System.out.println("En sevdiginiz renk nedir?");
		;
		String durum=klavye.next();
		if(durum.equals("mavi"))
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
