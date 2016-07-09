package mx.gob.sfp.besop.entity.test;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mx.gob.sfp.entity.Usuario;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEntidadUsuario {
	
	static EntityManager  em = null;
	static EntityTransaction tx = null;
	static EntityManagerFactory emf = null;
	
	Logger log = Logger.getLogger("TestEntidadUsuario");
	
	@BeforeClass
	public static void init() throws Exception{
		emf = Persistence.createEntityManagerFactory("GestionPU");
	}
	
	@Before
	public void setup(){
		try {
			em = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPersonaEntity(){
		log.info("Iniciando usuario JPA");
		
		assertTrue(em != null);
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		em.find(Usuario.class, 35);
	}
}
