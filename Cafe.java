package Cafes;

import java.util.ArrayList;

public class Cafe{
    private String tipo;
    private ArrayList <Integer> comple;

    public Cafe(String tipo){
    this.tipo = tipo;
    comple = new ArrayList<>();
}

public String getCafe(){
    return tipo;
}

public int getQuantidadecomple(){
    return comple.size();
}

public void adicionarComplementos(int x){
    comple.add(x);


} 

public int complementos(int i){
    return comple.get(i);
}

}

