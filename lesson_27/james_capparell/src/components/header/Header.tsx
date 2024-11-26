import './Header.scss';
import logoImg from '@/assets/logo.png';
import React from 'react';

export const Header: React.FC = () => {
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
          <a href="#">About<br></br>Us</a>
        </li>
        <li>
          <a href="#">Contact<br></br>Us</a>
        </li>
        <li>
          <a href="/add_program">Add<br></br>Program</a>
        </li>
      </ul>
      <div className="header-cta">
        <a className="sign-up-button" href="#">
          Sign Up
        </a>
      </div>
    </header>
  );
};
