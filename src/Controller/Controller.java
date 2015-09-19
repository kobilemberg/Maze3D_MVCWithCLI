package Controller;

import java.util.HashMap;

import algorithms.mazeGenerators.Maze3d;

public interface Controller {
	HashMap<String, Maze3d> maze3dMap = new HashMap<String, Maze3d>();

	public void mazeIsReady(String name);

	public void solutionIsReady(String mazeName);

	public void errorNoticeToViewr(String s);

	

	
	
	//public Controller(Model model,View view);

}
