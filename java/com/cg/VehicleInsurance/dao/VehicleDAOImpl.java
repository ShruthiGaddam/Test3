package com.cg.VehicleInsurance.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.cg.VehicleInsurance.beans.VehicleDetails;
public class VehicleDAOImpl implements VehicleDAO {
	HashMap<Integer,VehicleDetails>vehicleEntry;
		public VehicleDetails register(VehicleDetails vehicle) {
			vehicleEntry=new HashMap<Integer, VehicleDetails>();
			int vehicleNo=vehicle.getVehicleNo();
			int vehicleType=vehicle.getVehicleType();
			int insurancePeriod=vehicle.getInsurancePeriod();
			LocalDate time=LocalDate.now();
			String dateOfReg=vehicle.setDateOfReg(time.toString());
			String dateOfRenewal=vehicle.setDateOfRenewal(dateOfReg.concat(Integer.toString(insurancePeriod)));
			long aadhar=vehicle.getAadharNo();
			long mobile=vehicle.getMobileNo();
			for(Map.Entry m: vehicleEntry.entrySet()) {
				vehicle=((HashMap<Integer, VehicleDetails>) m).put(vehicleNo,new VehicleDetails(vehicleType,insurancePeriod,aadhar,mobile,dateOfReg,dateOfRenewal));
		}
		return vehicle;
	}

		public VehicleDetails validityCheck(VehicleDetails vehicle) {
			int vehicleNo=vehicle.getVehicleNo();
			for(Map.Entry m: vehicleEntry.entrySet()) {
				if(m.getKey().equals(vehicleNo)){
					int insurancePeriod=vehicle.getInsurancePeriod();
					String dateOfRenewal=vehicle.getDateOfRenewal();
				}
			}
			return vehicle;
		}

}
