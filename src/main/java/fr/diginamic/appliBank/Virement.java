package fr.diginamic.appliBank;

import javax.persistence.Column;
import javax.persistence.Id;

public class Virement extends Operation{

	@Id
	@Column(name="ID")
	private int id;
	
	
	@Column(name = "BENEFICIAIRE", length = 50, nullable = false, unique = true)
	private String beneficiaire;
	
	public Virement () {
		super();
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	};
	
}
