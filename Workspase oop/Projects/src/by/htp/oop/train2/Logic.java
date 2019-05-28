package by.htp.oop.train2;

import by.htp.oop.train1.Train;
import by.htp.oop.train1.Main;
import java.util.Arrays;

public class Logic {

	public int trainRequest(Train[] train, int temp) {

		Number[] trainNumber = new Number[5];

		int index = 0;

		for (int i = 0; i < train.length; i++) {

			trainNumber[i] = train[i].getNumber();

			if (temp == (int) trainNumber[i]) {
				break;
			}

			index = index + 1;

		}
		return index;
	}

	
	
	public int[] sortTrainNumber(Train[] train) {

		int[] trains = new int[5];

		for (int i = 0; i < trains.length; i++) {

			int min;
			int minIndex;

			min = trains[i];
			minIndex = i;

			for (int j = i + 1; j < 5; j++) {

				if (trains[j] < min) {

					min = trains[j];
					minIndex = j;

				}
			}

			if (i != minIndex) {

				int tmp;

				tmp = trains[i];
				trains[i] = min;
				trains[minIndex] = tmp;

			}

		}

		return trains;

	}

	
	
	public String[] sortDestination(Train[] train) {

		String[] trainsSortDestination = new String[5];

		for (int i = 0; i < train.length; i++) {

			trainsSortDestination[i] = train[i].getDestination();
		}

		Arrays.sort(trainsSortDestination);
		return trainsSortDestination;
	}

}
