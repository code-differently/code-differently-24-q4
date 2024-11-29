import React from 'react';
import './Program.scss';

interface ProgramProps {
  title: string;
  description: string;
}

export const Program: React.FC<ProgramProps> = ({ title, description }) => (
  <li className="program">
    <h3>{title}</h3>
    <p>{description}</p>
  </li>
);

export default Program;