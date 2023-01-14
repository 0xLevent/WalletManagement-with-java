import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		int sifre,durum=1,sayac=3;
		int islem,harcanacak,islem2 =0;
		
		Scanner klavye=new Scanner(System.in);
		Father father = new Father("Salih" ,"Yilmaz", 10, 35,10000.00,101.45);
		Mother mother = new Mother("Ayse", "Yilmaz", 77,34,2100.35,5666.10);
		Children children = new Children("Burak", "Yilmaz", 35,14,1100.28,66.10);
		Investment investment = new Investment();
		Harcama harcama = new Harcama();
		InvestmentManegement investmentManagement = new InvestmentManegement();		
		System.out.println("Cüzdan Yönetim Sistemine Hoşgeldiniz\n");
		
		
		while(durum==1 && sayac!=0) {
			
		
			System.out.println("Parolanizi giriniz: ");
			
			sifre=klavye.nextInt();
		
		
		
		if(sifre==father.getPassword()) {
			durum=0;
			System.out.println("Sisteme basarili bir sekilde giris yaptiniz  " +father.getName() + "" +father.getSurname());
			father.yetki();
			
		}
		
		
		
		else if(sifre==mother.getPassword()) {durum=0;
			System.out.println("Sisteme basarili bir sekilde giris yaptiniz  " +mother.getName() + "" +mother.getSurname());
			mother.yetki();
		}
		
		
		
		else if(sifre==children.getPassword()) {durum=0;
			System.out.println("Sisteme basarili bir sekilde giris yaptiniz  " +children.getName() + "" +children.getSurname());
			children.yetki();
		}
		
		else
		{
			System.out.print("Hatali sifre girdiniz!! \n Kalan deneme hakkınız: "+--sayac+"\n");
			durum=1;
			if(sayac==0) {
				sayac++; //Döngüden çıkmaması için;
			System.out.println("\n\n\nŞifrenizi değiştirmek istermisiniz?(Evet:E Hayır:H)");
			String situtaion=klavye.next();
			System.out.println(situtaion);
			if(situtaion.equals("E") || situtaion.equals("e"))
			{
				String gender;
				System.out.println("Kim için şifrenizi değiştirmek istiyorsunuz?(Father:F,Mother:M,Child:C");
				gender=klavye.next();
				switch(gender)
				{
				case "F":
				case "f":
					father.sifreUnutma(); break;
					
				case "M":
				case "m":
					mother.sifreUnutma();break;
				case "C":
				case "c":
					children.sifreUnutma(); break;
				}
			}
			else
			{
				System.out.println("Oturumunuz sonlanmistir!!!\n\nHoscakalin");
				durum=0;
			}
			}
			
		}
		}
		
		}
		
	}

	
	



