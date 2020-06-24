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
	private Long Id_Ses;
	private String Code_Ses;
	private Date Debut_Ses;
	private Date Fin_Ses;
	@JoinColumn(name="Code_U")
	@ManyToOne
	private String Code_U;
	public Long getId_Ses() {
		return Id_Ses;
	}
	public void setId_Ses(Long id_Ses) {
		Id_Ses = id_Ses;
	}
	public String getCode_Ses() {
		return Code_Ses;
	}
	public void setCode_Ses(String code_Ses) {
		Code_Ses = code_Ses;
	}
	public Date getDebut_Ses() {
		return Debut_Ses;
	}
	public void setDebut_Ses(Date debut_Ses) {
		Debut_Ses = debut_Ses;
	}
	public Date getFin_Ses() {
		return Fin_Ses;
	}
	public void setFin_Ses(Date fin_Ses) {
		Fin_Ses = fin_Ses;
	}
	public String getCode_U() {
		return Code_U;
	}
	public void setCode_U(String code_U) {
		Code_U = code_U;
	}
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(Long id_Ses, String code_Ses, Date debut_Ses, Date fin_Ses, String code_U) {
		super();
		Id_Ses = id_Ses;
		Code_Ses = code_Ses;
		Debut_Ses = debut_Ses;
		Fin_Ses = fin_Ses;
		Code_U = code_U;
	}
	@Override
	public String toString() {
		return "Session [Id_Ses=" + Id_Ses + ", Code_Ses=" + Code_Ses + ", Debut_Ses=" + Debut_Ses + ", Fin_Ses="
				+ Fin_Ses + ", Code_U=" + Code_U + "]";
	}
	
}
