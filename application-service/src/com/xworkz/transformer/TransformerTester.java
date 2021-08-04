package com.xworkz.transformer;

import com.xworkz.transformer.constants.CharacterType;
import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.service.TransformerService;
import com.xworkz.transformer.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		
		TransformerDTO value=new TransformerDTO("Harshitha", "Chickballapur", CharacterType.COURGEOUS, "When Someone Irritates Me","When my parents are happy","When my mobile charging gets over","i like to spend time with my favourite people");
	
		TransformerService service=new TransformerServiceImpl();
		String data=service.validateAndSave(value);
		System.out.println(data);
	}

}
