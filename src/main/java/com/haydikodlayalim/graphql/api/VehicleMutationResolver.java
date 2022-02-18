package com.haydikodlayalim.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.haydikodlayalim.graphql.dto.VehicleDto;
import com.haydikodlayalim.graphql.entity.Vehicle;
import com.haydikodlayalim.graphql.repo.VehicleRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }
    Random random = new Random();
    private Vehicle dtoToEntity(VehicleDto vehicleDto) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(vehicleDto.getBrand());
        vehicle.setBrandId(random.nextLong());
        vehicle.setModel(vehicleDto.getModel());
        vehicle.setModelId(random.nextLong());
        vehicle.setBodyType(vehicleDto.getBodyType());
        vehicle.setBodyTypeId(random.nextLong());
        vehicle.setTransmissionType(vehicleDto.getTransmissionType());
        vehicle.setTransmissionTypeId(random.nextLong());
        vehicle.setFuelType(vehicle.getFuelType());
        vehicle.setFuelTypeId(random.nextLong());
        vehicle.setVersion("v1");
        vehicle.setVersionId(random.nextLong());
        vehicle.setKm(random.nextInt());
        vehicle.setCreatedAt(LocalDateTime.now().toString());
        vehicle.setApiUser(vehicleDto.getApiUser());
        vehicle.setCompanyId(random.nextLong());
        vehicle.setRetailPrice(random.nextInt());
        vehicle.setQuickSellPrice(random.nextInt());
        vehicle.setAboveMarketPrice(random.nextInt());
        vehicle.setGalleryPriceUp(random.nextInt());
        vehicle.setGalleryPriceDown(random.nextInt());
        vehicle.setClientIp(String.valueOf(random.nextInt()));
        vehicle.setDuration(random.nextLong());
        vehicle.setStatusCode(random.nextInt(100)+400);
        vehicle.setStatusDesc("ok");
        vehicle.setPricingDate(LocalDateTime.now().toString());
        vehicle.setColor(vehicle.getColor());
        vehicle.setCity(vehicle.getCity());
        vehicle.setUserType(vehicleDto.getUserType());
        vehicle.setUserId(random.nextLong());
        vehicle.setSource("smart");

        return vehicle;
    }
}
