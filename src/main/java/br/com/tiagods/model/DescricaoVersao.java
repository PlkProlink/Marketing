package br.com.tiagods.model;

public class DescricaoVersao {
	private String nome="Neg�cios";
	private String versao="1.0.8";
	private String data="15.03.2017";
	private String versaoBanco="1.0";
	private String detalhes="Inclus�o de Filtro na Tela inicial com Tabelas de Contadores\nNovos icones dentro da tabela Negocios\nMelhorado a visualiza��o da Planilha Exportada";
	/*
	 */
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the versao
	 */
	public String getVersao() {
		return versao;
	}
	
	public String getDate(){
		return data;
	}
	/**
	 * @return the versaoBanco
	 */
	public String getVersaoBanco() {
		return versaoBanco;
	}
	public String getDetalhes(){
		return this.detalhes;
	}
}
