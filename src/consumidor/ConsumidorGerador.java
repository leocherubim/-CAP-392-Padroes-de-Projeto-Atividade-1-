/*
 * Classname ConsumidorGerador
 * 
 * author Leonardo Cherubini
 * 
 * classe responsavel por consumir o evento e gerar novos eventos
 * adicionando os eventos anteriores na lista do evento gerado
 * 
 */
package consumidor;

import java.util.ArrayList;
import java.util.List;

import vo.Evento;

public class ConsumidorGerador implements ConsumidorEvento {

	// lista de eventos gerados anteriormente pelo Gerador
	private List<Evento> eventos;
	
	public ConsumidorGerador() {
		eventos = new ArrayList<Evento>();
	}
	
	@Override
	public void consumirEvento(Evento evento) {
		eventos.add(evento);
		
		Evento eventoGerado = new Evento();
		eventoGerado.setNome("Evento com a lista");
		eventoGerado.setEventos(eventos);
		
		this.exibirLista(eventoGerado);
	}
	
	/**
	 * Metodo responsavel por exibir a lista de eventos
	 * criados anteriormente pelo gerador e acionados
	 * ao novo evento gerado
	 * 
	 * @param evento
	 */
	private void exibirLista(Evento evento) {
		String listaEventos = evento.getNome() + "\n";
		
		for(Evento e : evento.getEventos()) {
			listaEventos += e.getNome() + "\n";
		}
		
		System.out.println(listaEventos);
	}

}
