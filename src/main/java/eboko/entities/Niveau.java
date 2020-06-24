package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Niveau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_N;
	private String Code_N;
  	private String Intitule_N;
  	private String MontantScolarite_N;
  	//`Choix_N` tinyint(1) DEFAULT '0',
 	private Date DateCreation;
  	private String Code_UCrea;
  	private Date DateMAJ;
  	private String Code_UMAJ;
  	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
  	private String Code_USuppr;
	public Long getId_N() {
		return Id_N;
	}
	public void setId_N(Long id_N) {
		Id_N = id_N;
	}
	public String getCode_N() {
		return Code_N;
	}
	public void setCode_N(String code_N) {
		Code_N = code_N;
	}
	public String getIntitule_N() {
		return Intitule_N;
	}
	public void setIntitule_N(String intitule_N) {
		Intitule_N = intitule_N;
	}
	public String getMontantScolarite_N() {
		return MontantScolarite_N;
	}
	public void setMontantScolarite_N(String montantScolarite_N) {
		MontantScolarite_N = montantScolarite_N;
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
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Niveau(Long id_N, String code_N, String intitule_N, String montantScolarite_N, Date dateCreation,
			String code_UCrea, Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_N = id_N;
		Code_N = code_N;
		Intitule_N = intitule_N;
		MontantScolarite_N = montantScolarite_N;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	@Override
	public String toString() {
		return "Niveau [Id_N=" + Id_N + ", Code_N=" + Code_N + ", Intitule_N=" + Intitule_N + ", MontantScolarite_N="
				+ MontantScolarite_N + ", DateCreation=" + DateCreation + ", Code_UCrea=" + Code_UCrea + ", DateMAJ="
				+ DateMAJ + ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr + ", Code_USuppr=" + Code_USuppr
				+ "]";
	}
  	
}
