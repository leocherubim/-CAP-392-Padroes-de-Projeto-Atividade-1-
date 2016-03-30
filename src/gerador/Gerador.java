/*
 * Classname Gerador
 * 
 * author Leonardo Cherubini
 * 
 * classe responsalvel por gerenciar a criacao dos eventos, 
 * criando o tipo de gerador de evenco e o tipo de consumo
 * atribuido ao evento
 * 
 */
package gerador;

import consumidor.ConsumidorEvento;

public class Gerador {

	// nome do evento
	private String nomeEvento;
	
	public Gerador(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	
	/**
	 * Metodo responsavel por gerar o evento. Neste metodo sao colocados
	 * o tipo do gerador de evento e o tipo de consumidor de evento
	 * 
	 * @param geradorEvento
	 * @param consumidorEvento
	 */
	public void gerarEvento(GeradorEvento geradorEvento, ConsumidorEvento consumidorEvento) {
		geradorEvento.gerarEvento(this.nomeEvento, consumidorEvento);
		
	}
}
