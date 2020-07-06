package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Devoir {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idD;
	private String codeD;
	private String codeNu;
	private Date dateD;
	private String sessionD;
	private String typeD;
	private String coefD;
	//IsRemi_D` tinyint(1) DEFAULT '0',
	private Date dateRemiseD;
	@JoinColumn(name="idMo")
	@ManyToOne
	private Module idMo;
	private String matriculePr;
	private String nbHeureD;
	private String heureDebutD;
	private String periodeD;
	//Choix_D` tinyint(1) DEFAULT '0',
	//IsAccepter_D` tinyint(1) DEFAULT '0',
	private Date dateAccepterD;
	private String codeUAccepterD;
	//IsValider_D` tinyint(1) DEFAULT '0',
	private Date dateValiderD;
	private String codeUValiderD;
	private Date dateAnnulerD;
	private String codeUAnnulerD;
	private Date dateCreation;
	private String codeUCrea;
	private Date dateMAJ;
	private String codeUMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date dateSuppr;
	public Long getIdD() {
		return idD;
	}
	public void setIdD(Long idD) {
		this.idD = idD;
	}
	public String getCodeD() {
		return codeD;
	}
	public void setCodeD(String codeD) {
		this.codeD = codeD;
	}
	public String getCodeNu() {
		return codeNu;
	}
	public void setCodeNu(String codeNu) {
		this.codeNu = codeNu;
	}
	public Date getDateD() {
		return dateD;
	}
	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}
	public String getSessionD() {
		return sessionD;
	}
	public void setSessionD(String sessionD) {
		this.sessionD = sessionD;
	}
	public String getTypeD() {
		return typeD;
	}
	public void setTypeD(String typeD) {
		this.typeD = typeD;
	}
	public String getCoefD() {
		return coefD;
	}
	public void setCoefD(String coefD) {
		this.coefD = coefD;
	}
	public Date getDateRemiseD() {
		return dateRemiseD;
	}
	public void setDateRemiseD(Date dateRemiseD) {
		this.dateRemiseD = dateRemiseD;
	}
	
	public Module getIdMo() {
		return idMo;
	}
	public void setIdMo(Module idMo) {
		this.idMo = idMo;
	}
	public String getMatriculePr() {
		return matriculePr;
	}
	public void setMatriculePr(String matriculePr) {
		this.matriculePr = matriculePr;
	}
	public String getNbHeureD() {
		return nbHeureD;
	}
	public void setNbHeureD(String nbHeureD) {
		this.nbHeureD = nbHeureD;
	}
	public String getHeureDebutD() {
		return heureDebutD;
	}
	public void setHeureDebutD(String heureDebutD) {
		this.heureDebutD = heureDebutD;
	}
	public String getPeriodeD() {
		return periodeD;
	}
	public void setPeriodeD(String periodeD) {
		this.periodeD = periodeD;
	}
	public Date getDateAccepterD() {
		return dateAccepterD;
	}
	public void setDateAccepterD(Date dateAccepterD) {
		this.dateAccepterD = dateAccepterD;
	}
	public String getCodeUAccepterD() {
		return codeUAccepterD;
	}
	public void setCodeUAccepterD(String codeUAccepterD) {
		this.codeUAccepterD = codeUAccepterD;
	}
	public Date getDateValiderD() {
		return dateValiderD;
	}
	public void setDateValiderD(Date dateValiderD) {
		this.dateValiderD = dateValiderD;
	}
	public String getCodeUValiderD() {
		return codeUValiderD;
	}
	public void setCodeUValiderD(String codeUValiderD) {
		this.codeUValiderD = codeUValiderD;
	}
	public Date getDateAnnulerD() {
		return dateAnnulerD;
	}
	public void setDateAnnulerD(Date dateAnnulerD) {
		this.dateAnnulerD = dateAnnulerD;
	}
	public String getCodeUAnnulerD() {
		return codeUAnnulerD;
	}
	public void setCodeUAnnulerD(String codeUAnnulerD) {
		this.codeUAnnulerD = codeUAnnulerD;
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
	public Devoir() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devoir(Long idD, String codeD, String codeNu, Date dateD, String sessionD, String typeD, String coefD,
			Date dateRemiseD, Module idMo, String matriculePr, String nbHeureD, String heureDebutD, String periodeD,
			Date dateAccepterD, String codeUAccepterD, Date dateValiderD, String codeUValiderD, Date dateAnnulerD,
			String codeUAnnulerD, Date dateCreation, String codeUCrea, Date dateMAJ, String codeUMAJ, Date dateSuppr) {
		super();
		this.idD = idD;
		this.codeD = codeD;
		this.codeNu = codeNu;
		this.dateD = dateD;
		this.sessionD = sessionD;
		this.typeD = typeD;
		this.coefD = coefD;
		this.dateRemiseD = dateRemiseD;
		this.idMo = idMo;
		this.matriculePr = matriculePr;
		this.nbHeureD = nbHeureD;
		this.heureDebutD = heureDebutD;
		this.periodeD = periodeD;
		this.dateAccepterD = dateAccepterD;
		this.codeUAccepterD = codeUAccepterD;
		this.dateValiderD = dateValiderD;
		this.codeUValiderD = codeUValiderD;
		this.dateAnnulerD = dateAnnulerD;
		this.codeUAnnulerD = codeUAnnulerD;
		this.dateCreation = dateCreation;
		this.codeUCrea = codeUCrea;
		this.dateMAJ = dateMAJ;
		this.codeUMAJ = codeUMAJ;
		this.dateSuppr = dateSuppr;
	}
	@Override
	public String toString() {
		return "Devoir [idD=" + idD + ", codeD=" + codeD + ", codeNu=" + codeNu + ", dateD=" + dateD + ", sessionD="
				+ sessionD + ", typeD=" + typeD + ", coefD=" + coefD + ", dateRemiseD=" + dateRemiseD + ", idMo=" + idMo
				+ ", matriculePr=" + matriculePr + ", nbHeureD=" + nbHeureD + ", heureDebutD=" + heureDebutD
				+ ", periodeD=" + periodeD + ", dateAccepterD=" + dateAccepterD + ", codeUAccepterD=" + codeUAccepterD
				+ ", dateValiderD=" + dateValiderD + ", codeUValiderD=" + codeUValiderD + ", dateAnnulerD="
				+ dateAnnulerD + ", codeUAnnulerD=" + codeUAnnulerD + ", dateCreation=" + dateCreation + ", codeUCrea="
				+ codeUCrea + ", dateMAJ=" + dateMAJ + ", codeUMAJ=" + codeUMAJ + ", dateSuppr=" + dateSuppr + "]";
	}
	
	
	
}
