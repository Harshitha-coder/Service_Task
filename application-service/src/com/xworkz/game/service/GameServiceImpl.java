package com.xworkz.game.service;

import com.xworkz.game.dao.GameDAO;
import com.xworkz.game.dao.GameDAOImpl;
import com.xworkz.game.dto.GameDTO;

public class GameServiceImpl implements GameService {

	private GameDAO dao = new GameDAOImpl();

	@Override
	public String validateAndSave(GameDTO dto) {
		boolean nameValid = false;
		boolean versionValid = false;
		boolean developedByValid = false;
		boolean maxPlayersValid = false;
		boolean memoryRequiredValid = false;
		System.out.println(dto);

		if (dto != null) {
			System.out.println("dto is  not null,can start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 15) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String version = dto.getVersion();
			if (version != null && version.length() > 1 && name.length() < 50) {
				System.out.println("version is valid");
				versionValid = true;
			} else {
				System.out.println("version is invalid");
				versionValid = false;
			}
			String developedBy = dto.getDevelopedBy();
			if (developedBy.length() > 3 && developedBy.length() < 15) {
				System.out.println("developedBy is valid");
				developedByValid = true;
			} else {
				System.out.println("developedBy is invalid");
				developedByValid = false;
			}
			int maxPlayers = dto.getMaxPlayers();
			if (maxPlayers > 1 && maxPlayers < 8) {
				System.out.println("maxPlayers is valid");
				maxPlayersValid = true;
			} else {
				System.out.println("maxPlayers is invalid");
				maxPlayersValid = false;
			}
			double memoryRequired = dto.getMemoryRequired();
			if (memoryRequired > 500 && memoryRequired < 500000) {
				System.out.println("memoryRequired is valid");
				memoryRequiredValid = true;
			} else {
				System.out.println("memoryRequired is invalid");
				memoryRequiredValid = false;
			}
			if (nameValid && versionValid && developedByValid && maxPlayersValid && memoryRequiredValid) {
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
