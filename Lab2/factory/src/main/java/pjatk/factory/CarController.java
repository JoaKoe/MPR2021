package pjatk.factory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //tutaj rpzyjmujemy requesty
@RequestMapping("/cars") // ze swiata z tego adresu
public class CarController {

    private final CarService carService;

    public CarController(CarService carService, UserService userService)
    {
        this.carService = carService;
    }


    @GetMapping("/hello") //po /hello wywoała tą metodę
    public ResponseEntity<String> HelloWordl() //zwrac entity jako stringaa
    {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/build") //po /build zwraca tą metode tj /cars/build
    public ResponseEntity<Car> CarBuild()
    {
        return ResponseEntity.ok(carService.returnCar("Volkswagen", "Passat")); //dodajemy mu od razu wartosci
    }

    @GetMapping("/find")
    public ResponseEntity<Car> findById()
    {
        return ResponseEntity.ok(carService.findById(10L));
    }
    }


