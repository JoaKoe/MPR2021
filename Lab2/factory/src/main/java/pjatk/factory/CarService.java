package pjatk.factory;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {

    public final CarRepository carRepository;


    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void ShowCar(Car car) {
        System.out.println(car);
    }

    public void AddExtraWheel(Car car) {
        if (car.getNumberOfWheels() < 5) {
            car.setNumberOfWheels(car.getNumberOfWheels() + 1);
            System.out.println("dodano koło zapasowe");
        } else {
            System.out.println("mamy juz komplet");
        }
    }

    public String rePaint(Car car)
    {
        String newColor = "Pink";
        car.setColor(newColor);
        return newColor;
    }

    public void isThisWrack(Car car)
    {
        boolean wrack = false;
        String marka1 = car.getMarka();
            if (marka1 == "Fiat")
            {
                wrack = false;
            }

    }

    public String isThisForYou(Car car)
    {
       String model1 = car.getModel();
       String engine1 =  car.getEngine();
       String bierz = "bierz!";

        if (model1 == null)
        {
            System.out.print("nie ma modelu!");
        }
            else
                {
                return model1;
                }
            if (engine1 == null)
        {
            System.out.print("Brak silnika!");
        }
            else{
                return engine1;
            }
            if (model1 != null && engine1 != null)
        {
            return bierz;
        }

        return null;
    }




    public Car returnCar(String marka, String model) {
        Car car = new Car( marka, "black", "red", "sport", model, 3);
        return carRepository.save(car);
    }

    public Car findById(Long id)
    {
        Optional<Car> byId = carRepository.findById(id);
        if (byId.isPresent())
        {
            return byId.get();
        }
        else
        {
            return null;
        }
    }


}
