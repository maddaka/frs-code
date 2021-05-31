package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("1234", "Bangalore", "Mumbai", null, "DepartureDateTime", "ArrivalDateTime", null, 2000, false, "3A", "lunch");
        Ticket touristTicket = new TouristTicket("5678", "Bangalore", "Goa", null, "DepartureDateTime", "ArrivalDateTime", null, 200, false, "3B", "Goa Resort", new String[]{" "});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

        public static void printTicketDetails(Ticket ticket){
            System.out.println(ticket.getPnr());
        }





}
