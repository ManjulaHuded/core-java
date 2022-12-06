package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class HospitalTester {
	
	public static void main(String[] args) {
		
		Patient patient = new Patient("Sahana", "Rajajinagar", Gender.female, 22);
		Hospital hospital = new Hospital();
		hospital.isEmergency = true;
		hospital.isTreatmentRequired = true;
		hospital.admit(patient);
		
		Patient patientt = new Patient("Laxmi", "Nandini layout", Gender.female, 24);
		Hospital hospital2 = new Hospital();
		hospital2.isEmergency = true;
		hospital2.isTreatmentRequired = true;
		hospital2.admit(patientt);
		
		
	}

}
