package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Ue;

public interface IUeDao extends JpaRepository<Ue, Long> {

	@Query("select u from Ue u where u.codeUE like :x")
	public Page<Ue> ueByCode(@Param("x")String code, Pageable p);
	
	public List<Ue> findByIntitule(String intitule);
	
	public Page<Ue> findByIntitule(String intitule, Pageable p);
	
	@Query("select u from Ue u")
	public List<Ue> findAll();
}
