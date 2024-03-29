import java.util.Map;

public class Display {

    public void displayTickets(Map<Integer, Jizdenka> tickets) {
        if (!tickets.isEmpty()) {
            for (Map.Entry<Integer, Jizdenka> entry : tickets.entrySet()) {
                Jizdenka jizdenka = entry.getValue();

                System.out.println(String.format("%s: Jizdenka na %s min za %s Kč",
                        entry.getKey(), jizdenka.getTrvani(), jizdenka.getHodnota()));
            }
        } else {
            System.out.println("Nejsou jizdenky");
        }
    }

    public void displayTicket(int position, Jizdenka jizdenka) {
        System.out.println(String.format("Byla vybrána jízdenka na pozici %s délka %s min za %s Kč",
                position, jizdenka.getTrvani(), jizdenka.getHodnota()));
    }

    public void displayMince(Map<Integer, Mince> mince){
        if (!mince.isEmpty()){
            for (Map.Entry<Integer, Mince> entry : mince.entrySet()){
                Mince mince1 = entry.getValue();

                System.out.println(String.format("%s: Mince s hodnotou %s Kč", entry.getKey(), mince1.getHodnotaMince()));
            }
        }else {
            System.out.println("Mince došli!");
        }
    }

    public void displayMinci(int position, Mince mince) {
        System.out.println(String.format("%s: Mince s hodnotu %s Kč",
                position, mince.getHodnotaMince()));
    }
}