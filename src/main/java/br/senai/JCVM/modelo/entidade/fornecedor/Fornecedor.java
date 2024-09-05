package br.senai.JCVM.modelo.entidade.fornecedor;

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

import br.senai.JCVM.modelo.entidade.materiaPrima.MateriaPrima;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {
	
	private static final long serialVersionUID = -4792629680686861191L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fornecedor")
	private Long id;

	@Column(name = "nome_fornecedor", length = 65, nullable = false)
	private String nome;

	@Column(name = "endereco_fornecedor", length = 65, nullable = false)
	private String endereco;

	@Column(name = "telefone_fornecedor", length = 100, nullable = false)
	private String telefone;

	@Column(name = "cadastro_fornecedor", length = 65, nullable = false)
	private String cadastro;

	@Column(name = "email_fornecedor", length = 65, nullable = true)
	private String email;

	@Column(name = "produto_fornecido", length = 65, nullable = true)
	private String produtoFornecido;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "fornecedor_materia_prima", joinColumns = @JoinColumn(name = "id_fornecedor"), inverseJoinColumns = @JoinColumn(name = "id_materia_prima"))
	private List<MateriaPrima> materiaPrima;

	public Fornecedor(String nome, String endereco, String telefone, String cadastro, String email,
			String produtoFornecido, MateriaPrima materiaPrima, String nivelPerigo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cadastro = cadastro;
		this.email = email;
		this.produtoFornecido = produtoFornecido;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProdutoFornecido() {
		return produtoFornecido;
	}

	public void setProdutoFornecido(String produtoFornecido) {
		this.produtoFornecido = produtoFornecido;
	}

}
