package aniversarioSurpresa;

//implementa a interface ChegadaAniversarianteObserver
public class Namorada implements ChegadaAniversarianteObserver{
	
	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		
		//o que a namorada faz quando o namorado chegar?
		System.out.println("Apagar as Luzes...");
		System.out.println("Fazer silêncio...");
		System.out.println("Surpresa!!!");
	}
	
}
