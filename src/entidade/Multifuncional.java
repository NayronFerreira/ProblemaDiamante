package entidade;

public class Multifuncional extends Dispositivo implements Scanner, Printer{

	public Multifuncional(String serialNumero) {
		super(serialNumero);
		
	}

	@Override
	public void print(String doc) {
		System.out.println("Multifuncional imprimiu");
		
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Multifuncional scanneou";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Multifuncional processou doc");
	}
	
	

}
