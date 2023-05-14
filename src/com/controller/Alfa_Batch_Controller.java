package com.controller;

import java.util.List;

import com.dao.Alfa_Batch_Dao;
import com.entity.Alfa_Batch;
import com.service.Alfa_Batch_Service;

public class Alfa_Batch_Controller {

	public void getalfa() {
		Alfa_Batch_Service s = new Alfa_Batch_Service();
		Alfa_Batch getalfa = s.getalfa();

		System.out.println(getalfa);
	}

	// Next method to the Update the record
	public void updateAlfa_Batch_Record() {
		Alfa_Batch a = new Alfa_Batch();
		a.setId(2);
		a.setName("Kartikey");
		a.setSalary("215478");

		Alfa_Batch_Service ss = new Alfa_Batch_Service();
		boolean check = ss.updateAlfa_Batch_Record(a);
		System.out.println(check);
	}

	// Data insert in database
	
	public void insert_Record()
	{
		Alfa_Batch new_obj = new Alfa_Batch();
		new_obj.setId(4);
		new_obj.setName("Krushna Appa Beriya ");
		new_obj.setSalary("1000000");

		Alfa_Batch_Service new_service = new Alfa_Batch_Service();
		boolean check = new_service.insert_Record(new_obj);
		System.out.println(check);
		
	}
	
	// Filter data collect
	
	public void getFilter_Alfa_Batch()
	{
		Alfa_Batch_Service filter_service = new Alfa_Batch_Service();
		List<Alfa_Batch> filter_Alfa_Batch = filter_service.getFilter_Alfa_Batch();
		System.out.println(filter_Alfa_Batch);
	}
	
	public static void main(String[] args) {
		Alfa_Batch_Controller obj = new Alfa_Batch_Controller();
		//obj.getalfa();
		//obj.updateAlfa_Batch_Record();
		//obj.insert_Record();
		obj.getFilter_Alfa_Batch();
	}

}
