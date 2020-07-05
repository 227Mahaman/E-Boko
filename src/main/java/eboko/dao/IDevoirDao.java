package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Devoir;

public interface IDevoirDao extends JpaRepository<Devoir, Long> {

	@Query("select d from Devoir d where d.codeD like :x")
	public Page<Devoir> devoirByCodeD(@Param("x")String code, Pageable p);
	
	public List<Devoir> findByDateD(String dateD);
	
	public Page<Devoir> findByDateD(String dateD, Pageable p);
	
	public List<Devoir> findBySessionD(String sessionD);
	
	public Page<Devoir> findBySessionD(String sessionD, Pageable p);
	
	public List<Devoir> findByTypeD(String typeD);
	
	public Page<Devoir> findByTypeD(String typeD, Pageable p);
	
	@Query("select d from Devoir d")
	public List<Devoir> findAll();
	
	@Query("select d from Devoir d where d.codeNu like :x")
	public Page<Devoir> moduleByCodeNu(@Param("x")String code, Pageable p);
	
	@Query("select d from Devoir d where d.codeMo like :x")
	public Page<Devoir> moduleByCodeMo(@Param("x")String code, Pageable p);
}
