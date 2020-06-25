package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Etudiant;

public interface IEtudiantDao extends JpaRepository<Etudiant, Long> {

	@Query("select e from Etudiant e where e.matriculeE like :x")
	public Page<Etudiant> filiereByMatriculeE(@Param("x")String matricule, Pageable p);
	
	public List<Etudiant> findByNomE(String nomE);
	
	public Page<Etudiant> findByNomE(String nomE, Pageable p);
	
	public List<Etudiant> findByNationaliteE(String nationaliteE);
	
	public Page<Etudiant> findByNationaliteE(String nationaliteE, Pageable p);
	
	@Query("select e from Etudiant e")
	public List<Etudiant> findAll();
}
