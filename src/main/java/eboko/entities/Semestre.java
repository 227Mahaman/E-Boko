package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Semestre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_S;
	private String Code_S;
	@JoinColumn(name="Code_N")
	@ManyToOne
	private String Code_N;
	private String Intitule_S;
	 // `Choix_S` tinyint(1) DEFAULT '0',
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	 // `IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	public Long getId_S() {
		return Id_S;
	}
	public void setId_S(Long id_S) {
		Id_S = id_S;
	}
	public String getCode_S() {
		return Code_S;
	}
	public void setCode_S(String code_S) {
		Code_S = code_S;
	}
	public String getCode_N() {
		return Code_N;
	}
	public void setCode_N(String code_N) {
		Code_N = code_N;
	}
	public String getIntitule_S() {
		return Intitule_S;
	}
	public void setIntitule_S(String intitule_S) {
		Intitule_S = intitule_S;
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
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semestre(Long id_S, String code_S, String code_N, String intitule_S, Date dateCreation, String code_UCrea,
			Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_S = id_S;
		Code_S = code_S;
		Code_N = code_N;
		Intitule_S = intitule_S;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	@Override
	public String toString() {
		return "Semestre [Id_S=" + Id_S + ", Code_S=" + Code_S + ", Code_N=" + Code_N + ", Intitule_S=" + Intitule_S
				+ ", DateCreation=" + DateCreation + ", Code_UCrea=" + Code_UCrea + ", DateMAJ=" + DateMAJ
				+ ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr + ", Code_USuppr=" + Code_USuppr + "]";
	}
	
	
}
