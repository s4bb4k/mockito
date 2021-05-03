package org.appmockito.ejemplos.repositories;

import org.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {

    Examen guardar(Examen examen);

    List<Examen> findAll();

}
