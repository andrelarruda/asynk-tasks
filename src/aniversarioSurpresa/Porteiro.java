package aniversarioSurpresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Subject - Responsável por detectar o evento e notificar todos os interessados
public class Porteiro extends Thread{
	
	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
	
	public void addObservador(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Esperando...");
			int valor = scanner.nextInt();
			
			//simulação chegada aniversariante
			//se for digitado 1, o aniversariante chegou 
			if(valor == 1) {
				ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
				
				//notificar todos os observadores do evento
				for(ChegadaAniversarianteObserver observer : this.observers) {
					observer.chegou(event);
				}
				break;
			} else {
				System.out.println("Alarme falso! ");
			}
		}
	}
}
