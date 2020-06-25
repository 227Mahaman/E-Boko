package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.ISessionDao;
import eboko.entities.Session;

@RestController
public class SessionController {

	@Autowired
	private ISessionDao sessionDao;
	
	@PostMapping("/session/addSession")
	public Session addSession (@RequestBody Session session ) {
		sessionDao.save(session);
		return session;
	}
	
	@PostMapping("/session/findAllSession")
	public List<Session> findAllSession(){
		return sessionDao.findAll();
	}
	
	@PostMapping("/session/getSession")
	public Session getSession(Long id) {
		return sessionDao.findById(id).orElse(null);
	}
	
	@PostMapping("/session/updateSession")
	public Session update(@RequestBody Session session) {
		sessionDao.saveAndFlush(session);
		return session;
	}
}
