package com.cg.VehicleInsurance.dao;

import com.cg.VehicleInsurance.beans.VehicleDetails;

public interface VehicleDAO {
	public VehicleDetails register(VehicleDetails vehicle);
	public VehicleDetails validityCheck(VehicleDetails vehicle);
}
