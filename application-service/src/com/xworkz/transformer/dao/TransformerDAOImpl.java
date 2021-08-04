package com.xworkz.transformer.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.transformer.dto.TransformerDTO;

public class TransformerDAOImpl implements TransformerDAO {

	private Collection<TransformerDTO> coll = new ArrayList<TransformerDTO>();

	@Override
	public boolean save(TransformerDTO dto) {

		System.out.println("invoked save in dao");
		System.out.println(dto.hashCode());
		return this.coll.add(dto);
	}

}
