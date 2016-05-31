package com.AutoScheduler.Repository.Interface;

import com.AutoScheduler.Domain.*;
import java.util.List;
import java.util.ArrayList;

public interface ITherapistList {
	List <Therapist> therapistList = new ArrayList<Therapist>();
	
	public List<Therapist> getListOfTherapists();
}
