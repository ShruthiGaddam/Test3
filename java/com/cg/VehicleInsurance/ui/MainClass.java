package com.cg.VehicleInsurance.ui;

import java.util.Scanner;

import com.cg.VehicleInsurance.beans.VehicleDetails;
import com.cg.VehicleInsurance.exception.InvalidAadharException;
import com.cg.VehicleInsurance.exception.InvalidMobileNoException;
import com.cg.VehicleInsurance.service.VehicleService;
import com.cg.VehicleInsurance.service.VehicleServiceImpl;

public class MainClass {
	static Scanner sc=new Scanner(System.in);
	static VehicleDetails vehicle=new VehicleDetails();
	static VehicleService service=new VehicleServiceImpl();
	public static void main(String[] args) {
		System.out.println("1) Vehicle Insurance Registration \n 2) Insurance Validity Check \n 3) Exit");
		while(true) {
			int ch=sc.nextInt();
			switch(ch) {
			case 1: System.out.println("enter vehicle no");
			 		vehicle.setVehicleNo(sc.nextInt());
			 		System.out.println("enter vehicle type");
			 		vehicle.setVehicleType(sc.nextInt());
			 		System.out.println("enter insurance period");
			 		vehicle.setInsurancePeriod(sc.nextInt());
			 		System.out.println("enter aadhar no");
			 		vehicle.setAadharNo(sc.nextLong());
			 		if(service.isValidAadhar(vehicle)) {
			 			try {
							throw new InvalidAadharException();
						} catch (InvalidAadharException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 		}
			 		System.out.println("enter mobile no");
			 		vehicle.setMobileNo(sc.nextLong());
			 		vehicle.setAadharNo(sc.nextLong());
			 		if(service.isValidMobile(vehicle)) {
			 			try {
							throw new InvalidMobileNoException();
						} catch (InvalidMobileNoException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 		}
			 		VehicleDetails details=service.register(vehicle);
			 		System.out.println("vehicle registered successfully");
			 		break;
			case 2: System.out.println("enter vehicle no");
					int vehicleNo=sc.nextInt();
					VehicleDetails details1=service.validityCheck(vehicle);
					System.out.println(details1.getInsurancePeriod());
					System.out.println(details1.getDateOfRenewal());
			}
		}

	}

}
