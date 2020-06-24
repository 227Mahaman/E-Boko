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
	private Long Id_Mo;
	private String Code_Mo;
	private String Credit_Mo;
	@JoinColumn(name="Code_A")
	@ManyToOne
	private String Code_A;
	@JoinColumn(name="Code_F")
	@ManyToOne
	private String Code_F;
	@JoinColumn(name="Code_N")
	@ManyToOne
	private String Code_N;
	@JoinColumn(name="Code_UE")
	@ManyToOne
	private String Code_UE;
	private String Code_M;
	@JoinColumn(name="Code_S")
	@ManyToOne
	private String Code_S;
	private String Choix_Mo;
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//`IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	//`IsObliged_Mo` tinyint(1) DEFAULT '0',
	public Long getId_Mo() {
		return Id_Mo;
	}
	public void setId_Mo(Long id_Mo) {
		Id_Mo = id_Mo;
	}
	public String getCode_Mo() {
		return Code_Mo;
	}
	public void setCode_Mo(String code_Mo) {
		Code_Mo = code_Mo;
	}
	public String getCredit_Mo() {
		return Credit_Mo;
	}
	public void setCredit_Mo(String credit_Mo) {
		Credit_Mo = credit_Mo;
	}
	public String getCode_A() {
		return Code_A;
	}
	public void setCode_A(String code_A) {
		Code_A = code_A;
	}
	public String getCode_F() {
		return Code_F;
	}
	public void setCode_F(String code_F) {
		Code_F = code_F;
	}
	public String getCode_N() {
		return Code_N;
	}
	public void setCode_N(String code_N) {
		Code_N = code_N;
	}
	public String getCode_UE() {
		return Code_UE;
	}
	public void setCode_UE(String code_UE) {
		Code_UE = code_UE;
	}
	public String getCode_M() {
		return Code_M;
	}
	public void setCode_M(String code_M) {
		Code_M = code_M;
	}
	public String getCode_S() {
		return Code_S;
	}
	public void setCode_S(String code_S) {
		Code_S = code_S;
	}
	public String getChoix_Mo() {
		return Choix_Mo;
	}
	public void setChoix_Mo(String choix_Mo) {
		Choix_Mo = choix_Mo;
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
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Module(Long id_Mo, String code_Mo, String credit_Mo, String code_A, String code_F, String code_N,
			String code_UE, String code_M, String code_S, String choix_Mo, Date dateCreation, String code_UCrea,
			Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr) {
		super();
		Id_Mo = id_Mo;
		Code_Mo = code_Mo;
		Credit_Mo = credit_Mo;
		Code_A = code_A;
		Code_F = code_F;
		Code_N = code_N;
		Code_UE = code_UE;
		Code_M = code_M;
		Code_S = code_S;
		Choix_Mo = choix_Mo;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
	}
	
	@Override
	public String toString() {
		return "Module [Id_Mo=" + Id_Mo + ", Code_Mo=" + Code_Mo + ", Credit_Mo=" + Credit_Mo + ", Code_A=" + Code_A
				+ ", Code_F=" + Code_F + ", Code_N=" + Code_N + ", Code_UE=" + Code_UE + ", Code_M=" + Code_M
				+ ", Code_S=" + Code_S + ", Choix_Mo=" + Choix_Mo + ", DateCreation=" + DateCreation + ", Code_UCrea="
				+ Code_UCrea + ", DateMAJ=" + DateMAJ + ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr=" + DateSuppr
				+ ", Code_USuppr=" + Code_USuppr + "]";
	}
	
	
}
