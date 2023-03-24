package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter {

	private String exportar(Socio socio) throws JsonProcessingException {
		ObjectMapper mapper= new ObjectMapper();
		
		return mapper.writeValueAsString(socio);
	}
	
	public String exportar(List<Socio> socios) {
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.stream().forEach((p)->{
			try {
				buffer.append(this.exportar(p))
				.append(",")
				.append(separator);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
}
