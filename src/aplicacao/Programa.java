package aplicacao;

import entidade.Multifuncional;
import entidade.PrinterComplemento;
import entidade.ScannerComplemento;

public class Programa {

	public static void main(String[] args) {

		ScannerComplemento sc = new ScannerComplemento("1234");
		PrinterComplemento pt = new PrinterComplemento("12345");
		Multifuncional mt = new Multifuncional("4567");

		String doc = "doc";

		sc.processarDoc(doc);
		System.out.println(sc.scan());

		pt.processarDoc(doc);
		pt.print(doc);
		
		mt.print(doc);
		System.out.println(mt.scan());
		mt.processarDoc(doc);
		
		
		
		

	}

}
