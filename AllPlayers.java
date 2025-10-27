package com.abs;

abstract class Players{
	abstract void play();
	
}

class CricketPlayer extends Players{
	public void play()
	{
		System.out.println("\nThe cricket player plays cricket...");
	}	
	
}

class FootBallPlayer extends Players{
	public void play()
	{
		System.out.println("\nThe FootBall player plays football...");
	}	
	
}

class HockeyPlayer extends Players{
	public void play()
	{
		System.out.println("\nThe Hockey player plays Hockey...");
	}	
	
}
public class AllPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players p[] = {new CricketPlayer(),new FootBallPlayer(), new HockeyPlayer()};
		
		for(Players a: p)
		{
			a.play();
		}
	}

}
