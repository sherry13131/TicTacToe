#pragma once
class Player
{
public:
	Player();
	~Player();
	virtual bool setCross(int row, int col);
	virtual bool setCircle(int row, int col);
protected:
	static char gameStatus[3][3];
};

