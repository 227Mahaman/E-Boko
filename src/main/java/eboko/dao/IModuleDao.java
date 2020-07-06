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
	
	@Query("select m from Module m where m.idA like :x")
	public Page<Module> moduleByIdA(@Param("x")Integer idA, Pageable p);
	
	@Query("select m from Module m where m.idF like :x")
	public Page<Module> moduleByIdF(@Param("x")Integer idF, Pageable p);
	
	@Query("select m from Module m where m.idN like :x")
	public Page<Module> moduleByIdN(@Param("x")Integer idN, Pageable p);
	
	@Query("select m from Module m where m.idUe like :x")
	public Page<Module> moduleByIdUe(@Param("x")Integer idUe, Pageable p);
	
	@Query("select m from Module m where m.idM like :x")
	public Page<Module> moduleByIdM(@Param("x")String idM, Pageable p);
}
