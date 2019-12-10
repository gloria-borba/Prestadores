package br.com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "prestador")
public class Prestador {

	@Id
	@GeneratedValue(generator = "SEQUENCE", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_PRESTADOR", allocationSize = 1)
	@Column(name = "cd_prestador")
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "data_nascimento", nullable = false)
	private Date dataNascimento;

	@Column(name = "data_admissao", nullable = false)
	private Date dataAdmissao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_funcao")
	private Funcao funcao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_empresa")
	private Empresa empresa;

	@OneToMany(mappedBy = "prestador", fetch = FetchType.LAZY)
	private List<Telefone> telefones;

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
}
