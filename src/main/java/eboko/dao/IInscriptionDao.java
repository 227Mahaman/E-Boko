package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Inscription;

public interface IInscriptionDao extends JpaRepository<Inscription, Long> {
	
	@Query("select i from Inscription i where i.matriculeE like :x")
	public Page<Inscription> inscriptionByMatricule(@Param("x")String matricule, Pageable p);
	
	public List<Inscription> findByMatriculeE(String matriculeE);
	
	public Page<Inscription> findByMatriculeE(String matriculeE, Pageable p);
	
	public List<Inscription> findByCodeI(String codeI);
	
	public Page<Inscription> findByCodeI(String codeI, Pageable p);
	
	@Query("select i from Inscription i")
	public List<Inscription> findAll();
}
