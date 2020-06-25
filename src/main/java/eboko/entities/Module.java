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
	//@JoinColumn(name="Code_A")
	//@ManyToOne
	private String codeA;
	//@JoinColumn(name="Code_F")
	//@ManyToOne
	private String codeF;
	//@JoinColumn(name="Code_N")
	//@ManyToOne
	private String codeN;
	//@JoinColumn(name="Code_UE")
	//@ManyToOne
	private String codeUe;
	private String codeM;
	//@JoinColumn(name="Code_S")
	//@ManyToOne
	private String codeS;
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
	public String getCodeA() {
		return codeA;
	}
	public void setCodeA(String codeA) {
		this.codeA = codeA;
	}
	public String getCodeF() {
		return codeF;
	}
	public void setCodeF(String codeF) {
		this.codeF = codeF;
	}
	public String getCodeN() {
		return codeN;
	}
	public void setCodeN(String codeN) {
		this.codeN = codeN;
	}
	
	public String getCodeUe() {
		return codeUe;
	}
	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
	}
	public String getCodeM() {
		return codeM;
	}
	public void setCodeM(String codeM) {
		this.codeM = codeM;
	}
	public String getCodeS() {
		return codeS;
	}
	public void setCodeS(String codeS) {
		this.codeS = codeS;
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
	public Module(Long idMo, String codeMo, String creditMo, String codeA, String codeF, String codeN, String codeUe,
			String codeM, String codeS, String choixMo, Date dateCreation, String codeUCrea, Date dateMAJ,
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
