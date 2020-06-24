package eboko.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_E;
	private String Matricule_E;
	private String Nom_E;
	private String Prenom_E;
	private Date DateN_E;
	private String LieuN_E;
	private String AdressePerso_E;
	private String AdressePro_E;
	private String Email_E;
	private String Sex_E;
	private String Nationalite_E;
	private String Mobile_E;
	private String NomSC_E;
	private String TelSC_E;
	private String FonctionSC_E;
	private String ServiceSC_E;
	//IsCarted_E tinyint(1) DEFAULT '0';
	//IsCaptured_E tinyint(1) DEFAULT '0';
	//Choix_E tinyint(1) DEFAULT '0'
	private Date DateCreation;
	private String Code_UCrea;
	private Date DateMAJ;
	private String Code_UMAJ;
	//IsSuppr` tinyint(1) DEFAULT '0',
	private Date DateSuppr;
	private String Code_USuppr;
	private String MatriculePerso_E;
	//Photo_E varchar(100) DEFAULT NULL,
	private String Dossier_E;
	public Long getId_E() {
		return Id_E;
	}
	public void setId_E(Long id_E) {
		Id_E = id_E;
	}
	public String getMatricule_E() {
		return Matricule_E;
	}
	public void setMatricule_E(String matricule_E) {
		Matricule_E = matricule_E;
	}
	public String getNom_E() {
		return Nom_E;
	}
	public void setNom_E(String nom_E) {
		Nom_E = nom_E;
	}
	public String getPrenom_E() {
		return Prenom_E;
	}
	public void setPrenom_E(String prenom_E) {
		Prenom_E = prenom_E;
	}
	public Date getDateN_E() {
		return DateN_E;
	}
	public void setDateN_E(Date dateN_E) {
		DateN_E = dateN_E;
	}
	public String getLieuN_E() {
		return LieuN_E;
	}
	public void setLieuN_E(String lieuN_E) {
		LieuN_E = lieuN_E;
	}
	public String getAdressePerso_E() {
		return AdressePerso_E;
	}
	public void setAdressePerso_E(String adressePerso_E) {
		AdressePerso_E = adressePerso_E;
	}
	public String getAdressePro_E() {
		return AdressePro_E;
	}
	public void setAdressePro_E(String adressePro_E) {
		AdressePro_E = adressePro_E;
	}
	public String getEmail_E() {
		return Email_E;
	}
	public void setEmail_E(String email_E) {
		Email_E = email_E;
	}
	public String getSex_E() {
		return Sex_E;
	}
	public void setSex_E(String sex_E) {
		Sex_E = sex_E;
	}
	public String getNationalite_E() {
		return Nationalite_E;
	}
	public void setNationalite_E(String nationalite_E) {
		Nationalite_E = nationalite_E;
	}
	public String getMobile_E() {
		return Mobile_E;
	}
	public void setMobile_E(String mobile_E) {
		Mobile_E = mobile_E;
	}
	public String getNomSC_E() {
		return NomSC_E;
	}
	public void setNomSC_E(String nomSC_E) {
		NomSC_E = nomSC_E;
	}
	public String getTelSC_E() {
		return TelSC_E;
	}
	public void setTelSC_E(String telSC_E) {
		TelSC_E = telSC_E;
	}
	public String getFonctionSC_E() {
		return FonctionSC_E;
	}
	public void setFonctionSC_E(String fonctionSC_E) {
		FonctionSC_E = fonctionSC_E;
	}
	public String getServiceSC_E() {
		return ServiceSC_E;
	}
	public void setServiceSC_E(String serviceSC_E) {
		ServiceSC_E = serviceSC_E;
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
	public String getMatriculePerso_E() {
		return MatriculePerso_E;
	}
	public void setMatriculePerso_E(String matriculePerso_E) {
		MatriculePerso_E = matriculePerso_E;
	}
	public String getDossier_E() {
		return Dossier_E;
	}
	public void setDossier_E(String dossier_E) {
		Dossier_E = dossier_E;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(Long id_E, String matricule_E, String nom_E, String prenom_E, Date dateN_E, String lieuN_E,
			String adressePerso_E, String adressePro_E, String email_E, String sex_E, String nationalite_E,
			String mobile_E, String nomSC_E, String telSC_E, String fonctionSC_E, String serviceSC_E, Date dateCreation,
			String code_UCrea, Date dateMAJ, String code_UMAJ, Date dateSuppr, String code_USuppr,
			String matriculePerso_E, String dossier_E) {
		super();
		Id_E = id_E;
		Matricule_E = matricule_E;
		Nom_E = nom_E;
		Prenom_E = prenom_E;
		DateN_E = dateN_E;
		LieuN_E = lieuN_E;
		AdressePerso_E = adressePerso_E;
		AdressePro_E = adressePro_E;
		Email_E = email_E;
		Sex_E = sex_E;
		Nationalite_E = nationalite_E;
		Mobile_E = mobile_E;
		NomSC_E = nomSC_E;
		TelSC_E = telSC_E;
		FonctionSC_E = fonctionSC_E;
		ServiceSC_E = serviceSC_E;
		DateCreation = dateCreation;
		Code_UCrea = code_UCrea;
		DateMAJ = dateMAJ;
		Code_UMAJ = code_UMAJ;
		DateSuppr = dateSuppr;
		Code_USuppr = code_USuppr;
		MatriculePerso_E = matriculePerso_E;
		Dossier_E = dossier_E;
	}
	@Override
	public String toString() {
		return "Etudiant [Id_E=" + Id_E + ", Matricule_E=" + Matricule_E + ", Nom_E=" + Nom_E + ", Prenom_E=" + Prenom_E
				+ ", DateN_E=" + DateN_E + ", LieuN_E=" + LieuN_E + ", AdressePerso_E=" + AdressePerso_E
				+ ", AdressePro_E=" + AdressePro_E + ", Email_E=" + Email_E + ", Sex_E=" + Sex_E + ", Nationalite_E="
				+ Nationalite_E + ", Mobile_E=" + Mobile_E + ", NomSC_E=" + NomSC_E + ", TelSC_E=" + TelSC_E
				+ ", FonctionSC_E=" + FonctionSC_E + ", ServiceSC_E=" + ServiceSC_E + ", DateCreation=" + DateCreation
				+ ", Code_UCrea=" + Code_UCrea + ", DateMAJ=" + DateMAJ + ", Code_UMAJ=" + Code_UMAJ + ", DateSuppr="
				+ DateSuppr + ", Code_USuppr=" + Code_USuppr + ", MatriculePerso_E=" + MatriculePerso_E + ", Dossier_E="
				+ Dossier_E + "]";
	}

	
}
