package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Sa;
	private String Code_Sa;
	private String Intitule_Sa;
	private String Description_Sa;
	private String Capacite_Sa;
	//`Choix_Sa` tinyint(1) DEFAULT '0',
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	public Long getId_Sa() {
		return Id_Sa;
	}
	public void setId_Sa(Long id_Sa) {
		Id_Sa = id_Sa;
	}
	public String getCode_Sa() {
		return Code_Sa;
	}
	public void setCode_Sa(String code_Sa) {
		Code_Sa = code_Sa;
	}
	public String getIntitule_Sa() {
		return Intitule_Sa;
	}
	public void setIntitule_Sa(String intitule_Sa) {
		Intitule_Sa = intitule_Sa;
	}
	public String getDescription_Sa() {
		return Description_Sa;
	}
	public void setDescription_Sa(String description_Sa) {
		Description_Sa = description_Sa;
	}
	public String getCapacite_Sa() {
		return Capacite_Sa;
	}
	public void setCapacite_Sa(String capacite_Sa) {
		Capacite_Sa = capacite_Sa;
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
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Salle(Long id_Sa, String code_Sa, String intitule_Sa, String description_Sa, String capacite_Sa,
			Date dateCreation, String code_UCrea, Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_Sa = id_Sa;
		Code_Sa = code_Sa;
		Intitule_Sa = intitule_Sa;
		Description_Sa = description_Sa;
		Capacite_Sa = capacite_Sa;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	
	@Override
	public String toString() {
		return "Salle [Id_Sa=" + Id_Sa + ", Code_Sa=" + Code_Sa + ", Intitule_Sa=" + Intitule_Sa + ", Description_Sa="
				+ Description_Sa + ", Capacite_Sa=" + Capacite_Sa + ", DateCreation=" + DateCreation + ", Code_UCrea="
				+ Code_UCrea + ", DateMAJ=" + DateMAJ + ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr
				+ ", Code_USuppr=" + Code_USuppr + "]";
	}
	
	
}
