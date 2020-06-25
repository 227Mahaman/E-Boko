package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Niveau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idN;
	private String codeN;
  	private String intituleN;
  	private String montantScolariteN;
  	//`Choix_N` tinyint(1) DEFAULT '0',
 	private Date dateCreation;
  	private String codeUCrea;
  	private Date dateMAJ;
  	private String codeUMAJ;
  	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
  	private String codeUSuppr;
	public Long getIdN() {
		return idN;
	}
	public void setIdN(Long idN) {
		this.idN = idN;
	}
	public String getCodeN() {
		return codeN;
	}
	public void setCodeN(String codeN) {
		this.codeN = codeN;
	}
	public String getIntituleN() {
		return intituleN;
	}
	public void setIntituleN(String intituleN) {
		this.intituleN = intituleN;
	}
	public String getMontantScolariteN() {
		return montantScolariteN;
	}
	public void setMontantScolariteN(String montantScolariteN) {
		this.montantScolariteN = montantScolariteN;
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
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Niveau(Long idN, String codeN, String intituleN, String montantScolariteN, Date dateCreation,
			String codeUCrea, Date dateMAJ, String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idN = idN;
		this.codeN = codeN;
		this.intituleN = intituleN;
		this.montantScolariteN = montantScolariteN;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Niveau [idN=" + idN + ", codeN=" + codeN + ", intituleN=" + intituleN + ", montantScolariteN="
				+ montantScolariteN + ", dateCreation=" + dateCreation + ", codeUCrea=" + codeUCrea + ", dateMAJ="
				+ dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr=" + dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
  	
}
