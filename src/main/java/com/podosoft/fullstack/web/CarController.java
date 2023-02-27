package com.podosoft.fullstack.web;

import com.podosoft.fullstack.domain.Car;
import com.podosoft.fullstack.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://master.d12kuolwha0gii.amplifyapp.com/")
public class CarController {

    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        return repository.findAll();
    }

}
