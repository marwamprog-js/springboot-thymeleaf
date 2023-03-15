package com.demomvc.service;

import java.time.LocalDate;
import java.util.List;

import com.demomvc.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> BuscarTodos();

	List<Funcionario> buscaPorNome(String nome);

	List<Funcionario> buscaPorCargoId(Long id);

	List<Funcionario> buscaPorDatas(LocalDate entrada, LocalDate saida);
	
}
