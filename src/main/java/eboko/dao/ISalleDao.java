package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Salle;

public interface ISalleDao extends JpaRepository<Salle, Long> {

	@Query("select s from Salle s where s.codeSa like :x")
	public Page<Salle> salleByCodeSa(@Param("x")String code, Pageable p);
	
	public List<Salle> findByIntituleSa(String intituleSa);
	
	public Page<Salle> findByIntituleSa(String intituleSa, Pageable p);
	
	@Query("select s from Salle s")
	public List<Salle> findAll();
}
