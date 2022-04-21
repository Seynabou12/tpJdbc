package com.agence.dao;

import com.agence.entities.Client;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientImpl implements IClient {

    private DB db = new DB();
    private ResultSet rs;
    private int ok;

    @Override
    public int create(Client client) {

        String sql = "INSERT INTO client VALUES(NULL, ?, ?, ?, ?, ?)";

        try {

            // initialisation de la requete
            db.initPrepar(sql);
            db.getPstm().setString(1, client.getNom());
            db.getPstm().setString(2, client.getPrenom());
            db.getPstm().setString(3, client.getAdresse());
            db.getPstm().setString(4, client.getTelephone());
            db.getPstm().setString(5, client.getCivivlites());

            ok = db.executeMaj();
            db.closeConnection();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Client> read() {

        List<Client> clients =  new ArrayList<Client>();

        String sql = "SELECT * FROM  client";

        try {

            // on initialise avant de faire la requete
            db.initPrepar(sql);
            rs = db.executeSelect();

            // on parcourt la requete avec la boucle while
            while (rs.next())
            {
                //Recupérer le client et son qui est un entier
                Client cl = new Client();
                cl.setId(rs.getInt(1));
                cl.setNom(rs.getString(2));
                cl.setPrenom(rs.getString(3));
                cl.setAdresse(rs.getString(4));
                cl.setTelephone(rs.getString(5));
                cl.setCivivlites(rs.getString(6));

                clients.add(cl);
            }

            // Pour libérer les Ressources
            db.closeConnection();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return clients;
    }

    @Override
    public int update(Client cl) {

        String sql = "UPDATE client SET (NULL, 1, 2, 3, 4, 5)";

        try {
            // on initialise la requete puis on exécute
            db.initPrepar(sql);


        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public int delete(int id) {
        return ok;
    }
}
