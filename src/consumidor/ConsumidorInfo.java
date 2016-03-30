/*
 * Classname ConsumidorInfo
 * 
 * author Leonardo Cherubini
 * 
 * classe responsavel por consumir o evento e gerar a informacao
 * de nome do mesmo
 * 
 */
package consumidor;

import vo.Evento;

public class ConsumidorInfo implements ConsumidorEvento {

	@Override
	public void consumirEvento(Evento evento) {
		if(evento.getMomento() != 0) {
			System.out.println("Evento: " + evento.getNome() +
					"\nMomento: " + evento.getMomento() + "\n");
		} else {
			System.out.println("Evento: " + evento.getNome());
		}
	}

}
