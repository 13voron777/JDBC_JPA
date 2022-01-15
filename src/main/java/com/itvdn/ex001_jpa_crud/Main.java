package com.itvdn.ex001_jpa_crud;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClientRepository cr = new ClientRepository();

        // =============== add() =================
        /*Client client1 = new Client();
        client1.setName("Vitaliy");
        client1.setAge(30);
        client1.setPhone("55555555555");
//
        cr.add(client1);
//
        Client client2 = new Client();
        client2.setName("Petya");
        client2.setAge(58);
        client2.setPhone("222222222222");
//
        cr.add(client2);*/

        // =============== remove() =================
        /*Client client2 = cr.getById(8);
        System.out.println(client2);
//
        cr.remove(client2);*/

        // =============== getAll() =================
        /*List<Client> clients = cr.getAll();
        for (Client client : clients) {
            System.out.println(client);
        }*/
//

        // =============== update() =================
        Client client3 = cr.getById(6);
        System.out.println(client3);

        client3.setName("Alex");
        cr.add(client3);

    }

}
