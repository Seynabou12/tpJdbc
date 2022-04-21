package com.agence.entities;

public class Client
{

    public int id;
    public String prenom;
    public String nom;
    public String adresse;
    public String telephone;
    public String civivlites;

    public Client()
    {

        // herite du constructeur de la classe parent
        super();

    }

    public Client(int id, String prenom, String nom, String adresse, String telephone, String civivlites)
    {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.civivlites = civivlites;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getCivivlites()
    {
        return civivlites;
    }

    public void setCivivlites(String civivlites)
    {
        this.civivlites = civivlites;
    }


    @Override
    public String toString()
    {

        return "Client{" +
                "id=" + id + getId() +
                ", prenom='" + prenom + getPrenom()+'\'' +
                ", nom='" + nom + getNom()+'\'' +
                ", adresse='" + adresse + getAdresse() + '\'' +
                ", telephone='" + telephone + getTelephone()+ '\'' +
                ", civivlites='" + civivlites + getCivivlites()+ '\'' +
                '}';
    }
}
