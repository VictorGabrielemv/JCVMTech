package br.senai.JCVM.modelo.entidade.materiaPrima;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import br.senai.JCVM.modelo.entidade.fornecedor.Fornecedor;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MateriaPrima.class)
public abstract class MateriaPrima_ {

	public static volatile SingularAttribute<MateriaPrima, Double> preco_unitario;
	public static volatile SingularAttribute<MateriaPrima, String> codigo;
	public static volatile SingularAttribute<MateriaPrima, String> nivelPerigo;
	public static volatile SingularAttribute<MateriaPrima, String> nome;
	public static volatile SingularAttribute<MateriaPrima, Long> id;
	public static volatile SingularAttribute<MateriaPrima, Fornecedor> fornecedor;
	public static volatile SingularAttribute<MateriaPrima, String> capacidadeOperacao;
	public static volatile SingularAttribute<MateriaPrima, String> descricao;

	public static final String PRECO_UNITARIO = "preco_unitario";
	public static final String CODIGO = "codigo";
	public static final String NIVEL_PERIGO = "nivelPerigo";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String FORNECEDOR = "fornecedor";
	public static final String CAPACIDADE_OPERACAO = "capacidadeOperacao";
	public static final String DESCRICAO = "descricao";

}

