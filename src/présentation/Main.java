package présentation;

import com.agence.dao.ClientImpl;
import com.agence.dao.IClient;
import com.agence.entities.Client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException {

        Client client = new Client();
        Scanner sc = new Scanner(System.in);


        IClient iclient = new ClientImpl();


        System.out.println("Ajout le nom du Client: ");
        String nom = sc.nextLine();
        System.out.println("Ajout le prenom du Client: ");
        String prenom = sc.nextLine();
        System.out.println("Ajout l'adresse du Client: ");
        String adresse = sc.nextLine();
        System.out.println("Ajout le numero de téléphone du Client: ");
        String telephone = sc.nextLine();
        System.out.println("Ajout la Civilites du Client: ");
        String civilites = sc.nextLine();

        // Insertion au niveau de la base de donnée

        client.setNom(nom);
        client.setPrenom(prenom);
        client.setAdresse(adresse);
        client.setTelephone(telephone);
        client.setCivivlites(civilites);

        int ok = iclient.create(client);

        sc.nextLine();

        System.out.println( ok + " Client ajouter avec succés");

       sc.nextLine();

        System.out.println("-----------------------------------------------------------------------------------------------------");

        sc.nextLine();

        File clients = new File("clients.csv");

        // Affichage de la liste des Clients enregistrés

        List<Client> clientList = iclient.read();

        System.out.println("La liste des Clients enregistrer est : ");

        for (Client cl: clientList)
        {

            System.out.println("l'identifiant du Client est: " + cl.getId());
            System.out.println("Son Nom = " + cl.getNom());
            System.out.println("Son Prenom = " + cl.getPrenom());
            System.out.println(" Son Adresse = " + cl.getAdresse());
            System.out.println(" Son Numero Telephone = " + cl.getTelephone());
            System.out.println(" Sa  Civilités = " + cl.getCivivlites());

        }

        FileWriter fileWriter = new FileWriter(clients);
        fileWriter.write("Id, Nom, Prenom, Adresse, Telephone, Civilites");


        fileWriter.close();
        System.out.println("Fichier cree avec succés");

        client.toString();
    }
}
