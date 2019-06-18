package aniversarioSurpresa;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		//devemos adicionar a namorada a lista de observadores
		//para que ela seja notificada ao ocorrer o evento
		porteiro.addObservador(namorada);
		
		//agora o porteiro fica à espera do aniversariante
		porteiro.start();
	}
}
