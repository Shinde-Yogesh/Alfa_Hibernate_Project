package com.service;

import java.util.List;

import com.dao.Alfa_Batch_Dao;
import com.entity.Alfa_Batch;

public class Alfa_Batch_Service {

	public Alfa_Batch getalfa() {
		Alfa_Batch_Dao dd = new Alfa_Batch_Dao();
		Alfa_Batch alfa = dd.getalfa();

		return alfa;
	}

	public boolean updateAlfa_Batch_Record(Alfa_Batch a) {
		Alfa_Batch_Dao dao = new Alfa_Batch_Dao();
		return dao.updateAlfa_Batch_Record(a);

	}

	public boolean insert_Record(Alfa_Batch new_obj) {
		Alfa_Batch_Dao obj = new Alfa_Batch_Dao();
		return obj.insert_Record(new_obj);
	}

	public List<Alfa_Batch> getFilter_Alfa_Batch() {
		Alfa_Batch_Dao dao_filter = new Alfa_Batch_Dao();
		return dao_filter.getFilter_Alfa_Batch();
	}
}
