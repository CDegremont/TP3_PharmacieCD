package com.intiformation;

public class Medicament
{
	// Attributs
	private int id;
	private String nom;
	private double prix;
	private int stock;
		
	// Constructeur par défaut
	public Medicament()
	{
			
	}

	// Constructeur surchargé
	public Medicament(int id, String nom, double prix, int stock)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
	}
	
	//Methods
	@Override
	public String toString()
	{
		return "Medicament [id=" + id + ", nom=" + nom + ", prix=" + prix + ", stock=" + stock + "]";
	}
	
	// GETTERS & SETTERS
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	public double getPrix()
	{
		return prix;
	}
	public void setPrix(double prix)
	{
		this.prix = prix;
	}
	public int getStock()
	{
		return stock;
	}
	public void setStock(int stock)
	{
		this.stock = stock;
	}	
}
