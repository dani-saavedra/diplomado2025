package co.edu.unisabana.diplomado2025.patrones.creacional;

import co.edu.unisabana.diplomado2025.patrones.creacional.singleton.ConexionDB;

public class Main {


    public static void main(String[] args) {
        ConexionDB conexion1 = ConexionDB.getInstance();

        ConexionDB conexion2 = ConexionDB.getInstance();

        System.out.println(conexion1);
        System.out.println(conexion2);

    }
}
