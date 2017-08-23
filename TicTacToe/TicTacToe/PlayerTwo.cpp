#include "PlayerTwo.h"



PlayerTwo::PlayerTwo()
{
	Player::Player();
}


PlayerTwo::~PlayerTwo()
{
}

bool PlayerTwo::setCircle(int row, int col)
{
	bool changed = false;
	// if nothing is there, changed the status
	if (gameStatus[row][col] == 0)
	{
		gameStatus[row][col] = 'O';
		changed = true;
	}
	return changed;
}