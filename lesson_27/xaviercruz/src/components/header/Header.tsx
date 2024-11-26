import './Header.scss';
import logoImg from '@/assets/logo.png';
import React from 'react';
import {To, useNavigate} from 'react-router-dom';

export const Header: React.FC = () => {
  let navigate = useNavigate();
  const routeChange = (path: To) => {
    navigate(path);
  };

  return (
    <header className="header">
      <div className="header-logo">
        <a href="/">
          <img src={logoImg} alt="Code Differently Logo" />
        </a>
      </div>
      <ul className="header-top-menu">
        <li>
          <a href="/">Home</a>
        </li>
        <li>
          <a href="#">About</a>
        </li>
        <li>
          <a href="#">Contact</a>
        </li>
        <button onClick={() => routeChange('/programs')} className="add-button">
          Add a Program
        </button>
      </ul>
      <div className="header-cta">
        <a className="sign-up-button" href="#">
          Sign Up
        </a>
      </div>
    </header>
  );
};
