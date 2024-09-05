package br.senai.JCVM.modelo.entidade.maquina;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "maquina")
public class Maquina implements Serializable {

	private static final long serialVersionUID = -5490662719172348361L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_maquina")
	private Long id;

	@Column(name = "nome_maquina", length = 65, nullable = false)
	private String nome;

	@Column(name = "tipo_maquina", length = 65, nullable = false)
	private String tipo;

	@Column(name = "desc_maquina", length = 100, nullable = false)
	private String descricao;
	
	@Column(name = "funcionamento_maquina", length = 100, nullable = false)
	private String funcionamento;

	@Column(name = "horario_inicio_operacao", length = 65, nullable = true)
	private LocalTime horarioInicioOperacao;

	@Column(name = "horario_fechamento_operacao", length = 65, nullable = true)
	private LocalTime horarioFechamentoOperacao;

	@Column(name = "capacidade_operacao", length = 65, nullable = true)
	private String capacidadeOperacao;
	
	@Column(name = "nivel_perigo", length = 65, nullable = true)
	private String nivelPerigo;

	public Maquina () {}
	
	public Maquina(String nome, String tipo, String descricao, String funcionamento, LocalTime horarioInicioOperacao,
			LocalTime horarioFechamentoOperacao, String capacidadeOperacao, String nivelPerigo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.funcionamento = funcionamento;
		this.horarioInicioOperacao = horarioInicioOperacao;
		this.horarioFechamentoOperacao = horarioFechamentoOperacao;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(String funcionamento) {
		this.funcionamento = funcionamento;
	}

	public LocalTime getHorarioInicioOperacao() {
		return horarioInicioOperacao;
	}

	public void setHorarioInicioOperacao(LocalTime horarioInicioOperacao) {
		this.horarioInicioOperacao = horarioInicioOperacao;
	}

	public LocalTime getHorarioFechamentoOperacao() {
		return horarioFechamentoOperacao;
	}

	public void setHorarioFechamentoOperacao(LocalTime horarioFechamentoOperacao) {
		this.horarioFechamentoOperacao = horarioFechamentoOperacao;
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
