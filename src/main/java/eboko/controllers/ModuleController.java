package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IModuleDao;
import eboko.entities.Module;

@RestController
public class ModuleController {

	@Autowired
	private IModuleDao moduleDao;
	
	@PostMapping("/module/addModule")
	public Module addModule (@RequestBody Module module ) {
		moduleDao.save(module);
		return module;
	}
	
	@RequestMapping("/module/findAllModule")
	public List<Module> findAllModule(){
		return moduleDao.findAll();
	}
	
	@RequestMapping("/module/getModule")
	public Module getModule(Long id) {
		return moduleDao.findById(id).orElse(null);
	}
	
	@PostMapping("/module/updateModule")
	public Module update(@RequestBody Module module) {
		moduleDao.saveAndFlush(module);
		return module;
	}
}
