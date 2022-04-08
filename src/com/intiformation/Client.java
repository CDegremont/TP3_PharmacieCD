package com.intiformation;

public class Client
{
	// Attributs
	private int id;
	private String nom;
	private double cr�dit;

	// Constructeur par d�faut
	public Client() 
	{
		
	}
	
	// Constructeur surcharg�
	public Client(int id, String nom, double cr�dit) 
	{
		super();
		this.id = id;
		this.nom = nom;
		this.cr�dit = 0;
	}
	
	// Methods
	@Override
	public String toString()
	{
		return "Client [id=" + id + ", nom=" + nom + ", cr�dit=" + cr�dit + "]";
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
	public double getCr�dit()
	{
		return cr�dit;
	}
	public void setCr�dit(double cr�dit)
	{
		this.cr�dit = cr�dit;
	}
}
