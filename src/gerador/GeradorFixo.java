/*
 * Classname GeradorFixo
 * 
 * author Leonardo Cherubini
 * 
 * classe responsalvel por gerenciar os eventos de forma aleatoria
 * que exiba apenas o nome do evento
 * 
 */
package gerador;

import consumidor.ConsumidorEvento;
import vo.Evento;

public class GeradorFixo implements GeradorEvento {

	@Override
	public void gerarEvento(String nomeEvento, ConsumidorEvento consumidorEvento) {
		int currentEvents = 0;
		
		while(currentEvents < 10) {
			currentEvents++;
			
			// instanciando evento e configurando seus atributos
			Evento evento = new Evento();
			evento.setNome(nomeEvento);
			
			// consumindo o evento criado
			consumidorEvento.consumirEvento(evento);
			
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
			}
			
		}		
	}

}
