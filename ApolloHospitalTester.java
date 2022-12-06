package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class ApolloHospitalTester {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		
		ApolloHospital apolloHospital = new ApolloHospital(size);
		
		for(int i=0;i<size;i++) {
		Patient patient = new Patient();
		System.out.println("Enter the patient name");
		patient.setPatientName(scanner.next());
		
		System.out.println("Enter the patient address");
		patient.setAddress(scanner.next()); 
		
		System.out.println("Enter the patient age");
		patient.setAge(scanner.nextInt());
		
		System.out.println("Enter the patinet Gender");
//		String gender = scanner.next();
		patient.setGender(Gender.valueOf(scanner.next()));
		
		apolloHospital.addPatient(patient);
		}
		
		apolloHospital.getAllPatients();
		
		System.out.println("Enter the patient name");
		apolloHospital.getPatientByName(scanner.next());
		
		System.out.println("Enter the patient address");
		apolloHospital.getPatientByAddress(scanner.next());
		
		System.out.println("Enter the gender");
		apolloHospital.getPatientByGender(Gender.valueOf(scanner.next()));
		
		System.out.println("Enter the patient age");
		apolloHospital.getPatientByAge(scanner.nextInt());
		
		System.out.println("Enter your patinet gender ");
		apolloHospital.getPatientNameByGender(Gender.valueOf(scanner.next()));
		
		System.out.println("Enter your patient name");
		apolloHospital.getGenderByPatientName(scanner.next());
		
		
		
		
		scanner.close();
	}

}
