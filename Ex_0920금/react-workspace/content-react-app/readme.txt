Context API로 다크모드 상태 관리하기
- React의 Context API를 사용하여 다크 모드(Dark Mode)를 구현하세요.
- 사용자는 라이트 모드와 다크 모드를 전환할 수 있어야 하며, 선택된 테마에 따라 화면의 스타일이 변경됩니다.

참고) https://legacy.reactjs.org/docs/context.html

<<요구 사항>>
1. ThemeContext를 생성하여, 전역적으로 다크 모드 상태를 관리하세요.
2. ThemeProvider 컴포넌트를 만들어, 전역적으로 테마 상태를 관리하고 이를 하위 컴포넌트에 제공하세요.
3. ThemeSwitcher 컴포넌트를 만들어, 사용자가 다크 모드와 라이트 모드를 전환할 수 있게 하세요.
4. App 컴포넌트의 배경색과 텍스트 색상을 다크 모드/라이트 모드에 맞게 변경하세요.
style={{
   backgroundColor: isDarkMode ? '#333' : '#fff',
   color: isDarkMode ? '#fff' : '#000',
   height: '100vh',
   display: 'flex',
   justifyContent: 'center',
   alignItems: 'center',
}}	