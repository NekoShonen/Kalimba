import java.util.ArrayList;
import java.util.List;

public class PDF {

	List <Hoja> Hojas = new ArrayList <Hoja>();
	
	public PDF (List <Hoja> hojas){
		this.Hojas = hojas;
	}
	
	public void imprimir () {
		int i = 0;
		for (Hoja hoja : Hojas){
			i = i + 1;
			System.out.println("HOJA " + i);
			hoja.imprimirHoja();
		}
				
	}
}
