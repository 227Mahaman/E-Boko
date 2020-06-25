package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.ISalleDao;
import eboko.entities.Salle;

@RestController
public class SalleController {

	@Autowired
	private ISalleDao salleDao;
	
	@PostMapping("/salle/addSalle")
	public Salle addSalle (@RequestBody Salle salle ) {
		salleDao.save(salle);
		return salle;
	}
	
	@PostMapping("/salle/findAllSalle")
	public List<Salle> findAllSalle(){
		return salleDao.findAll();
	}
	
	@PostMapping("/salle/getSalle")
	public Salle getSalle(Long id) {
		return salleDao.findById(id).orElse(null);
	}
	
	@PostMapping("/salle/updateSalle")
	public Salle update(@RequestBody Salle salle) {
		salleDao.saveAndFlush(salle);
		return salle;
	}
}
