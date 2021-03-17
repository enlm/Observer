import java.util.ArrayList;

public class OvoDragao implements IObservavel {
	ArrayList<IObservador> observadores;
	boolean coletado;
	
	OvoDragao(){
		observadores = new ArrayList<IObservador>();
	}
	
	void ovoColetado() {
		this.coletado = true;
		notificarObservadores();
	}
	@Override
	public void adicionarObservador(IObservador observador) {
		this.observadores.add(observador);
		
	}

	@Override
	public void removerObservador(IObservador observador) {
		this.observadores.remove(observador);
		
	}

	@Override
	public void notificarObservadores() {
		for(IObservador obs: observadores) {
			obs.observavelMudou(coletado);
		}
		
	}
;
}
