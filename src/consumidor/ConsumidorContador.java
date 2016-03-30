/*
 * Classname ConsumidorContador
 * 
 * author Leonardo Cherubini
 * 
 * classe responsavel por consumir o evento e gerar uma saida
 * com a contagens dos eventos consumidos
 * 
 */
package consumidor;

import vo.Evento;

public class ConsumidorContador implements ConsumidorEvento {

	// contador da instancia
	private int contador;
	
	@Override
	public void consumirEvento(Evento evento) {
		contador++;
		System.out.println("Evento: " + contador);
	}

}
