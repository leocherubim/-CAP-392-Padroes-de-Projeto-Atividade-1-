/*
 * Classname Evento
 * 
 * author Leonardo Cherubini
 * 
 * classe responsalvel por gerenciar os eventos de forma aleatoria
 * que exiba apenas o nome do evento
 * 
 */
package vo;

import java.util.List;

public class Evento {
	
	// nome do evento
	private String nome;
	// momento de criacao do evento em milisegundos
	private long momento;
	// lista de eventos criados anteriormente por um consumidor
	private List<Evento> eventos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMomento() {
		return momento;
	}

	public void setMomento(long momento) {
		this.momento = momento;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
}
