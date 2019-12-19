package fr.diginamic;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")

public class Client {

	@Id
	@Column(name="ID")
	private int id;
	
	@OneToMany(mappedBy="client")	 
	private Set<Emprunt> emprunt;

	@Column(name = "NOM", length = 25, nullable = false, unique = true)
	private String nom;
	 
	@Column(name = "PRENOM", length = 25, nullable = false, unique = true)
	private String prenom;
	
	
	public Client(){}


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


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}


	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}


	
	
	
}
