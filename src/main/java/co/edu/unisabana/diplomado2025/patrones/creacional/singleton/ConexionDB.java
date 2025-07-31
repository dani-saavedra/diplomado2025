package co.edu.unisabana.diplomado2025.patrones.creacional.singleton;

public class ConexionDB {

    private static ConexionDB conexionDB;

    private ConexionDB() {

    }

    public static ConexionDB getInstance() {
        if (conexionDB == null) {
            conexionDB = new ConexionDB();
            //JDBC de conectarnos a la BD
        }
        return conexionDB;
    }
}
