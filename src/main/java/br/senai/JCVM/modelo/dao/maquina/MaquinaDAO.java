package br.senai.JCVM.modelo.dao.maquina;

import java.util.List;

import br.senai.JCVM.modelo.entidade.maquina.Maquina;

public interface MaquinaDAO {
	
	void inserirMaquina(Maquina maquina);

	void deletarMaquina(Maquina maquina);

	void atualizarMaquina(Maquina maquina);

	List<Maquina> buscarMaquinasPorNome(String nome);
	
	Maquina buscarMaquinaPorId(Long id);
	
	public List<Maquina> buscarMaquinas();

}
