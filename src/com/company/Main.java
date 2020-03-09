package com.company;

public class Main {

    public static void main(String[] args) {

        // creamos un evento
        Evento unEvento = new Evento();
        // creamos dos invitados
        Invitado alan = new InvitadoDigitalHouse();
        Invitado esteban = new InvitadoStandar();
        Invitado pebi = new InvitadoDigitalHouse();
        // creamos 3 fuegos artificiales
        Explotable fuego1 = new FuegoIndividual("Kapum");
        Explotable fuego2 = new FuegoIndividual("Katapam");
        Explotable fuego3 = new FuegoIndividual("Kazam");
        // metemos los fuegos en un pack
        PackFuegos packChiqui = new PackFuegos();
        packChiqui.agregarExplotable(fuego1);
        packChiqui.agregarExplotable(fuego2);
        packChiqui.agregarExplotable(fuego3);
        // invitamos la gente a la fiesta
        unEvento.agregarInvitado(alan);
        unEvento.agregarInvitado(esteban);
        unEvento.agregarInvitado(pebi);
        // compramos los fuegos artificiales
        unEvento.agregarExplotable(packChiqui);
        // repartimos encendemos las velas
        unEvento.encenderVelas();
    }
}
