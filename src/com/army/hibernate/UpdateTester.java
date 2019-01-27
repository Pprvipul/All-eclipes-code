package com.army.hibernate;

import com.army.hibernate.dao.ArmyDAO;

public class UpdateTester {

	public static void main(String[] args) {
		ArmyDAO ad=new ArmyDAO();
		ad.updateTotalArmySizebyAid(2, 8000);
		System.out.println(ad);
		System.out.println("upadate suscassfully");

	}

}
