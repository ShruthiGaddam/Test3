package com.cg.VehicleInsurance.service;

import com.cg.VehicleInsurance.beans.VehicleDetails;

public interface VehicleService {
	public VehicleDetails register(VehicleDetails vehicle);
	public VehicleDetails validityCheck(VehicleDetails vehicle);
	public boolean isValidAadhar(VehicleDetails vehicle);
	public boolean isValidMobile(VehicleDetails vehicle);
}
