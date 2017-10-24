/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   10
 * Übungstitel: Lieblingstante
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       24.10.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Ankunft bei der Tante
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Durch dividieren die Dauer und Geschwindigkeit ermitteln.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Quirin_Ecker_Lieblingstante {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double geschwindigkeit, dauer, ankunft;
        final double WEG = 42.3;
        final double ABFAHRT = 10;
        int stunde;
        double minuteindec;
        double minute;
        double schnecke = 0.00005;

        System.out.println("Berechnung der Ankunftszeit bei der Tante");
        System.out.println("=========================================");
        System.out.println();


        System.out.print("Was wollen sie angeben (Geschwindigkeit oder Fahrtdauer): ");
        String wahl = scanner.next();


        if (wahl.equals("Geschwindigkeit")) {
            System.out.print("Geschwindigkeit in km/h: ");
            geschwindigkeit = scanner.nextDouble();


            dauer = WEG / geschwindigkeit;
            ankunft = ABFAHRT + dauer;


            stunde = (int) Math.floor(ankunft);
            minuteindec = ankunft - stunde;
            minute = minuteindec * 60;

            System.out.println("Dauer der Fahrt in Stunden: " + dauer);
            System.out.println("Ankunft bei der Tante: " + stunde + ":" + minute);

            if (stunde < 12) {
                System.out.println("Rechtzeitig zum Mittagessen");
            }

            else if (stunde > 19) {
                System.out.println("Sie kommen nicht vor Einbruch der Dunkelheit an");
            }

        }


        else if (wahl.equals("Fahrtdauer")) {
            System.out.print("Fahrtdauer in Stunden: ");
            double fahrtdauer = scanner.nextDouble();

            geschwindigkeit = WEG / fahrtdauer;

            System.out.println("Geschwidigkeit: " + geschwindigkeit);

        }


        else {
            System.out.println("Diese Option exestiert nicht oder wurde falsch geschrieben.");
        }
    }
}
