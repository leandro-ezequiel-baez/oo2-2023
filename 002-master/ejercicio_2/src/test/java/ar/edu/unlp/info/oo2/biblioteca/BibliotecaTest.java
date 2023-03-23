package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.*;
import org.junit.jupiter.api.*;


public class BibliotecaTest {

	private List<Socio> socios;
	private VoorheesExporter exporter;
	
	private Socio socio1;
	private Socio socio2;
	private Socio socio3;
	private Socio socio4;
	
	@BeforeEach
	public void setUp() {
		socios=new ArrayList<Socio>();
		exporter=new VoorheesExporter();
		//------------------------------------------
		socio1=new Socio("leandro","mail1@hotmail.com","leagajo1");
		socio2=new Socio("marcos","mail2@hotmail.com","leagajo2");
		socio3=new Socio("ivan","mail3@hotmail.com","leagajo3");
		socio4=new Socio("matias","mail4@hotmail.com","leagajo4");
		//-------------------------------------------
		socios.add(socio1);
		socios.add(socio2);
		socios.add(socio3);
		socios.add(socio4);
		//-------------------------------------------
		
	}
	
	@Test
	public void testAgregarSocio() {
		assertEquals(this.socios.size(), 4);
		assertEquals(this.socios.get(0),socio1);
	}
	
	@Test
	public void testExportarSocios(){
		
	}
	
	
	@Test
	public void testSetExporter() {
		
	}
}
