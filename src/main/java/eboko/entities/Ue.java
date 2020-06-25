package eboko.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ue implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUe;
	private String codeUe;
	private String intitule;
	//Choix_UE` tinyint(1) DEFAULT '0',
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	private String codeUSuppr;
	private String codePersoUE;
	public Long getIdUe() {
		return idUe;
	}
	public void setIdUe(Long idUe) {
		this.idUe = idUe;
	}
	public String getCodeUe() {
		return codeUe;
	}
	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getCodeUCrea() {
		return codeUCrea;
	}
	public void setCodeUCrea(String codeUCrea) {
		this.codeUCrea = codeUCrea;
	}
	public Date getDateMAJ() {
		return dateMAJ;
	}
	public void setDateMAJ(Date dateMAJ) {
		this.dateMAJ = dateMAJ;
	}
	public String getCodeUMAJ() {
		return codeUMAJ;
	}
	public void setCodeUMAJ(String codeUMAJ) {
		this.codeUMAJ = codeUMAJ;
	}
	public Date getDateSuppr() {
		return dateSuppr;
	}
	public void setDateSuppr(Date dateSuppr) {
		this.dateSuppr = dateSuppr;
	}
	public String getCodeUSuppr() {
		return codeUSuppr;
	}
	public void setCodeUSuppr(String codeUSuppr) {
		this.codeUSuppr = codeUSuppr;
	}
	public String getCodePersoUE() {
		return codePersoUE;
	}
	public void setCodePersoUE(String codePersoUE) {
		this.codePersoUE = codePersoUE;
	}
	public Ue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ue(Long idUe, String codeUe, String intitule, Date dateCreation, String codeUCrea, Date dateMAJ,
			String codeUMAJ, Date dateSuppr, String codeUSuppr, String codePersoUE) {
		super();
		this.idUe = idUe;
		this.codeUe = codeUe;
		this.intitule = intitule;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
		this.codePersoUE = codePersoUE;
	}
	@Override
	public String toString() {
		return "Ue [idUe=" + idUe + ", codeUe=" + codeUe + ", intitule=" + intitule + ", dateCreation=" + dateCreation
				+ ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr="
				+ dateSuppr + ", codeUSuppr=" + codeUSuppr + ", codePersoUE=" + codePersoUE + "]";
	}
	
	
}
