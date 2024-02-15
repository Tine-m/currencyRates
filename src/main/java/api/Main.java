package api;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CurrencyService service = new CurrencyService();
        CurrencyRates rates = service.getRates();
        System.out.println("Valutakurser baseret på USD dollar\n" + rates);
    }
}
