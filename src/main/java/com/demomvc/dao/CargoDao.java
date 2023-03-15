package com.demomvc.dao;

import java.util.List;

import com.demomvc.domain.Cargo;
import com.demomvc.util.PaginacaoUtil;

public interface CargoDao {

	void save(Cargo cargo);
	void update(Cargo cargo);
	void delete(Long id);
	Cargo findById(Long id);
	List<Cargo> findAll();
	PaginacaoUtil<Cargo> buscaPorPagina(int pagina, String direcao);
	
}
