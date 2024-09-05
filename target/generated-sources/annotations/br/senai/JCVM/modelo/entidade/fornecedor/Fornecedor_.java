package br.senai.JCVM.modelo.entidade.fornecedor;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import br.senai.JCVM.modelo.entidade.materiaPrima.MateriaPrima;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Fornecedor.class)
public abstract class Fornecedor_ {

	public static volatile SingularAttribute<Fornecedor, String> telefone;
	public static volatile SingularAttribute<Fornecedor, String> produtoFornecido;
	public static volatile SingularAttribute<Fornecedor, String> endereco;
	public static volatile SingularAttribute<Fornecedor, String> nivelPerigo;
	public static volatile SingularAttribute<Fornecedor, String> nome;
	public static volatile SingularAttribute<Fornecedor, Long> id;
	public static volatile SingularAttribute<Fornecedor, String> cadastro;
	public static volatile SingularAttribute<Fornecedor, String> email;
	public static volatile SingularAttribute<Fornecedor, MateriaPrima> materiaPrima;

	public static final String TELEFONE = "telefone";
	public static final String PRODUTO_FORNECIDO = "produtoFornecido";
	public static final String ENDERECO = "endereco";
	public static final String NIVEL_PERIGO = "nivelPerigo";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String CADASTRO = "cadastro";
	public static final String EMAIL = "email";
	public static final String MATERIA_PRIMA = "materiaPrima";

}

