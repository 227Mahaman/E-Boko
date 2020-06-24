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
	private Long Id_D;
	private String Code_D;
	private String Code_Nu;
	private Date Date_D;
	private String Session_D;
	private String Type_D;
	private String Coef_D;
	//IsRemi_D` tinyint(1) DEFAULT '0',
	private Date DateRemise_D;
	@JoinColumn(name="Code_Mo")
	@ManyToOne
	private String Code_Mo;
	private String Matricule_Pr;
	private String NbHeure_D;
	private String HeureDebut_D;
	private String Periode_D;
	//Choix_D` tinyint(1) DEFAULT '0',
	//IsAccepter_D` tinyint(1) DEFAULT '0',
	private Date DateAccepter_D;
	private String Code_UAccepter_D;
	//IsValider_D` tinyint(1) DEFAULT '0',
	private Date DateValider_D;
	private String Code_UValider_D;
	private Date DateAnnuler_D;
	private String Code_UAnnuler_D;
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	public Long getId_D() {
		return Id_D;
	}
	public void setId_D(Long id_D) {
		Id_D = id_D;
	}
	public String getCode_D() {
		return Code_D;
	}
	public void setCode_D(String code_D) {
		Code_D = code_D;
	}
	public String getCode_Nu() {
		return Code_Nu;
	}
	public void setCode_Nu(String code_Nu) {
		Code_Nu = code_Nu;
	}
	public Date getDate_D() {
		return Date_D;
	}
	public void setDate_D(Date date_D) {
		Date_D = date_D;
	}
	public String getSession_D() {
		return Session_D;
	}
	public void setSession_D(String session_D) {
		Session_D = session_D;
	}
	public String getType_D() {
		return Type_D;
	}
	public void setType_D(String type_D) {
		Type_D = type_D;
	}
	public String getCoef_D() {
		return Coef_D;
	}
	public void setCoef_D(String coef_D) {
		Coef_D = coef_D;
	}
	public Date getDateRemise_D() {
		return DateRemise_D;
	}
	public void setDateRemise_D(Date dateRemise_D) {
		DateRemise_D = dateRemise_D;
	}
	public String getCode_Mo() {
		return Code_Mo;
	}
	public void setCode_Mo(String code_Mo) {
		Code_Mo = code_Mo;
	}
	public String getMatricule_Pr() {
		return Matricule_Pr;
	}
	public void setMatricule_Pr(String matricule_Pr) {
		Matricule_Pr = matricule_Pr;
	}
	public String getNbHeure_D() {
		return NbHeure_D;
	}
	public void setNbHeure_D(String nbHeure_D) {
		NbHeure_D = nbHeure_D;
	}
	public String getHeureDebut_D() {
		return HeureDebut_D;
	}
	public void setHeureDebut_D(String heureDebut_D) {
		HeureDebut_D = heureDebut_D;
	}
	public String getPeriode_D() {
		return Periode_D;
	}
	public void setPeriode_D(String periode_D) {
		Periode_D = periode_D;
	}
	public Date getDateAccepter_D() {
		return DateAccepter_D;
	}
	public void setDateAccepter_D(Date dateAccepter_D) {
		DateAccepter_D = dateAccepter_D;
	}
	public String getCode_UAccepter_D() {
		return Code_UAccepter_D;
	}
	public void setCode_UAccepter_D(String code_UAccepter_D) {
		Code_UAccepter_D = code_UAccepter_D;
	}
	public Date getDateValider_D() {
		return DateValider_D;
	}
	public void setDateValider_D(Date dateValider_D) {
		DateValider_D = dateValider_D;
	}
	public String getCode_UValider_D() {
		return Code_UValider_D;
	}
	public void setCode_UValider_D(String code_UValider_D) {
		Code_UValider_D = code_UValider_D;
	}
	public Date getDateAnnuler_D() {
		return DateAnnuler_D;
	}
	public void setDateAnnuler_D(Date dateAnnuler_D) {
		DateAnnuler_D = dateAnnuler_D;
	}
	public String getCode_UAnnuler_D() {
		return Code_UAnnuler_D;
	}
	public void setCode_UAnnuler_D(String code_UAnnuler_D) {
		Code_UAnnuler_D = code_UAnnuler_D;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public String getCode_UCrea() {
		return Code_UCrea;
	}
	public void setCode_UCrea(String code_UCrea) {
		Code_UCrea = code_UCrea;
	}
	public Date getDateMAJ() {
		return DateMAJ;
	}
	public void setDateMAJ(Date dateMAJ) {
		DateMAJ = dateMAJ;
	}
	public String getCode_UMAJ() {
		return Code_UMAJ;
	}
	public void setCode_UMAJ(String code_UMAJ) {
		Code_UMAJ = code_UMAJ;
	}
	public Date getDateSuppr() {
		return DateSuppr;
	}
	public void setDateSuppr(Date dateSuppr) {
		DateSuppr = dateSuppr;
	}
	public String getCode_USuppr() {
		return Code_USuppr;
	}
	public void setCode_USuppr(String code_USuppr) {
		Code_USuppr = code_USuppr;
	}
	
	public Devoir(Long id_D, String code_D, String code_Nu, Date date_D, String session_D, String type_D, String coef_D,
			Date dateRemise_D, String code_Mo, String matricule_Pr, String nbHeure_D, String heureDebut_D,
			String periode_D, Date dateAccepter_D, String code_UAccepter_D, Date dateValider_D, String code_UValider_D,
			Date dateAnnuler_D, String code_UAnnuler_D, Date dateCreation, String code_UCrea, Date dateMAJ,
			String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_D = id_D;
		Code_D = code_D;
		Code_Nu = code_Nu;
		Date_D = date_D;
		Session_D = session_D;
		Type_D = type_D;
		Coef_D = coef_D;
		DateRemise_D = dateRemise_D;
		Code_Mo = code_Mo;
		Matricule_Pr = matricule_Pr;
		NbHeure_D = nbHeure_D;
		HeureDebut_D = heureDebut_D;
		Periode_D = periode_D;
		DateAccepter_D = dateAccepter_D;
		Code_UAccepter_D = code_UAccepter_D;
		DateValider_D = dateValider_D;
		Code_UValider_D = code_UValider_D;
		DateAnnuler_D = dateAnnuler_D;
		Code_UAnnuler_D = code_UAnnuler_D;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	
	@Override
	public String toString() {
		return "Devoir [Id_D=" + Id_D + ", Code_D=" + Code_D + ", Code_Nu=" + Code_Nu + ", Date_D=" + Date_D
				+ ", Session_D=" + Session_D + ", Type_D=" + Type_D + ", Coef_D=" + Coef_D + ", DateRemise_D="
				+ DateRemise_D + ", Code_Mo=" + Code_Mo + ", Matricule_Pr=" + Matricule_Pr + ", NbHeure_D=" + NbHeure_D
				+ ", HeureDebut_D=" + HeureDebut_D + ", Periode_D=" + Periode_D + ", DateAccepter_D=" + DateAccepter_D
				+ ", Code_UAccepter_D=" + Code_UAccepter_D + ", DateValider_D=" + DateValider_D + ", Code_UValider_D="
				+ Code_UValider_D + ", DateAnnuler_D=" + DateAnnuler_D + ", Code_UAnnuler_D=" + Code_UAnnuler_D
				+ ", DateCreation=" + DateCreation + ", Code_UCrea=" + Code_UCrea + ", DateMAJ=" + DateMAJ
				+ ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr + ", Code_USuppr=" + Code_USuppr + "]";
	}
	
	
}
