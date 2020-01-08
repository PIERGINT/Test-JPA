package fr.diginamic.appliBank;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import fr.diginamic.appliBank.MyClient;

@Entity
@Table(name="BANQUE")
public class Banque {

	@Id
	@Column(name="ID")
	private int id;
	
	@OneToMany(mappedBy="banque")
	private Set<MyClient> myclient;
	
	@Column(name = "NOM", length = 25, nullable = false, unique = true)
	private String nom;
	
	public Banque () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
