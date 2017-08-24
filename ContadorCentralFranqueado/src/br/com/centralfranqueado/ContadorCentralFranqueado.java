package br.com.centralfranqueado;

public class ContadorCentralFranqueado {
	
	public static void main(String[] args) {
		
		GetSetCentral central = new GetSetCentral();
		
		for (central.numero = 0; central.numero <= 100; central.numero++) {
			if (central.numero % 3 == 0 && central.numero % 5 == 0) {
				central.setMensagem("CentralFranqueado");
				System.out.println(central.getMensagem());
			} else if(central.numero % 3 == 0) {
				central.setMensagem("Central");
				System.out.println(central.getMensagem());
			} else if(central.numero % 5 == 0) {
				central.setMensagem("Franqueado");
				System.out.println(central.getMensagem());
			} else {
				System.out.println(central.numero);
			}
		}
	}
}