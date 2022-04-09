package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conexao;

public class TestaConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao();){
			conexao.leDados();
		}catch(IllegalStateException ex){
			System.out.println("Deu erro de Conexao");
			
		}
			
		}
		
		
		
		
//-------------------------------------------------------------------------------//
//			Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}catch(IllegalStateException ex) {
//			
//			System.out.println("Deu erro na Conexao!");
//			
//		}finally {
//			System.out.println("Finally");
//			if (con != null) {
//			con.close();
//			}
//		}
//	}

	}
