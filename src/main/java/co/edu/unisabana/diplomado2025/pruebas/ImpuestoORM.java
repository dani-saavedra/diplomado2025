package co.edu.unisabana.diplomado2025.pruebas;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tarifa")
@Entity
public class ImpuestoORM {

    @Id
    private String nombre;
    @Column
    private int impuesto;

    public ImpuestoORM(String nombre, int impuesto) {
        this.nombre = nombre;
        this.impuesto = impuesto;
    }

    public ImpuestoORM() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
}
