package by.htp.oop.train2;

import by.htp.oop.train1.Logic;
import by.htp.oop.train1.Train;
import by.htp.oop.train1.Main;

public class Display {

	public void displaySortTrainNumber(int[] trains, Train[] train) {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if (trains[i] == train[j].getNumber()) {

					System.out.println("Номер поезда " + trains[i] + ", пункт назначения " + train[j].getDestination()
							+ ", время отправления " + train[j].getHour() + " ч. " + train[j].getMinute() + " мин.");
				}
			}
		}

	}



	public void displaySortDestination(String[] sortDestination, Train[] train) {

		for (int i = 0; i < sortDestination.length; i++) {
		
			for (int k = i + 1; k < sortDestination.length - 1; k++) {
				
				if (sortDestination[i] == sortDestination[k]) {
					
					i = i + 1;
				}
			}
			for (int j = 0; j < 5; j++) {

				if (sortDestination[i] == train[j].getDestination()) {
					
					
					System.out.println("Номер поезда " + sortDestination[i] + ", пункт назначения "
							+ train[j].getDestination() + ", время отправления " + train[j].getHour() + " ч. "
							+ train[j].getMinute() + " мин.");

				}
			}
		}

	}
}
