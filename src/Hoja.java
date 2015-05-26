import java.util.ArrayList;
import java.util.List;


public class Hoja {
	
	List <Texto> Textos= new ArrayList <Texto>();
	
	public Hoja (List <Texto> textos) {
		this.Textos = textos; 
	}
	
	public void agregarTexto (Texto T){
		this.Textos.add(T);
		
	}
	
	public void eliminarTexto (int Texto){
		this.Textos.remove(Texto);
	}
	
	public void imprimirHoja () {
		int i = 0;
		for (Texto textos : this.Textos ){
			System.out.println(i);
			textos.imprimir();
			i=i+1;
		}
		
	}
	
	public Texto getTexto (int Texto) {
		return Textos.get(Texto);
	}
	
	public int cantidadTextos (){
		return Textos.size();
	}

}
