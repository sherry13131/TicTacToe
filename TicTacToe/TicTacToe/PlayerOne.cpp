#include "PlayerOne.h"



PlayerOne::PlayerOne()
{
	Player::Player();
}


PlayerOne::~PlayerOne()
{
}

bool PlayerOne::setCross(int row, int col)
{
	bool changed = false;
	// if nothing is there, changed the status
	if (gameStatus[row][col] == 0)
	{
		gameStatus[row][col] = 'X';
		changed = true;
	}
	return changed;
}