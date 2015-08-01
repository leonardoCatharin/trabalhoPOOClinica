package Modelo;

public class Entidade {
    private static Integer index = 0;
    private final Integer id;//recebe o valor uma vez e nãao muda

    public Entidade() {
        this.id = index++;
    }
    
    public Integer getId() {
        return id;
    }

}
