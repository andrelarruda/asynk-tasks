package aniversarioSurpresa;

//todos os interessados ou observadores devem implementar os métodos (neste caso existe apenas 1) dessa interface
public interface ChegadaAniversarianteObserver {
	
	public void chegou(ChegadaAniversarianteEvent event);
	
}
