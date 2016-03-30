/*
 * Classname GeradorEvento
 * 
 * author Leonardo Cherubini
 * 
 * interface responsavel por criar os geradores de evento
 * 
 */
package gerador;

import consumidor.ConsumidorEvento;

public interface GeradorEvento {

	/**
	 * Este metodo ira usar o nome do evento para a respectiva criacao do mesmo
	 * e usara o consumidor do evento declarado no parametro
	 * 
	 * @param nomeEvento
	 * @param consumidorEvento
	 */
	public void gerarEvento(String nomeEvento, ConsumidorEvento consumidorEvento);
	
}
