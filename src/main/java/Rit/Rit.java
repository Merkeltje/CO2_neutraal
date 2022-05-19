package Rit;
import Voertuig.Voertuig;

import java.util.ArrayList;
import java.util.Scanner;

public class Rit {
    private Double RitTijd;
    private String GebruikteVoertuig;
    private Double PuntenRit;

    public static Scanner scanner = new Scanner(System.in);

    public Rit (Double RitTijd, String GebruikteVoertuig){
        this.RitTijd = RitTijd;
        this.GebruikteVoertuig = GebruikteVoertuig;
    }


    public Voertuig HaalvoertuigOP (String gebruikteVoertuig){
        for (Voertuig voertuig: Voertuig.AlleVoertuigen){
            if (voertuig.getTypeVoertuig().equals(gebruikteVoertuig)){
                return voertuig;
            }
        }
        return null;
    }

    public Double PuntenRit (){
        Double VoertuigPunten = HaalvoertuigOP(GebruikteVoertuig).getVoertuigPunten();
        Double  PuntenRit = getRitTijd() * VoertuigPunten;
        return PuntenRit;
    }

    public Double getRitTijd() {
        return RitTijd;
    }
}
