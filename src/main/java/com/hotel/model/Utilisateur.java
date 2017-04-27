package main.java.com.hotel.model;
// Generated 19 avr. 2017 12:27:09 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name = "utilisateur", catalog = "hotel")
public class Utilisateur implements java.io.Serializable {

	private int idU;
	private String nom;
	private String prenom;
	private String numTel;
	private String taype;
	private String username;
	private String password;

	public Utilisateur() {
	}

	public Utilisateur(int idU) {
		this.idU = idU;
	}

	public Utilisateur(int idU, String nom, String prenom, String numTel, String taype, String username,
			String password) {
		this.idU = idU;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.taype = taype;
		this.username = username;
		this.password = password;
	}

	@Id
	@Column(name = "idU", unique = true, nullable = false)
	public int getIdU() {
		return this.idU;
	}

	public void setIdU(int idU) {
		this.idU = idU;
	}

	@Column(name = "nom", length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "numTel", length = 50)
	public String getNumTel() {
		return this.numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@Column(name = "taype", length = 50)
	public String getTaype() {
		return this.taype;
	}

	public void setTaype(String taype) {
		this.taype = taype;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 64)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
