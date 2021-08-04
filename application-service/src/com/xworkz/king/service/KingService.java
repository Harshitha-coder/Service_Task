package com.xworkz.king.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.king.dto.KingDTO;

public interface KingService {

	String validateAndSave(KingDTO dto);

	Collection<KingDTO> validateAndFindByRegion(Predicate<KingDTO> search);
	
	Optional<KingDTO> validateAndfindOneByName(Predicate<KingDTO> search);
	
	Collection<KingDTO> validateAndfindByNameLike(Predicate<KingDTO> search);
}
