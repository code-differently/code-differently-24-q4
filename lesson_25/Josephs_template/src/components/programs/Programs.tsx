import React from 'react';
import './Programs.scss';

interface ProgramProps {
  title: string;
  description: string;
}

export const Programs: React.FC<ProgramProps> = ({title, description}) => {
  return (
    <>
      <li className="program">
        <h3>{title}</h3>
        <p>{description}</p>
      </li>
    </>
  );
};