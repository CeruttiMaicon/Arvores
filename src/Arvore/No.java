package Arvore;
import java.util.ArrayList;
import java.util.List;

public class No <t> {

	private No<t> pai;
	private List<No<t>> filhos;
	private t valor;
	public char[] getValor;
	
	
	public No(t valor){
		
		this.valor = valor;
		this.filhos = new ArrayList<No<t>>();
		
	}

	public No<t> getPai() {
		return pai;
	}

	public void setPai(No<t> pai) {
		this.pai = pai;
	}

	public List<No<t>> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<No<t>> filhos) {
		this.filhos = filhos;
	}

	public t getValor() {
		return valor;
	}

	public void setValor(t valor) {
		this.valor = valor;
	}
}
