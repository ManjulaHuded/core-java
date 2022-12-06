package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;

public class ApolloHospital extends Hospital {

	 //one to many
	public Patient[] patients;
	int index;
	
	public ApolloHospital(int size) {
		patients = new Patient[size];
	}
	
	public boolean addPatient(Patient patient) {
	System.out.println("Inside addPatinet method");
    boolean isPatientAdded = false;
	if(patient != null) {
		System.out.println("Patient Details are right...go head");
		patients[index++] = patient;
		isPatientAdded = true;
		//index++;
	}
	return isPatientAdded;
	}
	public void getAllPatients() {
		System.out.println("The list of Patients");
		for (int i = 0; i < patients.length; i++) {
			System.out.println( patients[i].getPatientName() +" " + patients[i].getAddress() 
					+ " " + patients[i].getAge() + " " + patients[i].getGender());
		}
	}
	public void getPatientByName(String patientName) {
		System.out.println("Inside getPatientByName");
		System.out.println("No of parameter : 1 : patientName ");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println( patients[i].getPatientName() +" " +
			patients[i].getAddress() 
						+ " " + patients[i].getAge() + " " + patients[i].getGender());
			}else {
				System.out.println("No patient found");
			}
			}
	}
	
	public void getPatientByAddress(String address) {
		System.out.println("Inside getPatientByAddress ");
		System.out.println("No of parameter :1:address");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAddress().equals(address)) {
				System.out.println( patients[i].getPatientName() +" " +
			patients[i].getAddress() 
						+ " " + patients[i].getAge() + " " + patients[i].getGender());
			}else {
				System.out.println("Patient address not found");
			}
			
		}
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("Inside getPatientByGender");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println( patients[i].getPatientName() +" " +
						patients[i].getAddress() 
				+ " " + patients[i].getAge() + " " + patients[i].getGender());
			}
		}
	}
	
	public void getPatientByAge(int age) {
		System.out.println("Inside getPatientByAge ");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getAge()==age) {
				System.out.println( patients[i].getPatientName() +" " +
						patients[i].getAddress() 
				+ " " + patients[i].getAge() + " " + patients[i].getGender());
			}
		}
	}
	
	public void getPatientNameByGender(Gender gender) {
		System.out.println("Inside getPatientNameByGender");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println( patients[i].getPatientName());
			}
		}
	}
	
	public void getGenderByPatientName(String patientName) {
		System.out.println("Inside getGenderByPatientName");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getGender());
			}else {
				System.out.println("No patient found");
			}
			}
	}
}

