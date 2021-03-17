
public class TesteObserver {

	public static void main(String[] args) {
		OvoDragao od1 = new OvoDragao();
		MaeDragao md1 = new MaeDragao();
		
		md1.cadastrarComoObservador(od1);
		
		for(int i = 0; i < 500; i++) {
			od1.ovoColetado();
		}

	}

}
