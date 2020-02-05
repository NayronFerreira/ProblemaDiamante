package entidade;

public class ScannerComplemento extends Dispositivo implements Scanner{

	public ScannerComplemento(String serialNumero) {
		super(serialNumero);
		
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Scanner Doc feito");
	}
	
	public String scan() {
		return "Scanneamento concluido";
	}
	
	
	

}
