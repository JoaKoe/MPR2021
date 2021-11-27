package pjatk.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.activation.DataHandler;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>
{

}
