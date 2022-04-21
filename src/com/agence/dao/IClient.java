package com.agence.dao;

import com.agence.entities.Client;

import java.util.List;

public interface IClient
{

    public int create(Client client);
    public int update(Client client);
    public int delete(int id);
    public  List<Client> read();
}
