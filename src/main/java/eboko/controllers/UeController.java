package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IUeDao;
import eboko.entities.Ue;

@RestController
public class UeController {

	@Autowired
	private IUeDao ueDao;
	
	@PostMapping("/ue/addUe")
	public Ue addUe (@RequestBody Ue ue) {
		ueDao.save(ue);
		return ue;
	}
	
	@RequestMapping("/ue/findAllUe")
	public List<Ue> findAllUe(){
		return ueDao.findAll();
	}
	
	//@PostMapping("/ue")
	//public Page<Ue> findAllUe(int page){
		//return ueDao.findAll(new PageRequest(page, 5));
	//}
	
	//@RequestMapping("/ueBySearch")
	//public Page<Ue> ueBySearch(String search, int page){
		//return ueDao.ueByCode("%"+search+"%", new PageRequest(page, 5));
	//}
	
	@RequestMapping("/ue/getUe")
	public Ue getUe(Long id) {
		return ueDao.findById(id).orElse(null);
	}
	
	@PostMapping("/ue/updateUe")
	public Ue update(@RequestBody Ue ue) {
		ueDao.saveAndFlush(ue);
		return ue;
	}
}
