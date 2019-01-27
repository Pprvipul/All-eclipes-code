package com.army.hibernate;

import com.army.hibernate.dao.ArmyDAO;
import com.army.hibernate.dto.ArmyDTO;

public class ArmyTester {

	public static void main(String[] args) {
		ArmyDTO dto = new ArmyDTO();
		dto.setAid(1);
		dto.setCountry("India");
		dto.setType("Black commando");
		dto.setTotalarmysize(100);
		
		System.out.println(dto);

		ArmyDAO dao = new ArmyDAO();
		dao.save(dto);

	}

}
