import logo from './logo.svg';
import './App.css';
import Parent from './props_drilling/Parent';
import {UserProvider} from './props_drilling/UserContext'
import { useContext } from 'react';
import { ThemeContext } from './theme/ThemeContext';
import {ThemeSwitcher} from './theme/ThemeSwitch';

function App() {
  
  return (
    <div className="App">
      <UserProvider>
        <Parent />
      </UserProvider>

      <h1>{isDarkMode}</h1>
    </div>
  );
}

export default App;
