package ex03;

public class Unit {
	int x, y;
	void move(int x, int y) {};
	void stop() {};
}

class Marine {// 보병
    void stimPack() { /* 스팀팩을 사용한다.*/}
}

class Tank { // 탱크
    void changeMode() { /* 공격모드를 변환한다. */}
}

class Dropship { // 수송선
    void load() { /* 선택된 대상을 태운다.*/ }
    void unload() { /* 선택된 대상을 내린다..*/ }
}
