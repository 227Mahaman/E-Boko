package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Session;

public interface ISessionDao extends JpaRepository<Session, Long> {

	@Query("select s from Session s where s.codeSes like :x")
	public Page<Session> sessionByCodeSes(@Param("x")String code, Pageable p);
	
	public List<Session> findByDebutSes(String debutSes);
	
	public Page<Session> findByDebutSes(String debutSes, Pageable p);
	
	public List<Session> findByfinSes(String finSes);
	
	public Page<Session> findByfinSes(String finSes, Pageable p);
	
	@Query("select s from Session s")
	public List<Session> findAll();
	
	@Query("select s from Session s where s.codeU like :x")
	public Page<Session> sessionByCodeU(@Param("x")String code, Pageable p);
}
