package br.com.rabelofarma.teste;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rabelofarma.dao.ProdutoDAO;
import br.com.rabelofarma.domain.Fabricante;
import br.com.rabelofarma.domain.Produto;

public class ProdutoDAOTeste {
	@Test
	@Ignore
	public void salvar() throws SQLException{
		Produto p = new Produto();
		p.setDescricao("ANADOR COM 10 COMPRIMIDOS" );
		p.setQuantidade(13l);
		p.setPreco(2.55D);
		
		Fabricante f = new Fabricante();
		f.setCodigo(2L);
		
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(p);
	}
	
	@Test
	public void listar() throws SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista = dao.listar();
		
		for(Produto p : lista){
			System.out.println("código do produto" + p.getCodigo());
			System.out.println("Descrição do produto" + p.getDescricao());
			System.out.println("preço" + p.getPreco());
			System.out.println("quantidade " + p.getQuantidade());
			System.out.println("Código do fabricante" + p.getFabricante().getCodigo());
			System.out.println("Descrição do fabricante" + p.getFabricante().getDescricao());
			System.out.println();
			
		}
		
	}
}
