package entidade;

public abstract class Dispositivo {
	
	private String serialNumero;

	public Dispositivo(String serialNumero) {
		this.serialNumero = serialNumero;
	}

	public String getSerialNumero() {
		return serialNumero;
	}

	public void setSerialNumero(String serialNumero) {
		this.serialNumero = serialNumero;
	}
	
	public void processarDoc(String doc) {
		
	}

}
