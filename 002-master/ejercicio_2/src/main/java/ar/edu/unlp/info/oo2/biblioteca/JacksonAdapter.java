package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter {

	private String exportar(Socio socio) throws JsonProcessingException {
		ObjectMapper mapper= new ObjectMapper();
		
		return mapper.writeValueAsString(socio);
	}
	
	public String exportar(List<Socio> socios) {
		List<Socio> socioLista = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
	}
}
