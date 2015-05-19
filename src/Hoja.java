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
	
	public void imprimirHoja () {
		int i = 0;
		for (Texto textos : this.Textos ){
			System.out.println(i);
			textos.imprimir();
			i=i+1;
		}
		
	}


}
