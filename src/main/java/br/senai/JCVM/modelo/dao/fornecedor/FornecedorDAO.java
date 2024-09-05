package br.senai.JCVM.modelo.dao.fornecedor;

import java.util.List;

import br.senai.JCVM.modelo.entidade.fornecedor.Fornecedor;

public interface FornecedorDAO {
	
	void inserirFornecedor(Fornecedor fornecedor);

	void deletarFornecedor(Fornecedor fornecedor);

	void atualizarFornecedor(Fornecedor fornecedor);

	List<Fornecedor> buscarFornecedoresPorNome(String nome);
	
	Fornecedor buscarFornecedorPorId(Long id);
	
	public List<Fornecedor> buscarFornecedor();

}
