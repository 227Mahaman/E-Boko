package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSa;
	private String codeSa;
	private String intituleSa;
	private String descriptionSa;
	private String capaciteSa;
	//`Choix_Sa` tinyint(1) DEFAULT '0',
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	private String codeUSuppr;
	public Long getIdSa() {
		return idSa;
	}
	public void setIdSa(Long idSa) {
		this.idSa = idSa;
	}
	public String getCodeSa() {
		return codeSa;
	}
	public void setCodeSa(String codeSa) {
		this.codeSa = codeSa;
	}
	public String getIntituleSa() {
		return intituleSa;
	}
	public void setIntituleSa(String intituleSa) {
		this.intituleSa = intituleSa;
	}
	public String getDescriptionSa() {
		return descriptionSa;
	}
	public void setDescriptionSa(String descriptionSa) {
		this.descriptionSa = descriptionSa;
	}
	public String getCapaciteSa() {
		return capaciteSa;
	}
	public void setCapaciteSa(String capaciteSa) {
		this.capaciteSa = capaciteSa;
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
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(Long idSa, String codeSa, String intituleSa, String descriptionSa, String capaciteSa,
			Date dateCreation, String codeUCrea, Date dateMAJ, String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idSa = idSa;
		this.codeSa = codeSa;
		this.intituleSa = intituleSa;
		this.descriptionSa = descriptionSa;
		this.capaciteSa = capaciteSa;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Salle [idSa=" + idSa + ", codeSa=" + codeSa + ", intituleSa=" + intituleSa + ", descriptionSa="
				+ descriptionSa + ", capaciteSa=" + capaciteSa + ", dateCreation=" + dateCreation + ", codeUCrea="
				+ codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr=" + dateSuppr
				+ ", codeUSuppr=" + codeUSuppr + "]";
	}
	
	
}
