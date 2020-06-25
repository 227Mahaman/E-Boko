package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Niveau;

public interface INiveauDao extends JpaRepository<Niveau, Long> {

	@Query("select n from Niveau n where n.codeN like :x")
	public Page<Niveau> niveauByCodeN(@Param("x")String code, Pageable p);
	
	public List<Niveau> findByIntituleN(String intituleN);
	
	public Page<Niveau> findByIntituleN(String intituleN, Pageable p);
	
	@Query("select n from Niveau n")
	public List<Niveau> findAll();
}
