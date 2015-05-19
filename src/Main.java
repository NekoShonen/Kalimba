import java.util.ArrayList;
import java.util.List;


public class Main {


	public static void main(String[] args) {
		Texto texto = new Texto ("Carlos");
		Texto texto2 = new Texto ("Uri");
		List <Texto> textos = new ArrayList <Texto>();
		textos.add(texto);
		textos.add(texto2);
		
		Hoja hoja = new Hoja (textos);
		
		List <Hoja> hojas = new ArrayList <Hoja>();
		hojas.add(hoja);
		Kalimba kalimba = new Kalimba (hoja,hojas);
		
		kalimba.imprimirHojaActiva();
		kalimba.HojaActiva.imprimirHoja();

	}

}
