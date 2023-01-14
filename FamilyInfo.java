import java.util.Scanner;

public class FamilyInfo {
	
	private String name;
	private String surname;
	private int password;
	public void setPassword(int password) {
		this.password = password;
	}
	private int age;
	
	
	//public FamilyInfo() {
	//}

	public FamilyInfo(String name, String surname, int password,int age) {
		
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPassword() {
		return password;
	}
	public void sifreDegistirme() {
		Scanner klavye=new Scanner(System.in);
		int password;System.out.println("Yeni sifrenizi giriniz:");password=klavye.nextInt();
		this.setPassword(password);
		System.out.println("Şifre başarı ile değiştirildi");
		
	}
	
	
	

}
