package com.example.CarManagement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class CarService{
    @Autowired
    private CarRepository carRep;
    public List<Car> listAll(){
        return carRep.findAll();
    }
    public void save(Car car){
        carRep.save(car);
    }
    public Car get(long id){
        return carRep.findById(id).get();
    }
    public void delete(long id){
        carRep.deleteById(id);
    }
}