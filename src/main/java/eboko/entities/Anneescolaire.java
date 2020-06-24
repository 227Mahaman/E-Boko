package eboko.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anneescolaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_A;
	private String Code_A;
	private String Intitule_A;
	private String datasource_A;
  	//`isDefault_A;
	private String DA;
	public Long getId_A() {
		return Id_A;
	}
	public void setId_A(Long id_A) {
		Id_A = id_A;
	}
	public String getCode_A() {
		return Code_A;
	}
	public void setCode_A(String code_A) {
		Code_A = code_A;
	}
	public String getIntitule_A() {
		return Intitule_A;
	}
	public void setIntitule_A(String intitule_A) {
		Intitule_A = intitule_A;
	}
	public String getDatasource_A() {
		return datasource_A;
	}
	public void setDatasource_A(String datasource_A) {
		this.datasource_A = datasource_A;
	}
	public String getDA() {
		return DA;
	}
	public void setDA(String dA) {
		DA = dA;
	}
	
	public Anneescolaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Anneescolaire(Long id_A, String code_A, String intitule_A, String datasource_A, String dA) {
		super();
		Id_A = id_A;
		Code_A = code_A;
		Intitule_A = intitule_A;
		this.datasource_A = datasource_A;
		DA = dA;
	}
	
	@Override
	public String toString() {
		return "Anneescolaire [Id_A=" + Id_A + ", Code_A=" + Code_A + ", Intitule_A=" + Intitule_A + ", datasource_A="
				+ datasource_A + ", DA=" + DA + "]";
	}
	
	
}
