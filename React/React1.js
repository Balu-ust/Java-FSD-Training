import logo from './logo.svg';
import './App.css';
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

function App() {
  return (
    <div>
      <Welcome name="Saha" />
      <Welcome name="Cahal" />
      <Welcome name="Edite" />
    </div>
  );
}






export default App;
