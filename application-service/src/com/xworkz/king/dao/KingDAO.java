package com.xworkz.king.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.king.dto.KingDTO;

public interface KingDAO {

	boolean save(KingDTO dto);

	Collection<KingDTO> findByRegion(Predicate<KingDTO> search);
	
	Optional<KingDTO> findOneByName(Predicate<KingDTO> search);
	
	Collection<KingDTO> findByNameLike(Predicate<KingDTO> search);
}
