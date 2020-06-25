package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IDevoirDao;
import eboko.entities.Devoir;

@RestController
public class DevoirController {

	@Autowired
	private IDevoirDao devoirDao;
	
	@PostMapping("/devoir/addDevoir")
	public Devoir addDevoir (@RequestBody Devoir devoir ) {
		devoirDao.save(devoir);
		return devoir;
	}
	
	@PostMapping("/devoir/findAllDevoir")
	public List<Devoir> findAllDevoir(){
		return devoirDao.findAll();
	}
	
	@PostMapping("/devoir/getDevoir")
	public Devoir getDevoir(Long id) {
		return devoirDao.findById(id).orElse(null);
	}
	
	@PostMapping("/devoir/updateDevoir")
	public Devoir update(@RequestBody Devoir devoir) {
		devoirDao.saveAndFlush(devoir);
		return devoir;
	}
}
