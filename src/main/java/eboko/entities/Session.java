package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSes;
	private String codeSes;
	private Date debutSes;
	private Date finSes;
	@JoinColumn(name="idUe")
	@ManyToOne
	private Ue idUe;
	public Long getIdSes() {
		return idSes;
	}
	public void setIdSes(Long idSes) {
		this.idSes = idSes;
	}
	public String getCodeSes() {
		return codeSes;
	}
	public void setCodeSes(String codeSes) {
		this.codeSes = codeSes;
	}
	public Date getDebutSes() {
		return debutSes;
	}
	public void setDebutSes(Date debutSes) {
		this.debutSes = debutSes;
	}
	public Date getFinSes() {
		return finSes;
	}
	public void setFinSes(Date finSes) {
		this.finSes = finSes;
	}
	
	
	public Ue getIdUe() {
		return idUe;
	}
	public void setIdUe(Ue idUe) {
		this.idUe = idUe;
	}
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(Long idSes, String codeSes, Date debutSes, Date finSes, Ue idUe) {
		super();
		this.idSes = idSes;
		this.codeSes = codeSes;
		this.debutSes = debutSes;
		this.finSes = finSes;
		this.idUe = idUe;
	}
	@Override
	public String toString() {
		return "Session [idSes=" + idSes + ", codeSes=" + codeSes + ", debutSes=" + debutSes + ", finSes=" + finSes
				+ ", idUe=" + idUe + "]";
	}
	
}
