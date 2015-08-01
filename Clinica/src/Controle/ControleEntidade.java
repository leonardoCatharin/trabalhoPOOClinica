package Controle;

import Modelo.Entidade;

public class ControleEntidade {
    ControleRepositorio controleRepositorio = new ControleRepositorio();

    public void salvaEntidade(Entidade entidade){
        controleRepositorio.salvar(entidade);
    }
}
