package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Semestre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idS;
	private String codeS;
	@JoinColumn(name="codeN")
	@ManyToOne
	private Niveau codeN;
	private String intituleS;
	 // `Choix_S` tinyint(1) DEFAULT '0',
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	 // `IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	private String codeUSuppr;
	public Long getIdS() {
		return idS;
	}
	public void setIdS(Long idS) {
		this.idS = idS;
	}
	public String getCodeS() {
		return codeS;
	}
	public void setCodeS(String codeS) {
		this.codeS = codeS;
	}
	
	public Niveau getCodeN() {
		return codeN;
	}
	public void setCodeN(Niveau codeN) {
		this.codeN = codeN;
	}
	public String getIntituleS() {
		return intituleS;
	}
	public void setIntituleS(String intituleS) {
		this.intituleS = intituleS;
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
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semestre(Long idS, String codeS, Niveau codeN, String intituleS, Date dateCreation, String codeUCrea,
			Date dateMAJ, String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idS = idS;
		this.codeS = codeS;
		this.codeN = codeN;
		this.intituleS = intituleS;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Semestre [idS=" + idS + ", codeS=" + codeS + ", codeN=" + codeN + ", intituleS=" + intituleS
				+ ", dateCreation=" + dateCreation + ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ="
				+ codeUMAJ + ", dateSuppr=" + dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
	
	
}
