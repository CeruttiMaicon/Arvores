package Arvore;

import java.util.List;
import java.util.function.Consumer;

public class Arvore<t> {
	
	No<t> raiz;

	public No<t> getRaiz() {
		return raiz;
	}

	public void setRaiz(No<t> raiz) {
		this.raiz = raiz;
	}
	
	public void percorre (No<t> No, Consumer<No<t>> lambda){
		lambda.accept(No);
		for (No<t> filho : No.getFilhos()){
			this.percorre(filho, lambda);
		}
	}
	
	public void percorre(){
		this.percorre();
	}
	
	public void profundidade(No<t> No, Consumer<No<t>> lambda) throws Exception{
		PilhaDinamica pilha = new PilhaDinamica();
		for (No<t> filho : No.getFilhos()){
			pilha.push(No.getFilhos());
			this.percorre(filho, lambda);
		}
	}

}
