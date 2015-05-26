import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {


	public static void main(String[] args) {
		Texto texto = new Texto ("Carlos");
		Texto texto2 = new Texto ("Uri");
		Texto texto3 = new Texto ("Ariel");
		
	
		
		List <Texto> textos = new ArrayList <Texto>();
		textos.add(texto);
		textos.add(texto2);
		textos.add(texto3);
		
		List <Texto> textos2 = new ArrayList <Texto>();
		
		Hoja hoja2 =new Hoja (textos2);
		
		Hoja hoja = new Hoja (textos);
		//Hoja hoja2 = new Hoja (textos);
		
		List <Hoja> hojas = new ArrayList <Hoja>();
		hojas.add(hoja);
		hojas.add(hoja2);
		Kalimba kalimba = new Kalimba (hoja,hojas);
		
		//PluginHojaActiva plugin = new PluginHojaActiva (kalimba);
		
		//kalimba.imprimirHojaActiva();
		//kalimba.HojaActiva.imprimirHoja();
		//kalimba.copiar(hoja, 1);
		//kalimba.HojaActiva.imprimirHoja();
		//kalimba.pegar(hoja);
		//kalimba.HojaActiva.imprimirHoja();
		
		
//		kalimba.cualEsHojaActiva();
//		System.out.println("------------------");
//		kalimba.imprimirHojaActiva();
//		kalimba.copiar(hoja, 1);
//		System.out.println("------------------");
//		kalimba.imprimirHojaActiva();
//		kalimba.pegar(hoja);
//		System.out.println("------------------");
//		kalimba.imprimirHojaActiva();
//		System.out.println("------------------");
//		kalimba.cortar(hoja, 2);
//		//kalimba.pegar(hoja);
		
		
//		kalimba.imprimirHojaActiva();
//		kalimba.copiar(hoja , Arrays.asList(new Integer(0), new Integer(1)));
//		System.out.println("------------------");
//		System.out.println(kalimba.PortaPapeles);
//		kalimba.pegar(hoja);
//		System.out.println("------------------");
//		kalimba.imprimirHojaActiva();
//		
//		kalimba.imprimirHojaActiva();
//		kalimba.seleccionarTodo();
//		System.out.println("------------------");
//		System.out.println(kalimba.All);
//		System.out.println("------------------");
		//kalimba.copiar(hoja , kalimba.All);
//		System.out.println("------------------");
//		System.out.println(kalimba.PortaPapeles);
//		kalimba.pegar(hoja);
//		System.out.println("------------------");
//		kalimba.imprimirHojaActiva();
		
		kalimba.imprimirHojaActiva();
		kalimba.seleccionarTodo();
		System.out.println("------------------");
		kalimba.copiar(hoja , kalimba.All);
		kalimba.pegar(hoja);
		kalimba.imprimirHojaActiva();
		
		
		
		//PDF documentoExportado = Kalimba.exportar();
		//docu.imprimir

	}
	
	

}
