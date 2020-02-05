package entidade;

public class PrinterComplemento extends Dispositivo implements Printer {

	public PrinterComplemento(String serialNumero) {
		super(serialNumero);
		
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Printer Doc feito");
		
	}
	public void print (String doc) {
		System.out.println("Print feito");
	}
	
	

}
