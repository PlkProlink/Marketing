package br.com.tiagods.model.negocio;


import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Franquia implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private boolean ativo = true;
	
	@OneToMany(mappedBy="franquia",cascade=CascadeType.ALL, fetch=FetchType.EAGER,orphanRemoval=true)
	private Set<FranquiaPacote> pacotes= new HashSet<>();
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Calendar lastUpdate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="criado_em")
	private Calendar criadoEm;
	
	@Enumerated(EnumType.STRING)
    private Tipo tipo = Tipo.SERVICO;
    public enum Tipo{
        TODOS("Tipo Serviço"),COMERCIO("Comercio"),SERVICO("Serviço");
    	private String descricao;
    	Tipo(String descricao){
    		this.descricao=descricao;
    	}
    	@Override
    	public String toString() {
    		return descricao;
    	}
    }
	/**
	 * @return the id
	 */
	@PrePersist 
	private void prePersit() {
		this.criadoEm = Calendar.getInstance();
		this.lastUpdate= this.criadoEm;
	}
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the pacotes
	 */
	public Set<FranquiaPacote> getPacotes() {
		return pacotes;
	}
	/**
	 * @param pacotes the pacotes to set
	 */
	public void setPacotes(Set<FranquiaPacote> pacotes) {
		this.pacotes = pacotes;
	}
	/**
	 * @return the lastUpdate
	 */
	public Calendar getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	/**
	 * @return the criadoEm
	 */
	public Calendar getCriadoEm() {
		return criadoEm;
	}
	/**
	 * @param criadoEm the criadoEm to set
	 */
	public void setCriadoEm(Calendar criadoEm) {
		this.criadoEm = criadoEm;
	}
	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
