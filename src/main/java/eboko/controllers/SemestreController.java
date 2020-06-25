package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.ISemestreDao;
import eboko.entities.Semestre;

@RestController
public class SemestreController {

	@Autowired
	private ISemestreDao semestreDao;
	
	@PostMapping("/semestre/addSemestre")
	public Semestre addSemestre (@RequestBody Semestre semestre ) {
		semestreDao.save(semestre);
		return semestre;
	}
	
	@PostMapping("/semestre/findAllSemestre")
	public List<Semestre> findAllSemestre(){
		return semestreDao.findAll();
	}
	
	@PostMapping("/semestre/getSemestre")
	public Semestre getSemestre(Long id) {
		return semestreDao.findById(id).orElse(null);
	}
	
	@PostMapping("/semestre/updateSemestre")
	public Semestre update(@RequestBody Semestre semestre) {
		semestreDao.saveAndFlush(semestre);
		return semestre;
	}
}
