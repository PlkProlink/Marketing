package br.com.tiagods.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tarefa implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	 private String nome;
	 private String descricao;
	 private LocalDate dataEvento;
	 private LocalTime horaEvento;
	 private String classe;
	 private LocalDateTime criadoEm;
	 private Usuario criadoPor;
	 private TipoTarefa tipoTarefa;
	 private Usuario atendente;
	 private Pessoa pessoa;
	 private Empresa empresa;
	 private Negocio negocio;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the dataEvento
	 */
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	/**
	 * @param dataEvento the dataEvento to set
	 */
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	/**
	 * @return the horaEvento
	 */
	public LocalTime getHoraEvento() {
		return horaEvento;
	}
	/**
	 * @param horaEvento the horaEvento to set
	 */
	public void setHoraEvento(LocalTime horaEvento) {
		this.horaEvento = horaEvento;
	}
	/**
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}
	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}
	/**
	 * @return the criadoEm
	 */
	public LocalDateTime getCriadoEm() {
		return criadoEm;
	}
	/**
	 * @param criadoEm the criadoEm to set
	 */
	public void setCriadoEm(LocalDateTime criadoEm) {
		this.criadoEm = criadoEm;
	}
	/**
	 * @return the criadoPor
	 */
	public Usuario getCriadoPor() {
		return criadoPor;
	}
	/**
	 * @param criadoPor the criadoPor to set
	 */
	public void setCriadoPor(Usuario criadoPor) {
		this.criadoPor = criadoPor;
	}
	/**
	 * @return the tipoTarefa
	 */
	public TipoTarefa getTipoTarefa() {
		return tipoTarefa;
	}
	/**
	 * @param tipoTarefa the tipoTarefa to set
	 */
	public void setTipoTarefa(TipoTarefa tipoTarefa) {
		this.tipoTarefa = tipoTarefa;
	}
	/**
	 * @return the atendente
	 */
	public Usuario getAtendente() {
		return atendente;
	}
	/**
	 * @param atendente the atendente to set
	 */
	public void setAtendente(Usuario atendente) {
		this.atendente = atendente;
	}
	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	/**
	 * @return the negocio
	 */
	public Negocio getNegocio() {
		return negocio;
	}
	/**
	 * @param negocio the negocio to set
	 */
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	 
}
