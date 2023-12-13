package com.example.oop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	static List<Car> cars = new ArrayList<>();

	public static void rebrandCar(Car passedCar, String newBrand) {
		Car newCar = new Car(8, 16, newBrand);

		passedCar.setBrand(newBrand);
	}

	public static void main(String[] args) {
		Set<String> brandNamesSet =  new HashSet<>();
		brandNamesSet.add("Toyota");
		brandNamesSet.add("Honda");

		List<String> brandNames = new ArrayList<>(4);
		brandNames.add("Toyota");
		brandNames.add("Subaru");
		brandNames.add("Ferrari");
		brandNames.add("Honda");
		Car myCar = new Car(6, 18, "Toyota");


		rebrandCar(myCar, "Honda");
		myCar.getBrand().equals("Honda"); // true
		myCar.getBrand().equals(brandNames.get(1)); // true

	}
}
