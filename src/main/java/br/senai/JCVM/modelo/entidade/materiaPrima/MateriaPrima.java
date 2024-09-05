package br.senai.JCVM.modelo.entidade.materiaPrima;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.senai.JCVM.modelo.entidade.fornecedor.Fornecedor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "materiaPrima")
public class MateriaPrima implements Serializable {

	private static final long serialVersionUID = -1981399600294366692L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_materia_prima")
	private Long id;

	@Column(name = "nome_materia_prima", length = 65, nullable = false)
	private String nome;

	@Column(name = "codigo_materia_prima", length = 65, nullable = false)
	private String codigo;

	@Column(name = "desc_materia_prima", length = 100, nullable = false)
	private String descricao;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "materia_prima_fornecedor", joinColumns = @JoinColumn(name = "id_materia_prima"), inverseJoinColumns = @JoinColumn(name = "id_fornecedor"))
	private List<Fornecedor> fornecedor;

	@Column(name = "preco_unitario", length = 65, nullable = true)
	private Double preco_unitario;

	@Column(name = "capacidade_operacao", length = 65, nullable = true)
	private String capacidadeOperacao;

	@Column(name = "nivel_perigo", length = 65, nullable = true)
	private String nivelPerigo;

	public MateriaPrima(String nome, String codigo, String descricao, Fornecedor fornecedor, Double preco_unitario,
			String capacidadeOperacao, String nivelPerigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco_unitario = preco_unitario;
		this.capacidadeOperacao = capacidadeOperacao;
		this.nivelPerigo = nivelPerigo;
	}

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public String getCapacidadeOperacao() {
		return capacidadeOperacao;
	}

	public void setCapacidadeOperacao(String capacidadeOperacao) {
		this.capacidadeOperacao = capacidadeOperacao;
	}

	public String getNivelPerigo() {
		return nivelPerigo;
	}

	public void setNivelPerigo(String nivelPerigo) {
		this.nivelPerigo = nivelPerigo;
	}
	
}
