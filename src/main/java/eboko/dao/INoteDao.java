package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Note;

public interface INoteDao extends JpaRepository<Note, Long> {

	@Query("select n from Note n where n.codeNo like :x")
	public Page<Note> noteByCodeNo(@Param("x")String code, Pageable p);
	
	@Query("select n from Note n")
	public List<Note> findAll();
	
	@Query("select n from Note n where n.matriculeE like :x")
	public Page<Note> noteByMatriculeE(@Param("x")String matricule, Pageable p);
}
