package br.senai.JCVM.modelo.dao.materiaPrima;

import java.util.List;

import br.senai.JCVM.modelo.entidade.materiaPrima.MateriaPrima;

public interface MateriaPrimaDAO {
	
	void inserirMateriaPrima(MateriaPrima materiaPrima);

	void deletarMateriaPrima(MateriaPrima materiaPrima);

	void atualizarMateriaPrima(MateriaPrima materiaPrima);

	List<MateriaPrima> buscarMateriasPrimaPorNome(String nome);
	
	MateriaPrima buscarMateriaPrimaPorId(Long id);
	
	public List<MateriaPrima> buscarMateriasPrima();

}
