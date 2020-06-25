package eboko.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anneescolaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idA;
	private String codeA;
	private String intituleA;
	private String datasourceA;
  	//`isDefault_A;
	private String dA;
	public Long getIdA() {
		return idA;
	}
	public void setIdA(Long idA) {
		this.idA = idA;
	}
	public String getCodeA() {
		return codeA;
	}
	public void setCodeA(String codeA) {
		this.codeA = codeA;
	}
	public String getIntituleA() {
		return intituleA;
	}
	public void setIntituleA(String intituleA) {
		this.intituleA = intituleA;
	}
	public String getDatasourceA() {
		return datasourceA;
	}
	public void setDatasourceA(String datasourceA) {
		this.datasourceA = datasourceA;
	}
	public String getdA() {
		return dA;
	}
	public void setdA(String dA) {
		this.dA = dA;
	}
	public Anneescolaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Anneescolaire(Long idA, String codeA, String intituleA, String datasourceA, String dA) {
		super();
		this.idA = idA;
		this.codeA = codeA;
		this.intituleA = intituleA;
		this.datasourceA = datasourceA;
		this.dA = dA;
	}
	@Override
	public String toString() {
		return "Anneescolaire [idA=" + idA + ", codeA=" + codeA + ", intituleA=" + intituleA + ", datasourceA="
				+ datasourceA + ", dA=" + dA + "]";
	}
	
	
		
}
