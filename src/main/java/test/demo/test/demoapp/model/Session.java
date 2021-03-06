package test.demo.test.demoapp.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sessionId;
    private String sessionName;
    private String sessionDescription;


    @ManyToMany
            @JoinTable(name = "sessions_speakers", joinColumns = @JoinColumn(name = "session_id"),
                    inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    List<Speaker> speakers;

    public Session() {
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionDescription() {
        return sessionDescription;
    }

    public void setSessionDescription(String sessionDescription) {
        this.sessionDescription = sessionDescription;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}