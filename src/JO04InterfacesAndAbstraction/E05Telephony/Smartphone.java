package JO04InterfacesAndAbstraction.E05Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder result = new StringBuilder();

        for (String number : numbers) {
            if (isValidNumber(number)) {
                result.append("Calling... ").append(number).append(System.lineSeparator());
                System.out.println("Calling... " + number);
            } else {
                result.append("Invalid number!").append(System.lineSeparator());
                System.out.println("Invalid number!");
            }
        }

        return result.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder result = new StringBuilder();

        for (String url : urls) {
            if (isValidURL(url)) {
                result.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
                System.out.println("Browsing: " + url + "!");
            } else {
                result.append("Invalid URL!").append(System.lineSeparator());
                System.out.println("Invalid URL!");
            }
        }

        return result.toString().trim();
    }

    private boolean isValidNumber(String number) {
        // A valid number should contain only digits
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidURL(String url) {
        // A valid URL should not contain any digits
        for (char c : url.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}