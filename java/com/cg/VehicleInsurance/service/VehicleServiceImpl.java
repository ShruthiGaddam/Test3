package com.cg.VehicleInsurance.service;

import com.cg.VehicleInsurance.beans.VehicleDetails;
import com.cg.VehicleInsurance.dao.VehicleDAO;
import com.cg.VehicleInsurance.dao.VehicleDAOImpl;

public class VehicleServiceImpl implements VehicleService{
	VehicleDAO vehicledao=new VehicleDAOImpl();
	public boolean isValidAadhar(VehicleDetails vehicle) {
		if(Long.toString(vehicle.getAadharNo()).length()!=12) {
			return true;
		}
		else
		return false;
	}
	public boolean isValidMobile(VehicleDetails vehicle) {
		if(Long.toString(vehicle.getMobileNo()).length()!=10) {
			return true;
		}
		else
		return false;
	}
	public VehicleDetails register(VehicleDetails vehicle) {
		return vehicledao.register(vehicle);
	}
	public VehicleDetails validityCheck(VehicleDetails vehicle) {
		return vehicledao.validityCheck(vehicle);
	}

}
