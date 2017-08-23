#include "Player.h"

#pragma once
class PlayerOne : public Player
{
public:
	PlayerOne();
	~PlayerOne();
	bool setCross(int row, int col);
};

