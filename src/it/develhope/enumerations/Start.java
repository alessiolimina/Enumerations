package it.develhope.enumerations;

public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Starting----------------");

        enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
        }

        for (int i = 0; i < Month.values().length; i++) {

            String month = Month.values()[i].toString();

            if (month.endsWith("Y")) {
                System.out.println(month + " ends with y");
            } else {
                System.out.println(month + " doesn't end with y");
            }

         System.out.println("--------------------------------------");

        }
    }
}
