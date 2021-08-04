package com.xworkz.game;

import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		
		GameDTO game=new GameDTO("Magic Tiles","8.062.003","Amanotes",3,512,true);
		
		GameService service=new GameServiceImpl();
		String value=service.validateAndSave(game);
		System.out.println(value);

	}
}


