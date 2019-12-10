package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone {

	@Id
	@GeneratedValue(generator = "SEQUENCE", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_TELEFONE", allocationSize = 1)
	@Column(name = "cd_telefone")
	private Long id;

	@Column(name = "ddd", nullable = false)
	private Long ddd;

	@Column(name = "numero", nullable = false)
	private Long numero;

	@Column(name = "tipo")
	private String tipo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_prestador")
	private Prestador prestador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDdd() {
		return ddd;
	}

	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
}
