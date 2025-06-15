import java.util.List;

public class SomaNumeros extends ListarNumeros{

	public SomaNumeros(List<Integer> listanumeros) {
		super();
	}
	
	public void adiconarNumero(int numero) {
		Listanumeros.add(numero);
	}
	
	public int calularSoma() {
		int soma = 0;
		for(int numero : Listanumeros) {
			
			soma+=numero;
		}	
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		if(Listanumeros.isEmpty()) {
			throw new IllegalStateException("A lista Vazia");
		}
		int maiorNumero = Listanumeros.get(0);
		for(int numero: Listanumeros ) {
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}	
		}
		
		return maiorNumero;
	}

	public int encontrarMenorNumero() {
		if(Listanumeros.isEmpty()) {
			throw new IllegalStateException("A lista Vazia");
		}
		int menorNumero = Listanumeros.get(0);
		for(int numero: Listanumeros ) {
			if(numero < menorNumero) {
				menorNumero = numero;
			}	
		}
		
		return menorNumero;
	}
	
	public List<Integer> exibirLista(){
		return Listanumeros;
	}
	
}
