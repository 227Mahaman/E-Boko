package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idI;
	private String codeI;
	private Date dateI;
	@JoinColumn(name="idA")
	@ManyToOne
	private Anneescolaire idA;
	@JoinColumn(name="idF")
	@ManyToOne
	private Filiere idF;
	@JoinColumn(name="idN")
	@ManyToOne
	private Niveau idN;
	private String idNu;
	private String matriculeE;
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	private Date dateSuppr;
	private String codeUSuppr;
	public Long getIdI() {
		return idI;
	}
	public void setIdI(Long idI) {
		this.idI = idI;
	}
	
	public String getCodeI() {
		return codeI;
	}
	public void setCodeI(String codeI) {
		this.codeI = codeI;
	}
	public Date getDateI() {
		return dateI;
	}
	public void setDateI(Date dateI) {
		this.dateI = dateI;
	}
	
	public Anneescolaire getIdA() {
		return idA;
	}
	public void setIdA(Anneescolaire idA) {
		this.idA = idA;
	}
	public Filiere getIdF() {
		return idF;
	}
	public void setIdF(Filiere idF) {
		this.idF = idF;
	}
	public Niveau getIdN() {
		return idN;
	}
	public void setIdN(Niveau idN) {
		this.idN = idN;
	}
	public String getIdNu() {
		return idNu;
	}
	public void setIdNu(String idNu) {
		this.idNu = idNu;
	}
	public String getMatriculeE() {
		return matriculeE;
	}
	public void setMatriculeE(String matriculeE) {
		this.matriculeE = matriculeE;
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
	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inscription(Long idI, String codeI, Date dateI, Anneescolaire idA, Filiere idF, Niveau idN, String idNu,
			String matriculeE, Date dateCreation, String codeUCrea, Date dateMAJ, String codeUMAJ, Date dateSuppr,
			String codeUSuppr) {
		super();
		this.idI = idI;
		this.codeI = codeI;
		this.dateI = dateI;
		this.idA = idA;
		this.idF = idF;
		this.idN = idN;
		this.idNu = idNu;
		this.matriculeE = matriculeE;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Inscription [idI=" + idI + ", codeI=" + codeI + ", dateI=" + dateI + ", idA=" + idA + ", idF=" + idF
				+ ", idN=" + idN + ", idNu=" + idNu + ", matriculeE=" + matriculeE + ", dateCreation=" + dateCreation
				+ ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr="
				+ dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
}
