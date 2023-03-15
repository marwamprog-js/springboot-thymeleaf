package com.demomvc.util;

import java.util.List;

public class PaginacaoUtil<T> {

	private int tamanho; // Armazena o numero de linhas 
	private int pagina; //Armazana o numero da pagina selecionada pelo cliente
	private long totalDePaginas; //Armazena o total de paginas que temos no sistema de paginacao. 15registros / 5porpagina = 3páginas
	private String direcao;
	private List<T> registros;
	
	
	
	public PaginacaoUtil(int tamanho, int pagina, long totalDePaginas, String direcao, List<T> registros) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalDePaginas = totalDePaginas;
		this.direcao = direcao;
		this.registros = registros;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public int getPagina() {
		return pagina;
	}
	public long getTotalDePaginas() {
		return totalDePaginas;
	}
	public List<T> getRegistros() {
		return registros;
	}	
	public String getDirecao() {
		return direcao;
	}
	
	
	
}
