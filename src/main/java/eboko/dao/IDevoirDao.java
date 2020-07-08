package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Devoir;
import eboko.entities.Module;;

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
	
	@Query("select d from Devoir d where d.idMo like :x")
	public Page<Devoir> moduleByIdMo(@Param("x")Integer idMo, Pageable p);
	
	//select * from devoir d, module m, filiere f, inscription i, etudiant e where d.id_mo=m.id_mo and m.idf=f.idf and f.idf=i.idf and i.matriculee=e.matriculee and e.ide=1 
	@Query("select d from Devoir d, Module m, Filiere f, Inscription i, Etudiant e where d.idMo=m.idMo and m.idF=f.idF and f.idF=i.idF and i.matriculeE=e.matriculeE and e.idE like :x")
	public List<Devoir> devoirByIdE(@Param("x")Long idE);
}
