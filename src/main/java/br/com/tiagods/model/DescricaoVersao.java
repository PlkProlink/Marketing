package br.com.tiagods.model;

public class DescricaoVersao {
	private String nome="Neg�cios";
	private String versao="1.0";
	private String data="31.01.2017";
	private String versaoBanco="1.0";
	private String detalhes="Ao criar uma tarefa o Neg�cio vinculado a esta tarefa � atualizado para "
			+ "Contato, Enviando Proposta ou Follow-up de acordo com o Tipo de Tarefa."
			+ "� necess�rio Atualizar a pagina Neg�cios depois da inclus�o ou altera��o de uma tarefa.";
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
