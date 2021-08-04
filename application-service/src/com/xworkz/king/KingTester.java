package com.xworkz.king;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.king.dto.KingDTO;
import com.xworkz.king.service.KingService;
import com.xworkz.king.service.KingServiceImpl;

public class KingTester {

	public static void main(String[] args) {

		KingDTO king1 = new KingDTO("Vikramadithya", "Buddism", "Chalukyas of Kalyana", 32, "Kethaladevi", 5);
		KingDTO king2 = new KingDTO("Krishna Raja Wadiyar", "Hinduism", "Mysore Wodeyars", 31, "Kumari Ammani", 6);
		KingDTO king3 = new KingDTO("Pulakeshi", "Jainism", "Chalukya", 33, "Kritivarma", 4);
		KingDTO king4 = new KingDTO("Yaduraya Wadiyar", "Hinduism", "Mysore Wodeyars", 34, "Trishika Kumari Devi", 5);

		KingService service = new KingServiceImpl();
		service.validateAndSave(king4);
		service.validateAndSave(king2);
		service.validateAndSave(king3);
		service.validateAndSave(king1);

		Collection<KingDTO> collection = service.validateAndFindByRegion((s) -> s.getRegion().equals("Hinduism"));
		for (KingDTO kingDTO : collection) {
			System.out.println("found by region:" + kingDTO);
		}

		Optional<KingDTO> optional = service.validateAndfindOneByName((b) -> b.getName().equals("Vikramadithya"));
		if (optional.isPresent()) {
			KingDTO dto = optional.get();
			System.out.println("found by name:" + dto);
		}

		Collection<KingDTO> collection1 = service.validateAndfindByNameLike((s) -> s.getName().contains("Wadiyar"));
		for (KingDTO kingDTO : collection1) {
			System.out.println("found by name like:" + kingDTO);
		}

	}

}
