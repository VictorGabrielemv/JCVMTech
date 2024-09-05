package br.senai.JCVM.modelo.factory.conexao;
 
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
 
public class ConexaoFactory {
 
	public SessionFactory getConexao() {
 
		Configuration configuracao = new Configuration();
 
		configuracao.addAnnotatedClass(br.senai.JCVM.modelo.entidade.materiaPrima.MateriaPrima.class);
		configuracao.addAnnotatedClass(br.senai.JCVM.modelo.entidade.maquina.Maquina.class);
		configuracao.addAnnotatedClass(br.senai.JCVM.modelo.entidade.fornecedor.Fornecedor.class);

		configuracao.configure("hibernate.cfg.xml");
 
		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);
 
		return fabricaSessao;
	}
}