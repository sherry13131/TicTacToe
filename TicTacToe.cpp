# include <iostream>
# include "Board.h"

using namespace std;

bool welcome();

int main() {
	bool first;
	// show welcome message and get who will go first
	first = welcome();
	// generate the initial board
	Board board;
	board.generateBoard();	
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
		cout << "OK! you start first."<< endl;
		return true;
	}
	else
	{
		cout << "Yes! I will be the first one." << endl;
		return false;
	}
}