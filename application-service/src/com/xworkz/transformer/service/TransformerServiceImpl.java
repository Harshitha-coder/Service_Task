package com.xworkz.transformer.service;

import com.xworkz.transformer.dao.TransformerDAO;
import com.xworkz.transformer.dao.TransformerDAOImpl;
import com.xworkz.transformer.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {

	private TransformerDAO dao = new TransformerDAOImpl();

	@Override
	public String validateAndSave(TransformerDTO dto) {
		boolean nameValid = false;
		boolean placeValid = false;
		boolean angryValid = false;
		boolean happyValid = false;
		boolean sadValid = false;
		boolean likeToDoValid = false;
		System.out.println(dto);
		if (dto != null) {
			System.out.println("dto is  not null,can start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 5 && name.length() <= 50) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String place = dto.getPlace();
			if (place != null && place.length() > 4 && name.length() < 20) {
				System.out.println("place is valid");
				placeValid = true;
			} else {
				System.out.println("place is invalid");
				placeValid = false;
			}
			String angry = dto.getAngry();
			if (angry != null && angry.length() > 4 && angry.length() < 12) {
				System.out.println("angry is valid");
				angryValid = true;
			} else {
				System.out.println("angry is invalid");
				angryValid = false;
			}
			String happy = dto.getHappy();
			if (happy != null && happy.length() > 4 && happy.length() < 12) {
				System.out.println("happy is valid");
				happyValid = true;
			} else {
				System.out.println("happy is invalid");
				happyValid = false;
			}
			String sad = dto.getSad();
			if (sad != null && sad.length() > 4 && sad.length() < 12) {
				System.out.println("sad is valid");
				sadValid = true;
			} else {
				System.out.println("sad is invalid");
				sadValid = false;
			}
			String likeToDo = dto.getLikeToDo();
			if (likeToDo != null && likeToDo.length() > 15 && likeToDo.length() < 315) {
				System.out.println("likeToDo is valid");
				likeToDoValid = true;
			} else {
				System.out.println("likeToDo is invalid");
				likeToDoValid = false;
			}
			if (nameValid && placeValid && angryValid && happyValid && sadValid && likeToDoValid) {
				dao.save(dto);
				System.out.println("data is valid returning success");
				return "Success";
			} else {
				System.out.println("data is invalid returning failed");
				return "Failed";
			}

		}
		System.out.println("dto is null cannot pass to dto");
		return "Failed";
	}

}
