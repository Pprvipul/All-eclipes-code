package com.army.hibernate;

import com.army.hibernate.dao.ArmyDAO;
import com.army.hibernate.dto.ArmyDTO;

public class LoadArmytotalsize {

	public static void main(String[] args) {
		ArmyDAO ad=new ArmyDAO();
		ArmyDTO ad1=ad.loadbytotalarmysize(200);
		System.out.println(ad1);

	}

}
