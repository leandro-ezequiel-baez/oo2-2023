package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import netscape.javascript.JSObject;


public class ExporterAdapter extends VoorheesExporter {
	
	private JSONObject exportar(Socio socio) {
		JSONObject js=new JSONObject();
		js.put("nombre", socio.getNombre());
		js.put("email", socio.getEmail());
		js.put("legajo", socio.getLegajo());
		return js;
	}
	
	public  String exportar(List<Socio> socios) {
		JSONArray jsArray=new JSONArray();
		socios.stream().forEach((p)->{
			jsArray.add(this.exportar(p));
		});
		
		return jsArray.toJSONString();
	}
}
