package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Semestre;

public interface ISemestreDao extends JpaRepository<Semestre, Long> {

	@Query("select s from Semestre s where s.codeS like :x")
	public Page<Semestre> semestreByCodeS(@Param("x")String code, Pageable p);
	
	public List<Semestre> findByIntituleS(String intituleS);
	
	public Page<Semestre> findByIntituleS(String intituleS, Pageable p);
	
	@Query("select s from Semestre s")
	public List<Semestre> findAll();
	
	@Query("select s from Semestre s where s.idN like :x")
	public Page<Semestre> semestreByidN(@Param("x")Integer idN, Pageable p);
}
