

console.log(typeof(32));

console.log('abc' + 'def');

// 문자열 관련 메서드
console.log('text'.length);

// 문자열이 특정 문자로 시작하는지 검사
console.log('text'.startsWith('te'));

// Boolean(불리언)
// 참과 거짓을 표현하기 위해 사용
// true -> 1
// false -> 0
console.log(true + 1);
console.log(false + 1);

// undefined
// 데이터가 입력될 수 있는 공간임에도 불구하고 비어있다.
let i;
console.log(i);

// 타입캐스팅
// 데이터 타입의 종류를 바꾸는 행위
console.log(typeof(String(3)) + 1);

// Number()
console.log(String(3) + 1);
console.log(Number(false));
console.log(Number("abc"));

// Boolean()
console.log(Boolean(0));

// 인덱싱과 슬라이싱
// index : 0부터 순차적으로 증가하는 정수값
// 인덱싱은 데이터를 분석하여 우리가 원하는 순서에 위치한 데이터를 어쩌구
console.log("abcde"[2]);

// 슬라이싱
// 여러개의 값으로 자르고 싶다면 slice
console.log("abcdefgh".slice(3, 5));
