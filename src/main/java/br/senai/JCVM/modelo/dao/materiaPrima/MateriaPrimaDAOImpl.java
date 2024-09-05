package br.senai.JCVM.modelo.dao.materiaPrima;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senai.JCVM.modelo.entidade.materiaPrima.MateriaPrima;
import br.senai.JCVM.modelo.entidade.materiaPrima.MateriaPrima_;
import br.senai.JCVM.modelo.factory.conexao.ConexaoFactory;

public class MateriaPrimaDAOImpl implements MateriaPrimaDAO {
	
	private ConexaoFactory fabrica;

	public MateriaPrimaDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirMateriaPrima(MateriaPrima materiaPrima) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(materiaPrima);

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

	public void deletarMateriaPrima(MateriaPrima materiaPrima) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(materiaPrima);

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

	public void atualizarMateriaPrima(MateriaPrima materiaPrima) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(materiaPrima);

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

	public List<MateriaPrima> buscarMateriasPrimaPorNome(String nome) {
		Session sessao = null;
		List<MateriaPrima> materiasPrima = null;

			
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<MateriaPrima> criteria = construtor.createQuery(MateriaPrima.class);
			Root<MateriaPrima> raizMateriaPrima = criteria.from(MateriaPrima.class);

			criteria.select(raizMateriaPrima).where(construtor.like(raizMateriaPrima.get("nome"), "%" + nome + "%"));

		materiasPrima = sessao.createQuery(criteria).getResultList();
			
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
		return materiasPrima;

	}

	public MateriaPrima buscarMateriaPrimaPorId(Long id) {

	    Session sessao = null;
	    MateriaPrima MateriaPrima = null;

	    try {
	        sessao = fabrica.getConexao().openSession();
	        sessao.beginTransaction();

	        CriteriaBuilder construtor = sessao.getCriteriaBuilder();
	        CriteriaQuery<MateriaPrima> criteria = construtor.createQuery(MateriaPrima.class);
	        Root<MateriaPrima> raizMateriaPrima = criteria.from(MateriaPrima.class);

	        // Adiciona o join fetch para a coleção de normas
	        raizMateriaPrima.fetch("normas", JoinType.LEFT);

	        criteria.select(raizMateriaPrima).where(construtor.equal(raizMateriaPrima.get(MateriaPrima_.ID), id));

	        MateriaPrima = sessao.createQuery(criteria).getSingleResult();

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

	    return MateriaPrima;
	}
	
	public List<MateriaPrima> buscarMateriasPrima() {

		Session sessao = null;
		List<MateriaPrima> MateriasPrima = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<MateriaPrima> criteria = construtor.createQuery(MateriaPrima.class);
			Root<MateriaPrima> raizMateriaPrima = criteria.from(MateriaPrima.class);

			criteria.select(raizMateriaPrima);

			MateriasPrima = sessao.createQuery(criteria).getResultList();

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

		return MateriasPrima;
	}

}

