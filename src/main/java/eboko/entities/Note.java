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
	private Long Id_No;
	private String Code_No;
	private String Valeur_No;
	@JoinColumn(name="Code_D")
	@ManyToOne
	private String Code_D;
	@JoinColumn(name="Matricule_E")
	@ManyToOne
	private String Matricule_E;
	//Choix_No` tinyint(1) DEFAULT '0',
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	public Long getId_No() {
		return Id_No;
	}
	public void setId_No(Long id_No) {
		Id_No = id_No;
	}
	public String getCode_No() {
		return Code_No;
	}
	public void setCode_No(String code_No) {
		Code_No = code_No;
	}
	public String getValeur_No() {
		return Valeur_No;
	}
	public void setValeur_No(String valeur_No) {
		Valeur_No = valeur_No;
	}
	public String getCode_D() {
		return Code_D;
	}
	public void setCode_D(String code_D) {
		Code_D = code_D;
	}
	public String getMatricule_E() {
		return Matricule_E;
	}
	public void setMatricule_E(String matricule_E) {
		Matricule_E = matricule_E;
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
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(Long id_No, String code_No, String valeur_No, String code_D, String matricule_E, Date dateCreation,
			String code_UCrea, Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_No = id_No;
		Code_No = code_No;
		Valeur_No = valeur_No;
		Code_D = code_D;
		Matricule_E = matricule_E;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	@Override
	public String toString() {
		return "Note [Id_No=" + Id_No + ", Code_No=" + Code_No + ", Valeur_No=" + Valeur_No + ", Code_D=" + Code_D
				+ ", Matricule_E=" + Matricule_E + ", DateCreation=" + DateCreation + ", Code_UCrea=" + Code_UCrea
				+ ", DateMAJ=" + DateMAJ + ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr + ", Code_USuppr="
				+ Code_USuppr + "]";
	}

	
}
