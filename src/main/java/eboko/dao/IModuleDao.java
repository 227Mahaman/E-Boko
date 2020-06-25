package eboko.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import eboko.entities.Module;

public interface IModuleDao extends JpaRepository<Module, Long> {

	@Query("select m from Module m where m.codeMo like :x")
	public Page<Module> moduleByCodeMo(@Param("x")String code, Pageable p);
	
	public List<Module> findByCreditMo(String creditMo);
	
	public Page<Module> findByCreditMo(String creditMo, Pageable p);
	
	@Query("select m from Module m")
	public List<Module> findAll();
	
	@Query("select m from Module m where m.codeA like :x")
	public Page<Module> moduleByCodeA(@Param("x")String code, Pageable p);
	
	@Query("select m from Module m where m.codeF like :x")
	public Page<Module> moduleByCodeF(@Param("x")String code, Pageable p);
	
	@Query("select m from Module m where m.codeN like :x")
	public Page<Module> moduleByCodeN(@Param("x")String code, Pageable p);
	
	@Query("select m from Module m where m.codeUe like :x")
	public Page<Module> moduleByCodeUe(@Param("x")String code, Pageable p);
	
	@Query("select m from Module m where m.codeM like :x")
	public Page<Module> moduleByCodeM(@Param("x")String code, Pageable p);
}
