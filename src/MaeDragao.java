
public class MaeDragao implements IObservador {
	int ovoColetado = 0;
	@Override
	public void observavelMudou(boolean estado) {
		if(estado == true) {
			ovoColetado++;
			System.out.println(ovoColetado);
			if(ovoColetado % 100 == 0) {
				atacar();
			}
		}
	}
	
	void cadastrarComoObservador(OvoDragao od) {
		od.adicionarObservador(this);
	}
	
	private void atacar() {
		System.out.println("Dragao atacando");
	}

}
