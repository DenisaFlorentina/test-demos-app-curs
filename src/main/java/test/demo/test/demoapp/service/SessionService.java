package test.demo.test.demoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.demo.test.demoapp.model.Session;
import test.demo.test.demoapp.repository.SessionRepository;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    SessionRepository sessionRepository;

    //findAllSessions
    public List<Session> findAllSessions(){
        return sessionRepository.findAll();
    }

    //getSessionById
    public Session getSessionById(Long id){
        return sessionRepository.findById(id).get();
    }

    //createSession/addSession
    public Session createSession(Session newSession){
        return sessionRepository.saveAndFlush(newSession);
    }

    //deleteSessionById
    public void deleteSessionById(Long id){
        sessionRepository.deleteById(id);
    }


}
