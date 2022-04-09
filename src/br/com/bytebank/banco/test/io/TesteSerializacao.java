package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("Bruno Jacob");
		cliente.setProfissao("DEV");
		cliente.setCpf("0785465657");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(233.33);

		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oss.writeObject(cc);
		oss.close();
	}

}
