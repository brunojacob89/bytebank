package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Representa a moldura de uma conta.
 * 
 * @author bruno
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable{
	protected double saldo;
	private int agencia;
	private int numero;
	private  Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto a partir da agencia e numero.
	 * 
	 * @param agencia.
	 * @param numero.
	 * 
	 */
	
	
	public Conta(int agencia, int numero) {
		//Conta.total++;
		total++;
		//System.out.println("o total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	} 
	
	public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
			
			 this.saca(valor); 
			destino.deposita(valor);
	}
	
	public double getSaldo(){
		
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode ser menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode ser menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() { 
	    return Conta.total; 
	}
	
	@Override
    public int compareTo(Conta outra) {
    return Double.compare(this.saldo, outra.saldo);
    }
	
	@Override
	public String toString() {
		
		return "Numero" + this.numero + ", Agencia " + this.agencia + ", Saldo " + this.saldo;
	}

	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}
}