package br.com.tiagods.model;

public class VersaoSistema {
	private String nome="Neg�cios";
	private String versao="1.0.34";
	private String data="20/09/2017";
	private String versaoBanco="1.0.4";
	private String detalhes=
			"Tarefa: Ajusta bug que bloqueava a exclus�o de uma tarefa\n"
			+ "         Incluido Tipo de Tarefa como WhatsApp e excluido Visita\n"
			+ "         Implantando visualiza��es dos ultimos 10 acessos do operador\n"
			+ "Inicio:Contador n�o estava funcionando corretamente\n"
			+ "         Facilitado o uso da senha de acesso\n"
			+ "Negocio: altera de imediato o andamento ao salvar uma tarefa\n"
			+ "Prospeccao: ordena��o ajustada para o formato padrao Decrescente\n"
			+ "         Habilitado op��o para buscar Responsavel"
			+ "Todas as telas: usado a ordena��o �nica para as Tarefas por data em ordem decrescente";
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
