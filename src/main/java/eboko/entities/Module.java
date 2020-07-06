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
	@JoinColumn(name="idA")
	@ManyToOne
	private Anneescolaire idA;
	@JoinColumn(name="idF")
	@ManyToOne
	private Filiere idF;
	@JoinColumn(name="idN")
	@ManyToOne
	private Niveau idN;
	@JoinColumn(name="idUe")
	@ManyToOne
	private Ue idUe;
	private String idM;
	@JoinColumn(name="idS")
	@ManyToOne
	private Semestre idS;
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
	public Ue getIdUe() {
		return idUe;
	}
	public void setIdUe(Ue idUe) {
		this.idUe = idUe;
	}
	public String getIdM() {
		return idM;
	}
	public void setIdM(String idM) {
		this.idM = idM;
	}
	public Semestre getIdS() {
		return idS;
	}
	public void setIdS(Semestre idS) {
		this.idS = idS;
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
	public Module(Long idMo, String codeMo, String creditMo, Anneescolaire idA, Filiere idF, Niveau idN, Ue idUe,
			String idM, Semestre idS, String choixMo, Date dateCreation, String codeUCrea, Date dateMAJ,
			String codeUMAJ, Date dateSuppr, String codeUSuppr) {
		super();
		this.idMo = idMo;
		this.codeMo = codeMo;
		this.creditMo = creditMo;
		this.idA = idA;
		this.idF = idF;
		this.idN = idN;
		this.idUe = idUe;
		this.idM = idM;
		this.idS = idS;
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
		return "Module [idMo=" + idMo + ", codeMo=" + codeMo + ", creditMo=" + creditMo + ", idA=" + idA + ", idF="
				+ idF + ", idN=" + idN + ", idUe=" + idUe + ", idM=" + idM + ", idS=" + idS + ", choixMo=" + choixMo
				+ ", dateCreation=" + dateCreation + ", codeUCrea=" + codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ="
				+ codeUMAJ + ", dateSuppr=" + dateSuppr + ", codeUSuppr=" + codeUSuppr + "]";
	}
	
	
}
