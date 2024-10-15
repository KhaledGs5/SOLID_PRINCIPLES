package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private final CarDatabase carDatabase = new CarDatabase();
    private final CarFormatter carFormatter = new CarFormatter();
    private final CarEvaluator carEvaluator = new CarEvaluator();

    public Car getCarById(final String carId)
    {
        return carDatabase.getFromDb(carId);
    }

    public String getAllCarNames()
    {
        return carFormatter.getCarsNames(carDatabase.getAllCars());
    }

    public Car getBestCar()
    {
        return carEvaluator.getBestCar(carDatabase.getAllCars());
    }
}
