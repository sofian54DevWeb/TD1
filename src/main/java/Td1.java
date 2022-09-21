import models.Vehicule;
import models.Voiture;

public class Td1 {

    public static void main(String[] args) {
        Voiture monTest = new Voiture("toyota",10);

        System.out.println("Les frais kilométrique sont de " + monTest.fraisKilometrique(1000) + "€");



    }




}
