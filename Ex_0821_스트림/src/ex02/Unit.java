package ex02;

public class Unit {
	int x, y;
	void move(int x, int y) {};
	void stop() {};
}

class Marine extends Unit {
	
	void stimPack() {}
}

class Tank extends Unit {
	
	void changeMode() {}
}

class Dropship extends Unit {

	void loading() {}
	void landing() {}
}


