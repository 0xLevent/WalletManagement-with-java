import java.util.Scanner;

public class Children extends FamilyInfo implements Ifamily{
	
	
	Investment investment = new Investment();
	Harcama harcama = new Harcama();
	InvestmentManegement investmentManagement = new InvestmentManegement();

	int durum=1;
	
	public double maas;
	public double gider;
	int islem,islem2;
	
		public void yetki() throws Exception{
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
			if(islem==1) {
				System.out.println("Stake edilmis dolar bakiyeniz: "+investment.getStakeDolar() + "\n" + "Stake edilmis toplam altin bakiyeniz: "+investment.getStakeAltin() + "\n" +"Stake edilmis toplam kripto varliginiz: " +investment.getStakeKripto());
		 		System.out.println("unStake dolar bakiyeniz: "+investment.getUnstakeDolar() + "\n" + "unStake toplam altin bakiyeniz: "+investment.getUnstakeAltin() + "\n" +"unStake toplam kripto varliginiz: "+investment.getUnstakeKripto());
			}
			else if(islem==2) {harcama.harcama();}
			else if(islem==3)
			{
				 throw new Exception("Bu islem icin yetkiniz yok!");
			}
			else if(islem==4)
			{
				throw new Exception("Bu islem icin yetkiniz yok!");
			}
			else if(islem==5)
			{
				sifreDegistirme();
				}
			else if(islem==6)
			{
				bilgileriGoruntule();
			}
		
			else
			{
				System.out.println("Hatali tuslama");
			}
			String kosul;
			System.out.println("Bir daha işlem yapmak istermisiniz(Evet:E Hayır:H");
			kosul=girdi2.next();
			if(kosul.equals("E") || kosul.equals("e"))
			{
				durum=1;
			}
			else if(kosul.equals("h") || kosul.equals("h"))
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


	public Children(String name, String surname, int password, int age, double maas, double gider) {
		super(name, surname, password, age);
		this.maas = maas;
		this.gider = gider;
	}




	public Children(String name, String surname, int password, int age) {
		super(name, surname, password, age);
		// TODO Auto-generated constructor stub
	}

	



	@Override
	public void sifreUnutma() {
		Scanner klavye=new Scanner(System.in);
		System.out.println("En sevdiğin evcil hayvanin adı nedir?");
		String durum=klavye.next();
		
		if(durum.equals("karabas"))
		{
			System.out.println("Yanit Dogrudur.Lutfen yeni sifrenizi giriniz");
			sifreDegistirme();
		}
		else
		{
			System.out.println("Yanıt doğru değildir.Oturmunuz sonlandırılmıştır.");
		}
		
	}





	




	



}
