class Board
{
public:
	void setLength(int len);
	void setHeight(int heightIn);
	int getLength(void);
	int getHeight(void);
	int getArea(void);
	void generateBoard(void);
	Board();
private:
	int length;
	int height;
};