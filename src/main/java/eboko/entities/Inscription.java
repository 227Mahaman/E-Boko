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
	private Date dateI;
	@JoinColumn(name="codeA")
	@ManyToOne
	private Anneescolaire codeA;
	@JoinColumn(name="codeF")
	@ManyToOne
	private Filiere codeF;
	@JoinColumn(name="codeN")
	@ManyToOne
	private Niveau codeN;
	private String codeNu;
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
	public Date getDateI() {
		return dateI;
	}
	public void setDateI(Date dateI) {
		this.dateI = dateI;
	}
	public Anneescolaire getCodeA() {
		return codeA;
	}
	public void setCodeA(Anneescolaire codeA) {
		this.codeA = codeA;
	}
	public Filiere getCodeF() {
		return codeF;
	}
	public void setCodeF(Filiere codeF) {
		this.codeF = codeF;
	}
	public Niveau getCodeN() {
		return codeN;
	}
	public void setCodeN(Niveau codeN) {
		this.codeN = codeN;
	}
	public String getCodeNu() {
		return codeNu;
	}
	public void setCodeNu(String codeNu) {
		this.codeNu = codeNu;
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
	public Inscription(Long idI, Date dateI, Anneescolaire codeA, Filiere codeF, Niveau codeN, String codeNu,
			String matriculeE, Date dateCreation, String codeUCrea, Date dateMAJ, String codeUMAJ, Date dateSuppr,
			String codeUSuppr) {
		super();
		this.idI = idI;
		this.dateI = dateI;
		this.codeA = codeA;
		this.codeF = codeF;
		this.codeN = codeN;
		this.codeNu = codeNu;
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
		return "Inscription [idI=" + idI + ", dateI=" + dateI + ", codeA=" + codeA + ", codeF=" + codeF + ", codeN="
				+ codeN + ", codeNu=" + codeNu + ", matriculeE=" + matriculeE + ", dateCreation=" + dateCreation
				+ ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr="
				+ dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
	
	
}
