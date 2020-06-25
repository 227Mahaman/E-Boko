package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idF;
	private String codeF;
	private String intituleF;
	private String descriptionF;
	//`Choix_F` tinyint(1) DEFAULT '0',
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	private String codeUSuppr;
	public Long getIdF() {
		return idF;
	}
	public void setIdF(Long idF) {
		this.idF = idF;
	}
	public String getCodeF() {
		return codeF;
	}
	public void setCodeF(String codeF) {
		this.codeF = codeF;
	}
	public String getIntituleF() {
		return intituleF;
	}
	public void setIntituleF(String intituleF) {
		this.intituleF = intituleF;
	}
	public String getDescriptionF() {
		return descriptionF;
	}
	public void setDescriptionF(String descriptionF) {
		this.descriptionF = descriptionF;
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
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiere(Long idF, String codeF, String intituleF, String descriptionF, Date dateCreation, String codeUCrea,
			Date dateMAJ, String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idF = idF;
		this.codeF = codeF;
		this.intituleF = intituleF;
		this.descriptionF = descriptionF;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Filiere [idF=" + idF + ", codeF=" + codeF + ", intituleF=" + intituleF + ", descriptionF="
				+ descriptionF + ", dateCreation=" + dateCreation + ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ
				+ ", codeUMAJ=" + codeUMAJ + ", dateSuppr=" + dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
	
	
}
