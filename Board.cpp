#include "board.h"
#include <iostream>
using namespace std;

Board::Board(void)
{
	height = 3;
	length = 3;
}

void Board::setLength(int len)
{
	length = len;
}

void Board::setHeight(int heightIn)
{
	height = heightIn;
}

int Board::getHeight()
{
	return height;
}

int Board::getArea(void)
{
	int area;
	area = getHeight() * getLength();
	return area;
}

void Board::generateBoard(void)
{
	cout << " TICTACTOE " << endl;
	cout << "____________" << endl;
	for (int i = 0; i < getHeight(); i++)
	{
		for (int j = 0; j < getLength(); j++)
		{
			cout << "|__|";
		}
		cout << endl << "------------";
		cout << endl;
	}
}

int Board::getLength() {
	return length;
}
