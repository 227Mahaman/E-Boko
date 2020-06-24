package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_F;
	private String Code_F;
	private String Intitule_F;
	private String Description_F;
	//`Choix_F` tinyint(1) DEFAULT '0',
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	public Long getId_F() {
		return Id_F;
	}
	public void setId_F(Long id_F) {
		Id_F = id_F;
	}
	public String getCode_F() {
		return Code_F;
	}
	public void setCode_F(String code_F) {
		Code_F = code_F;
	}
	public String getIntitule_F() {
		return Intitule_F;
	}
	public void setIntitule_F(String intitule_F) {
		Intitule_F = intitule_F;
	}
	public String getDescription_F() {
		return Description_F;
	}
	public void setDescription_F(String description_F) {
		Description_F = description_F;
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
	
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Filiere(Long id_F, String code_F, String intitule_F, String description_F, Date dateCreation,
			String code_UCrea, Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_F = id_F;
		Code_F = code_F;
		Intitule_F = intitule_F;
		Description_F = description_F;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	
	@Override
	public String toString() {
		return "Filiere [Id_F=" + Id_F + ", Code_F=" + Code_F + ", Intitule_F=" + Intitule_F + ", Description_F="
				+ Description_F + ", DateCreation=" + DateCreation + ", Code_UCrea=" + Code_UCrea + ", DateMAJ="
				+ DateMAJ + ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr + ", Code_USuppr=" + Code_USuppr
				+ "]";
	}

	
}
