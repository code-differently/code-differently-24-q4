import './Program.scss';
import React from 'react';


interface ProgramComp {
    title: string;
    description: string;
}

export const Program: React.FC<ProgramComp> = ({title, description}) => {
  return (
    <li className="program">
        <h3>{title}</h3>
        <p>{description}</p>
    </li>
  );
};

export default Program;