package com.company;

public class FuegoIndividual implements Explotable{
    private String Ruido;

    public FuegoIndividual(String ruido) {
        Ruido = ruido;
    }

    public String getRuido() {
        return Ruido;
    }

    @Override
    public void explotar() {
        System.out.println(this.Ruido);
    }
}
