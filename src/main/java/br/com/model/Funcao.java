package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "funcao")
public class Funcao {

	@Id
	@GeneratedValue(generator = "SEQUENCE", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_FUNCAO", allocationSize = 1)
	@Column(name = "cd_funcao")
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "nivel")
	private String nivel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
