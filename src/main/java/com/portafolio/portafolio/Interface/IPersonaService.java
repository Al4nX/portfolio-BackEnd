package com.portafolio.portafolio.Interface;

import com.portafolio.portafolio.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista
    public List<Persona> getPersona();
    //guardar una persona
    public void savePersona(Persona persona);
    
    //eliminar persona por id
    public void deletePersona(Long id);
    
    //buscar persona
    public Persona findPersona(Long id);
}
