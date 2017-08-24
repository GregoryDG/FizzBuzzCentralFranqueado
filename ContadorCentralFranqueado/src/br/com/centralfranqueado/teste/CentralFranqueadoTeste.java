package br.com.centralfranqueado.teste;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import br.com.centralfranqueado.*;

	public class CentralFranqueadoTeste {
		
	@Test
	public void ver_se_centralfranqueado_funciona(){
			
		//1
		GetSetCentral central = new GetSetCentral();
		central.setMensagem("CentralFranqueado");
		central.setNumero(5*3);
				
		//2
		String mensagemTeste = central.getMensagem();
		int numeroTeste = central.getNumero();
								
		//3
		assertTrue(mensagemTeste == "CentralFranqueado");
		assertTrue(numeroTeste == 5*3);
	}
	
	@Test
	public void ver_se_central_funciona(){
		
		//1
		GetSetCentral central = new GetSetCentral();
		central.setMensagem("Central");
		central.setNumero(3);
		
		//2
		String mensagemTeste = central.getMensagem();
		int numeroTeste = central.getNumero();
		
		//3
		assertTrue(mensagemTeste == "Central");
		assertTrue(numeroTeste == 3);
	}
	
	@Test
	public void ver_se_franqueado_funciona(){
		
		//1
		GetSetCentral central = new GetSetCentral();
		central.setMensagem("Franqueado");
		central.setNumero(5);
				
		//2
		String mensagemTeste = central.getMensagem();
		int numeroTeste = central.getNumero();
				
		//3
		assertTrue(mensagemTeste == "Franqueado");
		assertTrue(numeroTeste == 5);
	}
}
