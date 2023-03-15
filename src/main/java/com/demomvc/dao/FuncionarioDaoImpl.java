package com.demomvc.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demomvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
	
	@Override
	public List<Funcionario> findByNome(String nome) {
		
		/*
		TypedQuery<Funcionario> query = getEntityManager()
				.createQuery("SELECT f FROM Funcionario f WHERE f.nome like :nome", Funcionario.class);
		query.setParameter("nome", nome);
		return query.getResultList();
		*/
		
		return createQuery("SELECT f FROM Funcionario f WHERE f.nome like concat('%', ?1, '%') ", nome);
	}	

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("SELECT f FROM Funcionario f WHERE f.cargo.id = ?1", id);
	}
	

	@Override
	public List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append("WHERE f.dataEntrada >= ?1 AND f.dataSaida <= ?2 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, entrada, saida);
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append("WHERE f.dataEntrada = ?1 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, entrada);
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append("WHERE f.dataSaida = ?1 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, saida);
	}

	
	
	

	
	
}
