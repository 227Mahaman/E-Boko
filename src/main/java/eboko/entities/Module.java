package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Module {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMo;
	private String codeMo;
	private String creditMo;
	@JoinColumn(name="codeA")
	@ManyToOne
	private Anneescolaire codeA;
	@JoinColumn(name="codeF")
	@ManyToOne
	private Filiere codeF;
	@JoinColumn(name="codeN")
	@ManyToOne
	private Niveau codeN;
	@JoinColumn(name="codeUe")
	@ManyToOne
	private Ue codeUe;
	private String codeM;
	@JoinColumn(name="codeS")
	@ManyToOne
	private Semestre codeS;
	private String choixMo;
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	private String codeUSuppr;
	//`IsObliged_Mo` tinyint(1) DEFAULT '0',
	public Long getIdMo() {
		return idMo;
	}
	public void setIdMo(Long idMo) {
		this.idMo = idMo;
	}
	public String getCodeMo() {
		return codeMo;
	}
	public void setCodeMo(String codeMo) {
		this.codeMo = codeMo;
	}
	public String getCreditMo() {
		return creditMo;
	}
	public void setCreditMo(String creditMo) {
		this.creditMo = creditMo;
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
	public Ue getCodeUe() {
		return codeUe;
	}
	public void setCodeUe(Ue codeUe) {
		this.codeUe = codeUe;
	}
	public void setCodeS(Semestre codeS) {
		this.codeS = codeS;
	}
	public String getCodeM() {
		return codeM;
	}
	public void setCodeM(String codeM) {
		this.codeM = codeM;
	}
	
	public Semestre getCodeS() {
		return codeS;
	}
	public String getChoixMo() {
		return choixMo;
	}
	public void setChoixMo(String choixMo) {
		this.choixMo = choixMo;
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
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Module(Long idMo, String codeMo, String creditMo, Anneescolaire codeA, Filiere codeF, Niveau codeN,
			Ue codeUe, String codeM, Semestre codeS, String choixMo, Date dateCreation, String codeUCrea, Date dateMAJ,
			String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idMo = idMo;
		this.codeMo = codeMo;
		this.creditMo = creditMo;
		this.codeA = codeA;
		this.codeF = codeF;
		this.codeN = codeN;
		this.codeUe = codeUe;
		this.codeM = codeM;
		this.codeS = codeS;
		this.choixMo = choixMo;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
		this.codeUSuppr = codeUSuppr;
	}
	@Override
	public String toString() {
		return "Module [idMo=" + idMo + ", codeMo=" + codeMo + ", creditMo=" + creditMo + ", codeA=" + codeA
				+ ", codeF=" + codeF + ", codeN=" + codeN + ", codeUe=" + codeUe + ", codeM=" + codeM + ", codeS="
				+ codeS + ", choixMo=" + choixMo + ", dateCreation=" + dateCreation + ", codeUCrea=" + codeUCrea
				+ ", dateMAJ=" + dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr=" + dateSuppr + ", codeUSuppr="
				+ codeUSuppr + "]";
	}
	
}
