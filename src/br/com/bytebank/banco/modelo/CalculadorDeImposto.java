//Full Qualified Name ou FQN.
package br.com.bytebank.banco.modelo;

//modelo.calculadorDeImposto
public class CalculadorDeImposto {

	private double TotalDeImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.TotalDeImposto += valor;
	}
	
	public double getTotalDeImposto() {
		return TotalDeImposto;
	}
}
