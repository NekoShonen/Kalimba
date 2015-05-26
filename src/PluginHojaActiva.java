import java.util.List;
import java.util.ArrayList;


public class PluginHojaActiva {
	
	Kalimba editor;
	
	public PluginHojaActiva(Kalimba unEditor){
		this.editor = unEditor;
	}
	
	public PDF exportar(){
		List <Hoja> hojas = new ArrayList <Hoja> ();
		hojas.add(this.editor.HojaActiva);
		return (new PDF (hojas));
	}
	

}
