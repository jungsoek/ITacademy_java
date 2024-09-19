import logo from './logo.svg';
import './App.css';
import React, {useState} from "react";
import './Todo.js';
import {Container, List, Paper} from "@mui/material";
import AddTodo from './AppTodo.js';

const Todo = (props) => {
  const [item, setItem] = useState(props.item);

  return (
    <div className='Todo'>
      <input
        type='checkbox'
        id={item.id}
        name='{item.id}'
        checked={item.done}></input>
        <label id='{item.id}'>{item.title}</label>
    </div>
  )
}

class App extends React.Component {
  render() {
    return (
      <div className='App'>
        <header className='App-header'>
          <img src={logo} className="App-logo" alt='logo'/>
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className='App-link'
            href='https://reactjs.org'
            target='_blank'
            rel='noopener noreferrer'
          >
            Learn React
          </a>
        </header>
      </div>
    )
  }
}

export default App;
