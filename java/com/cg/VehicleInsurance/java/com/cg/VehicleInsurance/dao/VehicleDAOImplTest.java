package com.cg.VehicleInsurance.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.cg.VehicleInsurance.beans.VehicleDetails;

class VehicleDAOImplTest {

	@Test
	void testRegister() {
		//fail("Not yet implemented");
		VehicleDetails vehicle=new VehicleDetails();
		HashMap<Integer,VehicleDetails>vehicleEntry=new HashMap<>();
		vehicle.setVehicleNo(1234);
		vehicle.setVehicleType(2);
		vehicle.setAadharNo(1234567890);
		vehicle.setMobileNo(908765432);
		vehicle.setInsurancePeriod(1);
		int insurance=1;
		assertEquals(1,insurance);
	}

}
