public class DrinkCoffee {

    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {

        if (coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Cafeaua e prea fierbinte. O aruncam!");
        }

        if (coffee.getConc() > 55) {
            throw new ConcentrationException(coffee.getConc(), "Concentratia cafeleie e prea mare. O aruncam!");
        }

    }

}
