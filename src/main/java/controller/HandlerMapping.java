package controller;

import java.util.HashMap;
import java.util.Map;

import controller.board.DeleteBoardController;
import controller.board.GetBoardController;
import controller.board.GetBoardListController;
import controller.board.InsertBoardController;
import controller.board.SearchBoardController;
import controller.board.UpdateBoardController;
import controller.user.InsertUserController;
import controller.user.LoginController;
import controller.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/insertUser.do", new InsertUserController());
		mappings.put("/login.do", new LoginController());
		mappings.put("/logout.do", new LogoutController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/searchBoard.do", new SearchBoardController());
	}

	public Controller getController(String path) {
		return mappings.get(path);
	}

}