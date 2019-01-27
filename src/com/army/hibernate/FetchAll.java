package com.army.hibernate;

import java.util.Iterator;
import java.util.List;

import com.army.hibernate.dao.ArmyDAO;
import com.army.hibernate.dto.ArmyDTO;

public class FetchAll {

	public static void main(String[] args) {
		ArmyDAO ad = new ArmyDAO();
		List<ArmyDTO> dto = ad.fetchAll();

		for (Iterator iterator = dto.iterator(); iterator.hasNext();) {
			System.out.println("Pizza's from db " + iterator.next().toString());
		}

	}
	
		

	

}
