# include <iostream>
# include <string>
# include <stdio.h>
# include "PlayerOne.h"
# include "PlayerTwo.h"
# include "Board.h"

using namespace std;

bool welcome();
int start();
bool check_move(string move);

int main() {
	bool first;
	// show welcome message and get who will go first
	first = welcome();
	// generate the initial board
	Board board;
	PlayerOne player1;
	PlayerTwo player2;
	board.generateBoard();
	// play game
	//int winner = start();
}

bool welcome()
{
	char first;
	cout << "Welcome to Tic Tac Toe Game." << endl;
	cout << "GO first? (y/n)" << endl;
	cin >> first;
	while ((first != 'y') && (first != 'n'))
	{
		cout << "Please enter y (yes) or n (no).";
		cout << "Go first? (y/n)";
		cin >> first;
	}
	if (first == 'y')
	{
		cout << "OK! you will start first."<< endl;
		return true;
	}
	else
	{
		cout << "Yes! I will be the first one." << endl;
		return false;
	}
}

int start()
{
	// get the input from the first player
	string move;
	bool valid = false;
	cout << "player1 - input your move (row col): ";
	cin >> move;
	valid = check_move(move);
}

bool check_move(string move)
{
	bool validFormat = false;
	char *cmove = new char[move.size() + 1];
	cmove[move.size()] = 0;
	memcpy(cmove, move.c_str(), move.size());
	cmove[move.copy(cmove, sizeof(cmove) - 1)] = '\0';
	// basic string structure check
	if (cmove[3] == '\0' || cmove[1] == ' ')
	{
		// check boxes valid
		char row = cmove[0];
		char col = cmove[2];
		if (row > 48 && row < 52)
		{
			if (col > 48 && row < 52)
			{
				validFormat = true;
			}
		}

		// if format is true, check no element there
		if (validFormat)
		{
			
		}
	}
}