package converter.convertertime;

import java.util.*;

public class MainConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which currency do you want to convert this from?");
        String fromNameOfCurrency = scanner.nextLine();

        System.out.println("Which currency do you want to convert this to?");
        String toNameOfCurrency = scanner.nextLine();

        System.out.println("What amount do you want to convert?");
        Integer amountConversion = scanner.nextInt();

        Currencies currencies = new Currencies("Australian Dollar");

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.australian_dollar(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("British Pound");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.british_pound(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Canadian Dollar");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.canadian_dollar(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Chinese Yuan Renminbi");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.chinese_yuan_renminbi(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Euro");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.euro(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Indian Rupee");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.indian_rupee(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Japanese Yen");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.japanese_yen(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Malaysian Ringgit");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.malaysian_ringgit(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Singapore Dollar");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.singapore_dollar(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Swiss Franc");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.swiss_franc(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("Universal Currency");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.universal_currency(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

        currencies.setNameOfCurrency("US Dollar");
        if (fromNameOfCurrency.equalsIgnoreCase(currencies.getNameOfCurrency())) {

            Currencies.us_dollar(fromNameOfCurrency, toNameOfCurrency, amountConversion);

        }

    }

}
