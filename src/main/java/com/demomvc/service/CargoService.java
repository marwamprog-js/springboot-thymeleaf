package com.demomvc.service;

import java.util.List;

import com.demomvc.domain.Cargo;
import com.demomvc.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> BuscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscaPorPagina(int pagina, String direcao);
	
}
