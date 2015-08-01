package Controle;

import Modelo.Entidade;
import Modelo.Medico;
import Repositorio.Repositorio;

public class ControleRepositorio <T extends Entidade> {   
    private static Repositorio repositorioEntidade = new Repositorio();
    
    public void salvar(T t){
       repositorioEntidade.setRepository(t);
    }
 
}
