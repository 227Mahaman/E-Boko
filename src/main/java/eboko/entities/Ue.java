package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_UE;
	private String Code_UE;
	private String Intitule_UE;
	//Choix_UE` tinyint(1) DEFAULT '0',
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	private String CodePerso_UE;
	public Long getId_UE() {
		return Id_UE;
	}
	public void setId_UE(Long id_UE) {
		Id_UE = id_UE;
	}
	public String getCode_UE() {
		return Code_UE;
	}
	public void setCode_UE(String code_UE) {
		Code_UE = code_UE;
	}
	public String getIntitule_UE() {
		return Intitule_UE;
	}
	public void setIntitule_UE(String intitule_UE) {
		Intitule_UE = intitule_UE;
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
	public String getCodePerso_UE() {
		return CodePerso_UE;
	}
	public void setCodePerso_UE(String codePerso_UE) {
		CodePerso_UE = codePerso_UE;
	}
	
	public Ue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ue(Long id_UE, String code_UE, String intitule_UE, Date dateCreation, String code_UCrea, Date dateMAJ,
			String code_UMAJ, Date dateSuppr, String code_USuppr, String codePerso_UE) {
		super();
		Id_UE = id_UE;
		Code_UE = code_UE;
		Intitule_UE = intitule_UE;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
		CodePerso_UE = codePerso_UE;
	}
	
	@Override
	public String toString() {
		return "Ue [Id_UE=" + Id_UE + ", Code_UE=" + Code_UE + ", Intitule_UE=" + Intitule_UE + ", DateCreation="
				+ DateCreation + ", Code_UCrea=" + Code_UCrea + ", DateMAJ=" + DateMAJ + ", Code_UMAJ=" + Code_UMAJ
				+ ", DateSuppr=" + DateSuppr + ", Code_USuppr=" + Code_USuppr + ", CodePerso_UE=" + CodePerso_UE + "]";
	}
	
	
}
