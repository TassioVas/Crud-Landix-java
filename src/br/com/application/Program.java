package br.com.application;

import br.com.dao.VendedoresDAO;
import br.com.model.Vendedores;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedores vendedores = new Vendedores();
		VendedoresDAO vendedoresDao = new VendedoresDAO();
		
		vendedores.setCodvend(05);
		vendedores.setDsnome("Maria");
		vendedores.setCdtab(5);
		vendedores.setDtnasc(null);
		
				
		vendedoresDao.save(vendedores);

	}

}
