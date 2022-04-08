package com.intiformation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static ArrayList<Medicament> listeMedicament = new ArrayList<Medicament>();
	static ArrayList<Client> listeClient = new ArrayList<Client>();
	static int compteur = 0;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Veuillez s�lectionner le programme que vous souhaitez : \n" + "1. Cr�ation d'un nouveau client. \n"
						+ "2. Afficher les infos d'un client. \n" + "3. Ajout d'un m�dicament dans la base de donn�e. \n"
						+ "4. Afficher les infos d'un m�dicament.. \n" + "5. Restock d'un m�dicament. \n" + "5. Vente d'un m�dicament. \n" + "6. Quitter. \n ");

		int key = sc.nextInt();
		switch (key)
			{
			case 1: // Cr�ation d'un nouveau client
				creationClient();
				break;

			case 2: // Affichage des informations client
				infosClient();
				break;
				
			case 3: // ajout d'un nouveau m�dicament
				ajoutMedicament();
				break;
				

			case 4: // Affichage des informations m�dicament
				infosMedicament();

				break;

			case 5: // Restock des m�dicaments
				restockMedicament();
				break;

			case 6: // Vente des medicaments
				venteMedicament();
				break;

			case 7: // Fermeture du logiciel
				quitter();
				break;

			default:
				break;
			}
		sc.close();
	}
	
	public static void creationClient() // Fonction 1
	{
			Scanner sc = new Scanner(System.in);
			Client c1 = new Client();

			System.out.print("Cr�ation de client - Votre Nom : ");
			c1.setNom(sc.next());
			c1.setId(compteur++);
			c1.setCr�dit(150);

			listeClient.add(c1);
			System.out.println("Nouveau client ajout� : " + c1.getNom() + " : " + c1.toString());
			
			main(null);
			sc.close();
	}

	private static void infosClient() // Fonction 2
	{
		System.out.println("Liste des clients : " + listeClient);
		System.out.print("Choisir l'id du client � afficher : ");

		Scanner sc = new Scanner(System.in);
		int idMod = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeClient.size(); i++)
		{
			if (listeClient.get(i).getId() == idMod)
			{
				isTrouver = true;
				System.out.println(listeClient.get(i));
			}

		}
		if (isTrouver == false)
		{
			System.out.println("Aucun client ne correspondant � cet id.");
		}
		
		main(null);
		sc.close();
		
	}
	
	public static void ajoutMedicament() // Fonction 3
	{
			Scanner sc = new Scanner(System.in);
			Medicament m1 = new Medicament();

			System.out.print("Cr�ation de m�dicament - Nom du m�dicament : ");
			m1.setNom(sc.next());
			m1.setId(compteur++);
			System.out.print("Combien de stock voulez vous rajouter? ");
			m1.setStock(sc.nextInt());

			listeMedicament.add(m1);
			System.out.println("Nouveau m�dicament ajout� : " + m1.getNom() + " : " + m1.getStock());
			
			main(null);
			sc.close();
	}

	private static void infosMedicament() // Fonction 4
	{
			System.out.println("Liste des m�dicaments : " + listeMedicament);
			System.out.print("Choisir l'id du m�dicament � afficher : ");

			Scanner sc = new Scanner(System.in);
			int idMod = sc.nextInt();

			boolean isTrouver = false;
			for (int i = 0; i < listeMedicament.size(); i++)
			{
				if (listeMedicament.get(i).getId() == idMod)
				{
					isTrouver = true;
					System.out.println(listeMedicament.get(i));
				}

			}
			if (isTrouver == false)
			{
				System.out.println("Aucun m�dicament ne correspondant � cet id.");
			}

			sc.close();
			main(null);
	}

	private static void restockMedicament() // Fonction 5
	{
		System.out.println("Liste des m�dicaments : " + listeMedicament);
		System.out.print("Choisir l'id du m�dicament � restocker : ");

		Scanner sc = new Scanner(System.in);
		int idMod = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeMedicament.size(); i++)
		{
			isTrouver = true;

			if (listeMedicament.get(i).getId() == idMod)
			{
				System.out.println("Stock actuel : " + listeMedicament.get(i).getStock() + "Saississez la quantit� � rajouter : ");
				listeMedicament.get(i).setStock(sc.nextInt());
				System.out.println("Stock d�sormais : " + listeMedicament.get(i).getStock());
			}

			if (isTrouver == false)
			{
				System.out.println("Aucun m�dicament ne correspondant � cet id.");
			}

			sc.close();
			main(null);
		}
	}

	private static void venteMedicament() // Fonction 5
	{
		System.out.println("Liste des m�dicaments : " + listeMedicament);
		System.out.print("Choisir l'id du m�dicament � vendre : ");

		Scanner sc = new Scanner(System.in);
		int idMod = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeMedicament.size(); i++)
		{
			if (listeMedicament.get(i).getId() == idMod)
			{
				System.out.println("Saissisez la quantit� � vendre - celle-ci sera d�duite du stock actuelle.");

				isTrouver = true;
				System.out.println(listeMedicament.get(i));
			}

		}
		if (isTrouver == false)
		{
			System.out.println("Aucun client ne correspondant � cet id.");
		}
		sc.close();
		main(null);
	}

	private static void quitter() // Fonction 6
	{
		System.out.println("Bonne journ�e � vous et � bient�t.");
	}

}
