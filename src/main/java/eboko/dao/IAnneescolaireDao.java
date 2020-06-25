package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Anneescolaire;

public interface IAnneescolaireDao extends JpaRepository<Anneescolaire, Long> {

	@Query("select a from Anneescolaire a where a.codeA like :x")
	public Page<Anneescolaire> anneescolaireByCodeA(@Param("x")String code, Pageable p);
	
	public List<Anneescolaire> findByIntituleA(String intituleA);
	
	public Page<Anneescolaire> findByIntituleA(String intituleA, Pageable p);
	
	@Query("select a from Anneescolaire a")
	public List<Anneescolaire> findAll();
}
