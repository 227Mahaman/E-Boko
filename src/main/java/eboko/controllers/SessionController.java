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

import eboko.dao.ISessionDao;
import eboko.entities.Session;

@RestController
@RequestMapping("/session")
@CrossOrigin
public class SessionController {

	@Autowired
	private ISessionDao sessionDao;
	
	@PostMapping("/add")
	public Session addSession (@RequestBody Session session ) {
		sessionDao.save(session);
		return session;
	}
	
	@RequestMapping("/all")
	public List<Session> findAllSession(){
		return sessionDao.findAll();
	}
	
	@RequestMapping("/get")
	public Session getSession(Long id) {
		return sessionDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Session update(@RequestBody Session session) {
		sessionDao.saveAndFlush(session);
		return session;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		sessionDao.deleteById(id);
	}
}
