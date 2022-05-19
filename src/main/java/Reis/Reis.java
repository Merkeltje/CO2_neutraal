package Reis;

import Rit.Rit;
import Voertuig.Voertuig;

import java.util.ArrayList;
import java.util.Scanner;

    public class Reis {
        public static Scanner scanner = new Scanner(System.in);

        private String ReisNaam;    //ReisNaam bijv huis naar school
        private Integer ReisTijd;   //ReisTijd Totaal in Minuten
        private String DatumReis;   //Datum als 16-05-2022
        private Long TijdVertrek;   //Tijd als 18.30 (half 7)
        private Double ReisPunten;

        ArrayList<Rit> RittenTijdensReis = new ArrayList<>();

        public Reis(String ReisNaam, Integer ReisTijd, String DatumReis, Long TijdVertrek, Double ReisPunten){
            this.ReisNaam = ReisNaam;
            this.ReisTijd = ReisTijd;
            this.DatumReis = DatumReis;
            this.TijdVertrek = TijdVertrek;
            this.ReisPunten = ReisPunten;
        }


    }

