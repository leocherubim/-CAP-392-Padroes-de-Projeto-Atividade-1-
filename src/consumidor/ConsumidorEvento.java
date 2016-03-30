/*
 * Classname ConsumidorEvento
 * 
 * author Leonardo Cherubini
 * 
 * interface responsavel por criar os consumidores do evento
 * 
 */
package consumidor;

import vo.Evento;

public interface ConsumidorEvento {

	/**
	 * Metodo responsavel por receber um evento e exibir uma
	 * acao referente ao mesmo
	 * 
	 * @param evento
	 */
	public void consumirEvento(Evento evento);
	
}
