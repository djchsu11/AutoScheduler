package com.AutoScheduler.Repository.Interface;

import com.AutoScheduler.Domain.*;
import java.util.List;
import java.util.ArrayList;

public interface IPatientList {
	
	List<Patient> patientList=new ArrayList<Patient>();
	
	public List<Patient> getListOfPatients();

}
