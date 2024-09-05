package br.senai.JCVM.modelo.dao.fornecedor;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senai.JCVM.modelo.entidade.fornecedor.Fornecedor;
import br.senai.JCVM.modelo.entidade.fornecedor.Fornecedor_;
import br.senai.JCVM.modelo.factory.conexao.ConexaoFactory;

public class FornecedorDAOImpl implements FornecedorDAO {
	
	private ConexaoFactory fabrica;

	public FornecedorDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirFornecedor(Fornecedor fornecedor) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(fornecedor);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public void deletarFornecedor(Fornecedor fornecedor) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(fornecedor);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public void atualizarFornecedor(Fornecedor fornecedor) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(fornecedor);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public List<Fornecedor> buscarFornecedoresPorNome(String nome) {
		Session sessao = null;
		List<Fornecedor> fornecedores = null;

			
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
			Root<Fornecedor> raizFornecedor = criteria.from(Fornecedor.class);

			criteria.select(raizFornecedor).where(construtor.like(raizFornecedor.get("nome"), "%" + nome + "%"));

			fornecedores = sessao.createQuery(criteria).getResultList();
			
			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();
			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {
			if (sessao != null) {
				sessao.close();
			}
		}
		return fornecedores;

	}

	public Fornecedor buscarFornecedorPorId(Long id) {

	    Session sessao = null;
	    Fornecedor fornecedor = null;

	    try {
	        sessao = fabrica.getConexao().openSession();
	        sessao.beginTransaction();

	        CriteriaBuilder construtor = sessao.getCriteriaBuilder();
	        CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
	        Root<Fornecedor> raizFornecedor = criteria.from(Fornecedor.class);

	        // Adiciona o join fetch para a coleção de normas
	        raizFornecedor.fetch("normas", JoinType.LEFT);

	        criteria.select(raizFornecedor).where(construtor.equal(raizFornecedor.get(Fornecedor_.ID), id));

	        fornecedor = sessao.createQuery(criteria).getSingleResult();

	        sessao.getTransaction().commit();

	    } catch (Exception sqlException) {
	        sqlException.printStackTrace();

	        if (sessao.getTransaction() != null) {
	            sessao.getTransaction().rollback();
	        }

	    } finally {
	        if (sessao != null) {
	            sessao.close();
	        }
	    }

	    return fornecedor;
	}
	
	public List<Fornecedor> buscarFornecedor() {

		Session sessao = null;
		List<Fornecedor> fornecedores = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
			Root<Fornecedor> raizFornecedor = criteria.from(Fornecedor.class);

			criteria.select(raizFornecedor);

			fornecedores = sessao.createQuery(criteria).getResultList();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return fornecedores;
	}

}

