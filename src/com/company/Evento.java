package com.company;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Explotable> listaDeExpotable;
    private List<Invitado> listaDeInvitados;

    public Evento(){
        listaDeExpotable = new ArrayList<>();
        listaDeInvitados = new ArrayList<>();
    }

    public void encenderVelas() {
        explotarFuegosArtificiales();
        repartirTorta();
    }

    private void explotarFuegosArtificiales() {
        for (Explotable unExplotable : listaDeExpotable) {
            unExplotable.explotar();
        }
    }

    private void repartirTorta() {
        for (Invitado unInvitado : listaDeInvitados) {
            unInvitado.comer();
        }
    }

    public void agregarExplotable(Explotable unExplotable){
        this.listaDeExpotable.add(unExplotable);
    }

    public void agregarInvitado(Invitado unInvitado){
        this.listaDeInvitados.add(unInvitado);
    }
}
