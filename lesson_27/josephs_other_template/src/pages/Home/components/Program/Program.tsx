import './Program.scss';
import React from 'react';

export interface ProgramProps {
  title: string;
  description: string;
}

export const Program: React.FC<ProgramProps> = ({title, description}: ProgramProps) => {
    return (<li className="program">
        <h3>{title}</h3>
        {description}
      </li>);
};