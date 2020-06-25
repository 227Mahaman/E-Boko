package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Filiere;

public interface IFiliereDao extends JpaRepository<Filiere, Long> {

	@Query("select f from Filiere f where f.codeF like :x")
	public Page<Filiere> filiereByCodeF(@Param("x")String code, Pageable p);
	
	public List<Filiere> findByIntituleF(String intituleF);
	
	public Page<Filiere> findByIntituleF(String intituleF, Pageable p);
	
	@Query("select f from Filiere f")
	public List<Filiere> findAll();
}
