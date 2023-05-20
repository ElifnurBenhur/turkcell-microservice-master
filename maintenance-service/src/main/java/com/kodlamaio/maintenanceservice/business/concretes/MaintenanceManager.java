package com.kodlamaio.maintenanceservice.business.concretes;

import com.kodlamaio.maintenanceservice.business.abstracts.MaintenanceService;
import com.kodlamaio.maintenanceservice.business.dto.requests.create.CreateMaintenanceRequest;
import com.kodlamaio.maintenanceservice.business.dto.requests.update.UpdateMaintenanceRequest;
import com.kodlamaio.maintenanceservice.business.dto.responses.create.CreateMaintenanceResponse;
import com.kodlamaio.maintenanceservice.business.dto.responses.get.GetAllMaintenancesResponse;
import com.kodlamaio.maintenanceservice.business.dto.responses.get.GetMaintenanceResponse;
import com.kodlamaio.maintenanceservice.business.dto.responses.update.UpdateMaintenanceResponse;

import java.util.List;
import java.util.UUID;

public class MaintenanceManager implements MaintenanceService {
    @Override
    public List<GetAllMaintenancesResponse> getAll() {
        return null;
    }

    @Override
    public GetMaintenanceResponse getById(UUID id) {
        return null;
    }

    @Override
    public GetMaintenanceResponse returnCarFromMaintenance(UUID carId) {
        return null;
    }

    @Override
    public CreateMaintenanceResponse add(CreateMaintenanceRequest request) {
        return null;
    }

    @Override
    public UpdateMaintenanceResponse update(UUID id, UpdateMaintenanceRequest request) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
