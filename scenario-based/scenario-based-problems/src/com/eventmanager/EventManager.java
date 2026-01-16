package com.eventmanager;

public class EventManager {

	static void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tickets, low, high);
            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    static int partition(Ticket[] tickets, int low, int high) {
        int pivotPrice = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price <= pivotPrice) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }
	public static void main(String[] args) {

		Ticket[] tickets = {
	            new Ticket("Concert A", 2500),
	            new Ticket("Concert B", 1500),
	            new Ticket("Concert C", 3000),
	            new Ticket("Concert D", 1200),
	            new Ticket("Concert E", 1800)
	        };

	        quickSort(tickets, 0, tickets.length - 1);

	        for (Ticket t : tickets) {
	            t.show();
	        }
	}

}
