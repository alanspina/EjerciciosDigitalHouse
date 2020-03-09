package com.company;

import java.util.ArrayList;
import java.util.List;

public class PackFuegos implements Explotable {
    private List<Explotable> listaExplotable;

    public PackFuegos() {
        this.listaExplotable = new ArrayList<>();
    }

    @Override
    public void explotar() {
        for (Explotable unExplotable : listaExplotable) {
            unExplotable.explotar();
        }
    }

    public void agregarExplotable(Explotable explotable){
        this.listaExplotable.add(explotable);
    }

}
