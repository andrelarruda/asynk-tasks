package aniversarioSurpresa;

import java.util.Date;

//essa classe define todas as informações relevantes do evento
//quem disparou o evento, hora que o evento ocorreu...
public class ChegadaAniversarianteEvent {
	
	private final Date horaDaChegada;
	
	public ChegadaAniversarianteEvent(Date horaDaChegada) {
		super();
		this.horaDaChegada = horaDaChegada;
	}
	
	public Date getHoraDaChegada() {
		return this.horaDaChegada;
	}
}
