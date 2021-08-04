package com.xworkz.king.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.king.dto.KingDTO;

public class KingDAOImpl implements KingDAO {

	private Collection<KingDTO> collection = new ArrayList<KingDTO>();

	@Override
	public boolean save(KingDTO dto) {
		return this.collection.add(dto);
	}

	@Override
	public Collection<KingDTO> findByRegion(Predicate<KingDTO> search) {

		return this.collection.stream().filter((a) -> search.test(a)).collect(Collectors.toList());
	}
	
	@Override
	public Optional<KingDTO> findOneByName(Predicate<KingDTO> search) {
		
		return this.collection.stream().filter((s)->search.test(s)).findFirst();
	}
	
	@Override
	public Collection<KingDTO> findByNameLike(Predicate<KingDTO> search) {
		
		return this.collection.stream().filter((g)->search.test(g)).collect(Collectors.toList());
	}
}
