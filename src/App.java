import java.util.Scanner;

public class App {
    public static void main(String [] args) throws IllegalAccessException {
        Scanner SCANNER = new Scanner(System.in);
        Computer computer = new Computer();
        String scannedValue;

        do {
            switch (computer.getStavJizdenkomatu()) {
                case START:
                    computer.displayTickets();
                    scannedValue = SCANNER.nextLine();
                    computer.handleScannedValue(scannedValue);
                    break;
                case TICKET_GET:
                    Jizdenka selectedJizdenka = computer.getSelectedJizdenka();
                    System.out.println("Máš vybranou jízdenku: " + selectedJizdenka.getTrvani() + selectedJizdenka.getHodnota());
                    System.out.println("Požadovaná cena za jízdenku: " + selectedJizdenka.getHodnota() + " Kč");
                    // TODO: ...

                case INSERT_COINS:
                    computer.displayMince();
                    System.out.println("Lze použít mince s hodnotou 1, 2, 5, 10, 20 a 50 Korun!");



                default:
                    scannedValue = "end";
            }
        } while (!scannedValue.equals("end"));


        System.out.println("Ukončení jízdenko-matu");
    }
}
