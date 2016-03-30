/*
 * Classname GeradorAleatorio
 * 
 * author Leonardo Cherubini
 * 
 * classe responsalvel por gerenciar os eventos de forma aleatoria
 * no tempo de 1 a 10 segundos. A classe tambem salva os valores de
 * nome e o momento em que o evento foi criado
 * 
 */
package gerador;

import java.util.Random;

import consumidor.ConsumidorEvento;
import vo.Evento;

public class GeradorAleatorio implements GeradorEvento {

	@Override
	public void gerarEvento(String nomeEvento, ConsumidorEvento consumidorEvento) {
		int currentEvents = 0;
		Random gerador = new Random();
		
		// loop exemplificativo com 10 execucoes
		while(currentEvents < 10) {
			currentEvents++;
			
			// instancia um novo evento e configura os valores de nome e momento
			Evento evento = new Evento();
			evento.setNome(nomeEvento);
			evento.setMomento(System.currentTimeMillis());
			
			// executando a instancia de consumo do evento
			consumidorEvento.consumirEvento(evento);
			
			try {
				// pausa na thread com um valor aleatorio de 1 a 10 segundos
				Thread.sleep(gerador.nextInt(10) * 1000);
			} catch(InterruptedException e) {
			}
		}		
	}

}
