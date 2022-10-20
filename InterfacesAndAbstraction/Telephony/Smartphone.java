package InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls) {

            if (url.matches("\\D+")) {
                sb.append("Browsing: ").append(url).append("!").append("\n");
            } else {
                sb.append("Invalid URL!").append("\n");
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : numbers) {

            if (number.matches("\\d+")) {
                sb.append("Calling... ").append(number).append("\n");
            } else {
                sb.append("Invalid number!").append("\n");
            }
        }
        return sb.toString().trim();
    }
}
