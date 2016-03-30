/*
 * Classname Main
 * 
 * author Leonardo Cherubini
 * 
 * classe responsalvel por inicializar a aplicacao
 */
package main;

import consumidor.ConsumidorGerador;
import gerador.Gerador;
import gerador.GeradorAleatorioSimples;

public class Main {

	public static void main(String[] args) {
		// instanciando um gerador
		Gerador gerador = new Gerador("Evento inicial");
		
		// criando um evento com as instancias de Gerador e Consumidor
		gerador.gerarEvento(new GeradorAleatorioSimples(), new ConsumidorGerador());
		
	}
	
}
