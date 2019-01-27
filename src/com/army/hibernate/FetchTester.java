package com.army.hibernate;

import com.army.hibernate.dao.ArmyDAO;
import com.army.hibernate.dto.ArmyDTO;

public class FetchTester {

	public static void main(String[] args) {
		ArmyDAO ad=new ArmyDAO();
		ArmyDTO ad1=ad.fetchbyaid(4);
		System.out.println(ad1);
		System.out.println("data is suscessfull fetched");
	}

}
