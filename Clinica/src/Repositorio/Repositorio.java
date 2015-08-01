package Repositorio;

import Modelo.Entidade;
import java.util.HashMap;
import java.util.Map;

public class Repositorio{
    Map <Integer,Entidade> repository;
    
    public Repositorio() {
        this.repository = new HashMap<>();
    }


    public Map<Integer, Entidade> getRepository() {
        return repository;
    }

    public void setRepository(Entidade t) {
        this.repository.put(t.getId(), t);
    }
 
}
