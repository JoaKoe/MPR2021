package pjatk.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {


    private CarService carService = new CarService( null);

    @Test
    void shouldAddExtraWheel()
    {
        //given
        Car car = new Car("random marka", "randomw wheels", "red", "randoe engine", "randoe model", 5, false);
        //when
        carService.AddExtraWheel(car);
        //then
        assertThat(car.getNumberOfWheels()).isEqualTo(5);
    }


    @Test
    void shouldNotAddExtraWheel()
    {
        //given
        Car car = new Car("random marka", "randomw wheels", "red", "randoe engine", "randoe model", 5, false);
        //when
        carService.AddExtraWheel(car);
        //then
        assertThat(car.getNumberOfWheels()).isEqualTo(5);
    }

    @Test
    void shouldRePaint()
    {
        //given
        Car car = new Car("random marka", "randomw wheels", "red", "randoe engine", "randoe model", 5, false);
        //when
        String testColor = carService.rePaint(car,"test color");
        //then
        assertThat(car.getColor()).isEqualTo("test color");
    }

    @Test
    void shouldRePaintNull()
    {
        //given
        Car car = new Car("random marka", "randomw wheels", null, "randoe engine", "randoe model", 5, false);
        //when
        String testColor = carService.rePaint(car, "test color");
        //then
        assertThat(car.getColor()).isNull();
    }

    @Test
    void shouldRePaintZero(){
        //given
        Car car = new Car("random marka", "randomw wheels", null, "randoe engine", "randoe model", 5, false);
        //when
        String testColor = carService.rePaint(car, "test color");
        //then
        assertThat(car.getColor()).isNotNull();
    }

}
