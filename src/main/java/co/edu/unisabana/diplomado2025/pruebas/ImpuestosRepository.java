package co.edu.unisabana.diplomado2025.pruebas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpuestosRepository extends JpaRepository<ImpuestoORM, String> {


    ImpuestoORM findByNombre(String nombre);
}
