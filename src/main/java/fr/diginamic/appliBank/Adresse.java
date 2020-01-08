package fr.diginamic.appliBank;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Adresse {
	
	@Column(name = "NUMERO", length = 4, nullable = false, unique = false)
	private Integer numero;
	
	@Column(name = "RUE", length = 50, nullable = false, unique = false)
	private String rue;
	
	@Column(name = "CODEPOSTAL", length = 5, nullable = false, unique = false)
	private Integer codePostal;
	
	@Column(name = "VILLE", length = 25, nullable = false, unique = false)
	private String ville;
	
	public Adresse () {}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
