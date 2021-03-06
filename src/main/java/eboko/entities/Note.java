package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNo;
	private String codeNo;
	private String valeurNo;
	@JoinColumn(name="idD")
	@ManyToOne
	private Devoir idD;
	@JoinColumn(name="idE")
	@ManyToOne
	private Etudiant idE;
	//Choix_No` tinyint(1) DEFAULT '0',
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	private String codeUSuppr;
	public Long getIdNo() {
		return idNo;
	}
	public void setIdNo(Long idNo) {
		this.idNo = idNo;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	public String getValeurNo() {
		return valeurNo;
	}
	public void setValeurNo(String valeurNo) {
		this.valeurNo = valeurNo;
	}
	
	public Devoir getIdD() {
		return idD;
	}
	public void setIdD(Devoir idD) {
		this.idD = idD;
	}
	public Etudiant getIdE() {
		return idE;
	}
	public void setIdE(Etudiant idE) {
		this.idE = idE;
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
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(Long idNo, String codeNo, String valeurNo, Devoir idD, Etudiant idE, Date dateCreation,
			String codeUCrea, Date dateMAJ, String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idNo = idNo;
		this.codeNo = codeNo;
		this.valeurNo = valeurNo;
		this.idD = idD;
		this.idE = idE;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Note [idNo=" + idNo + ", codeNo=" + codeNo + ", valeurNo=" + valeurNo + ", idD=" + idD + ", idE=" + idE
				+ ", dateCreation=" + dateCreation + ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ="
				+ codeUMAJ + ", dateSuppr=" + dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
	
	
	
}
