package com.projetofinal.VMPerUse.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_solicitacao")
public class Solicitacao {
	@Column(name = "numSolicitacao")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numSolicitacao;
	
	@Column(name = "data")
	//@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate data;
	@Column(name = "observacoes", length = 200)
	private String observacoes;
	@Column(name = "valor")
	private float valor;
	@Column(name = "status", length = 50)
	private String status;

	@ManyToOne
	@JsonIgnoreProperties("pedidos")
	private Usuario solicitante;
	
	@OneToMany(mappedBy = "solicitacao", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("solicitacao")
	private List<Item> itensSolicitacao;
	
	public List<Item> getItensSolicitacao() {
		return itensSolicitacao;
	}
	public void setItensSolicitacao(List<Item> itensSolicitacao) {
		this.itensSolicitacao = itensSolicitacao;
	}
	public Usuario getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}
	public int getNumSolicitacao() {
		return numSolicitacao;
	}
	public void setNumSolicitacao(int numSolicitacao) {
		this.numSolicitacao = numSolicitacao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
