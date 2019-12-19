package fr.diginamic;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import javax.persistence.JoinColumn;

@Entity
@Table(name="LIVRE")

public class Livre {

	
	@Id
	@Column(name="ID")
	private int id;
	
	@ManyToMany
	@JoinTable(name="COMPO",
	joinColumns = @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
	inverseJoinColumns=@JoinColumn(name="ID_EMP", referencedColumnName="ID"))
	
	private Set<Emprunt> emprunt;

	@Column(name = "TITRE", length = 50, nullable = false, unique = true)
	private String titre;
	 
	@Column(name = "AUTEUR", length = 25, nullable = false, unique = true)
	private String auteur;
	
	
	public Livre(){}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String toString(){
		return  titre;
	}
	
	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}


	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}
}


