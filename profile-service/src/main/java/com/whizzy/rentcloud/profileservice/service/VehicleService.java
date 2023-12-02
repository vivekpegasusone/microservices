package com.whizzy.rentcloud.profileservice.service;

import com.whizzy.rentcloud.commons.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle vehicle);
    Vehicle fetchById(int id);
    List<Vehicle> fetchAllVehicles();
}
