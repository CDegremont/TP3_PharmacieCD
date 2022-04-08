package com.intiformation;

public class Client
{
	// Attributs
	private int id;
	private String nom;
	private double crédit;

	// Constructeur par défaut
	public Client() 
	{
		
	}
	
	// Constructeur surchargé
	public Client(int id, String nom, double crédit) 
	{
		super();
		this.id = id;
		this.nom = nom;
		this.crédit = 0;
	}
	
	// Methods
	@Override
	public String toString()
	{
		return "Client [id=" + id + ", nom=" + nom + ", crédit=" + crédit + "]";
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
	public double getCrédit()
	{
		return crédit;
	}
	public void setCrédit(double crédit)
	{
		this.crédit = crédit;
	}
}
