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
				"Veuillez sélectionner le programme que vous souhaitez : \n" + "1. Création d'un nouveau client. \n"
						+ "2. Afficher les infos d'un client. \n" + "3. Ajout d'un médicament dans la base de donnée. \n"
						+ "4. Afficher les infos d'un médicament.. \n" + "5. Restock d'un médicament. \n" + "5. Vente d'un médicament. \n" + "6. Quitter. \n ");

		int key = sc.nextInt();
		switch (key)
			{
			case 1: // Création d'un nouveau client
				creationClient();
				break;

			case 2: // Affichage des informations client
				infosClient();
				break;
				
			case 3: // ajout d'un nouveau médicament
				ajoutMedicament();
				break;
				

			case 4: // Affichage des informations médicament
				infosMedicament();

				break;

			case 5: // Restock des médicaments
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

			System.out.print("Création de client - Votre Nom : ");
			c1.setNom(sc.next());
			c1.setId(compteur++);
			c1.setCrédit(150);

			listeClient.add(c1);
			System.out.println("Nouveau client ajouté : " + c1.getNom() + " : " + c1.toString());
			
			main(null);
			sc.close();
	}

	private static void infosClient() // Fonction 2
	{
		System.out.println("Liste des clients : " + listeClient);
		System.out.print("Choisir l'id du client à afficher : ");

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
			System.out.println("Aucun client ne correspondant à cet id.");
		}
		
		main(null);
		sc.close();
		
	}
	
	public static void ajoutMedicament() // Fonction 3
	{
			Scanner sc = new Scanner(System.in);
			Medicament m1 = new Medicament();

			System.out.print("Création de médicament - Nom du médicament : ");
			m1.setNom(sc.next());
			m1.setId(compteur++);
			System.out.print("Combien de stock voulez vous rajouter? ");
			m1.setStock(sc.nextInt());

			listeMedicament.add(m1);
			System.out.println("Nouveau médicament ajouté : " + m1.getNom() + " : " + m1.getStock());
			
			main(null);
			sc.close();
	}

	private static void infosMedicament() // Fonction 4
	{
			System.out.println("Liste des médicaments : " + listeMedicament);
			System.out.print("Choisir l'id du médicament à afficher : ");

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
				System.out.println("Aucun médicament ne correspondant à cet id.");
			}

			sc.close();
			main(null);
	}

	private static void restockMedicament() // Fonction 5
	{
		System.out.println("Liste des médicaments : " + listeMedicament);
		System.out.print("Choisir l'id du médicament à restocker : ");

		Scanner sc = new Scanner(System.in);
		int idMod = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeMedicament.size(); i++)
		{
			isTrouver = true;

			if (listeMedicament.get(i).getId() == idMod)
			{
				System.out.println("Stock actuel : " + listeMedicament.get(i).getStock() + "Saississez la quantité à rajouter : ");
				listeMedicament.get(i).setStock(sc.nextInt());
				System.out.println("Stock désormais : " + listeMedicament.get(i).getStock());
			}

			if (isTrouver == false)
			{
				System.out.println("Aucun médicament ne correspondant à cet id.");
			}

			sc.close();
			main(null);
		}
	}

	private static void venteMedicament() // Fonction 5
	{
		System.out.println("Liste des médicaments : " + listeMedicament);
		System.out.print("Choisir l'id du médicament à vendre : ");

		Scanner sc = new Scanner(System.in);
		int idMod = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeMedicament.size(); i++)
		{
			if (listeMedicament.get(i).getId() == idMod)
			{
				System.out.println("Saissisez la quantité à vendre - celle-ci sera déduite du stock actuelle.");

				isTrouver = true;
				System.out.println(listeMedicament.get(i));
			}

		}
		if (isTrouver == false)
		{
			System.out.println("Aucun client ne correspondant à cet id.");
		}
		sc.close();
		main(null);
	}

	private static void quitter() // Fonction 6
	{
		System.out.println("Bonne journée à vous et à bientôt.");
	}

}
