package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.ISemestreDao;
import eboko.entities.Semestre;

@RestController
@RequestMapping("/semestre")
@CrossOrigin
public class SemestreController {

	@Autowired
	private ISemestreDao semestreDao;
	
	@PostMapping("/add")
	public Semestre addSemestre (@RequestBody Semestre semestre ) {
		semestreDao.save(semestre);
		return semestre;
	}
	
	@RequestMapping("/all")
	public List<Semestre> findAllSemestre(){
		return semestreDao.findAll();
	}
	
	@RequestMapping("/get")
	public Semestre getSemestre(Long id) {
		return semestreDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Semestre update(@RequestBody Semestre semestre) {
		semestreDao.saveAndFlush(semestre);
		return semestre;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		semestreDao.deleteById(id);
	}
}
