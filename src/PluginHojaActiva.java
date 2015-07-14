import java.util.List;
import java.util.ArrayList;


public class PluginHojaActiva implements Plugin {
	
	Kalimba editor;
	
	public PluginHojaActiva(Kalimba unEditor){
		this.editor = unEditor;
	}
	@Override
	public PDF exportar(){
		List <Hoja> hojas = new ArrayList <Hoja> ();
		hojas.add(this.editor.getHojaActiva());
		return (new PDF (hojas));
	}
	

}
