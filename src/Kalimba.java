
import java.util.ArrayList;
import java.util.List;

public class Kalimba {

	List <Hoja> Hojas= new ArrayList <Hoja>();
	Hoja HojaActiva;
	
	public Kalimba (Hoja hoja,List<Hoja> hojas) {
		this.HojaActiva = hoja;
		this.Hojas = hojas;
	}
	
	public void imprimirHojaActiva () {
		System.out.println(this.HojaActiva);
	}


}
