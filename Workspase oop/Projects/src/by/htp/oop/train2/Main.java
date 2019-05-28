package by.htp.oop.train2;

import by.htp.oop.train1.Train;
import by.htp.oop.train1.Logic;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Train[] train = new Train[5];

		train[0] = new Train(150, "Россь", 23, 54);
		train[1] = new Train(630, "Светлогорск", 16, 24);
		train[2] = new Train(96, "Волковыск", 01, 54);
		train[3] = new Train(115, "Гродно", 11, 28);
		train[4] = new Train(123, "Гродно", 23, 34);

		Logic newTrain = new Logic();

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер поезда: ");
		int temp = sc.nextInt();

		int i = newTrain.trainRequest(train, temp);

		System.out.println("Номер поезда " + train[i].getNumber() + ", пункт назначения " + train[i].getDestination()
				+ ", время отправления " + train[i].getHour() + " ч. " + train[i].getMinute() + " мин.");

		
		
		Display displayTrains = new Display();

		System.out.println();
		System.out.println("Сортировка по номеру поезда ");

		int[] trains = newTrain.sortTrainNumber(train);

		displayTrains.displaySortTrainNumber(trains, train);

		
		
		System.out.println();
		System.out.println("Сортировка по пункту назначения ");
		newTrain.sortDestination(train);
		displayTrains.displaySortDestination(newTrain.sortDestination(train), train);
	}

}