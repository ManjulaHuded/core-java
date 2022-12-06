package com.xworkz.hospitalapp.hospital;

public class Hospital {
	
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAmditted = false;
		if(isTreatmentRequired == true) {
		if(isEmergency == true) {
			this.patient =patient;
			this.patient.displayInfo();
			System.out.println("Patient can be allow to ICU ");
		}
		
		else {
			
			System.out.println(" Admit the patient in general ward ");
			//this.patient.displayInfo();
		}
		}
		else {
			System.out.println("Treatment is not required");
		}
		return isAmditted;
	}

}
