package converter.convertertime;

public class Currencies {

    private String currency;

    public Currencies(String nameOfCurrency) {

        this.currency = nameOfCurrency;

    }

    public static void australian_dollar(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Australian Dollar");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double australianDollarExchangeRate = 2.70;

        if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / australianDollarExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = australianDollarExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void british_pound(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("British Pound");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double britishPoundExchangeRate = 1.64;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / britishPoundExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = britishPoundExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void canadian_dollar(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Canadian Dollar");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double canadianDollarExchangeRate = 2.64;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / canadianDollarExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = canadianDollarExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void chinese_yuan_renminbi(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Chinese Yuan Renminbi");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double chineseYuanRenminbiExchangeRate = 13.84;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / chineseYuanRenminbiExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = chineseYuanRenminbiExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void euro(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Euro");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double euroExchangeRate = 1.88;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / euroExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = euroExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void indian_rupee(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Indian Rupee");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double indianRupeeExchangeRate = 136.64;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / indianRupeeExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = indianRupeeExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void japanese_yen(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Japanese Yen");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double japaneseYenExchangeRate = 231.68;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / japaneseYenExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = japaneseYenExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void malaysian_ringgit(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Malaysian Ringgit");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double malaysianRinggitExchangeRate = 8.94;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / malaysianRinggitExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = malaysianRinggitExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void singapore_dollar(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Singapore Dollar");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double singaporeDollarExchangeRate = 2.86;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / singaporeDollarExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = singaporeDollarExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void swiss_franc(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Swiss Franc");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double swissFrancExchangeRate = 2.02;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        } else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / swissFrancExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = swissFrancExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void universal_currency(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("Universal Currency");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double universalCurrencyExchangeRate = 2.86;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        } else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("US Dollar")) {
            exchangeRate = 2.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / universalCurrencyExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = universalCurrencyExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public static void us_dollar(String fromNameOfCurrency, String toNameOfCurrency, Integer amount) {

        Currencies currencies = new Currencies("US Dollar");

        Double universalCurrency = 0.0;

        Double exchangeRate = 0.0;

        double usDollarExchangeRate = 2.00;

        if (toNameOfCurrency.equalsIgnoreCase("Australian Dollar")) {
            exchangeRate = 2.70;
        } else if (toNameOfCurrency.equalsIgnoreCase("British Pound")) {
            exchangeRate = 1.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Canadian Dollar")) {
            exchangeRate = 2.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Chinese Yuan Renminbi")) {
            exchangeRate = 13.84;
        } else if (toNameOfCurrency.equalsIgnoreCase("Euro")) {
            exchangeRate = 1.88;
        } else if (toNameOfCurrency.equalsIgnoreCase("Indian Rupee")) {
            exchangeRate = 136.64;
        } else if (toNameOfCurrency.equalsIgnoreCase("Japanese Yen")) {
            exchangeRate = 231.68;
        } else if (toNameOfCurrency.equalsIgnoreCase("Malaysian Ringgit")) {
            exchangeRate = 8.94;
        }  else if (toNameOfCurrency.equalsIgnoreCase("Singapore Dollar")) {
            exchangeRate = 2.86;
        } else if (toNameOfCurrency.equalsIgnoreCase("Swiss Franc")) {
            exchangeRate = 2.02;
        } else if (toNameOfCurrency.equalsIgnoreCase("Universal Currency")) {
            exchangeRate = 1.00;
        }

        if (fromNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            universalCurrency = amount / usDollarExchangeRate;

        }

        if (toNameOfCurrency.equalsIgnoreCase(currencies.currency)) {

            exchangeRate = usDollarExchangeRate;

        }

        Double convertedCurrency = universalCurrency * exchangeRate;

        System.out.println(amount + " " + fromNameOfCurrency.concat(" is ")
                + String.format("%.2f", convertedCurrency).concat(" in ") + toNameOfCurrency);
    }

    public String getNameOfCurrency() {
        return currency;
    }

    public void setNameOfCurrency(String nameOfCurrency) {
        this.currency = nameOfCurrency;
    }

}
