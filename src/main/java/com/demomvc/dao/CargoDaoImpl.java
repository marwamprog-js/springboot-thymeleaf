package com.demomvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demomvc.domain.Cargo;
import com.demomvc.util.PaginacaoUtil;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

	public PaginacaoUtil<Cargo> buscaPorPagina(int pagina, String direcao) {
		
		int tamanho = 5;
		int inicio = (pagina - 1) * tamanho; //0*5=0; 1*5=5; 2*5=10
		
		List<Cargo> cargos = getEntityManager()
				.createQuery("SELECT c FROM Cargo c ORDER BY c.nome " + direcao, Cargo.class)
				.setFirstResult(inicio) 
				.setMaxResults(tamanho) 
				.getResultList();
		
		long totalRegistros = count();
		long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;
		
		return new PaginacaoUtil<>(tamanho, pagina, totalDePaginas, direcao, cargos);
	}
	
	public long count() {
		return getEntityManager()
				.createQuery("SELECT count(*) FROM Cargo", Long.class)
				.getSingleResult();
	}
	
}
