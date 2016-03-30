/*
 * Classname GeradorAleatorioSimples
 * 
 * author Leonardo Cherubini
 * 
 * classe responsalvel por gerenciar os eventos de forma aleatoria
 * que exiba apenas o nome do evento
 */
package gerador;

import java.util.Random;

import consumidor.ConsumidorEvento;
import vo.Evento;

public class GeradorAleatorioSimples implements GeradorEvento {

	@Override
	public void gerarEvento(String nomeEvento, ConsumidorEvento consumidorEvento) {
		int currentEvents = 0;
		Random gerador = new Random();
		
		while(currentEvents < 10) {
			currentEvents++;
			
			// instanciando o evento e configurando o nome
			Evento evento = new Evento();
			evento.setNome(nomeEvento);
			
			// consumindo o evento
			consumidorEvento.consumirEvento(evento);
			
			try {
				Thread.sleep(gerador.nextInt(10) * 1000);
			} catch(InterruptedException e) {
			}
			
		}
	}

}
