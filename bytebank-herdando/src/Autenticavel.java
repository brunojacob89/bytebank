//contrato autenticavel
	//Quem assinar esse contrato tem que implementar
		// metodo setSenha
		//metodo autentica
public abstract interface Autenticavel  {

    public void setSenha(int senha);

    public boolean autentica(int senha);
	
}
