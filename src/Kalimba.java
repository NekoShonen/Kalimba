
import java.util.ArrayList;
import java.util.List;

public class Kalimba {

	List <Hoja> Hojas= new ArrayList <Hoja>();
    Hoja HojaActiva;
	List <Texto> PortaPapeles = new ArrayList <Texto>();
	List <Integer> All = new ArrayList <Integer>();
	
	public Kalimba (Hoja hoja,List<Hoja> hojas) {
		this.setHojaActiva(hoja);
		this.Hojas = hojas;
	}
	
	public void imprimirHojaActiva () {
		getHojaActiva().imprimirHoja();
	}
	
	public void cualEsHojaActiva () {
		System.out.println(this.getHojaActiva());
	}
	
	
	public void copiar (Hoja HojaOrigen, List <Integer> Texto) {
		PortaPapeles.clear();
		for (Integer posicion : Texto){
			PortaPapeles.add(HojaOrigen.getTexto(posicion));
		}
		
	}
	
	public void cortar (Hoja HojaOrigen, List <Integer> Texto) {
		this.copiar(HojaOrigen, Texto);
		for (Integer posicion : Texto){
			HojaOrigen.eliminarTexto(posicion);
		}
		
	}
	
	public void pegar (Hoja HojaDestino){
		for (Texto texto : PortaPapeles){
			HojaDestino.agregarTexto(texto);
		}
		
	}
	
	public void seleccionarTodo (){
		for (Integer i = 0;i < getHojaActiva().cantidadTextos();i++){
			All.add(i);
		}
		 
	}

	public Hoja getHojaActiva() {
		return HojaActiva;
	}

	public void setHojaActiva(Hoja hojaActiva) {
		HojaActiva = hojaActiva;
	}
	

	
	//public void exportar (){
	//	
	//}


}
