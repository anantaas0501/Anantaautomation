package pomclasses;

public class Contructor {

	
	String a;
	int g;
	
	public Contructor() {
		System.out.println("default--con");
	}
	
	public Contructor(String a1, int g1) {
		this.a=a1;
		this.g=g1;
		
	}
	public static void main(String[] args) {
		Contructor con=new Contructor();
		Contructor con1=new Contructor("Ananta",20);
		System.out.println(con1.a);
		System.out.println(con1.g);
		

	}

}
