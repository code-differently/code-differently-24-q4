import './ProgramList.scss';
import React, {useEffect, useState} from 'react';

import {Program} from '../Program';

export const ProgramList: React.FC = () => {
  const [programs, setPrograms] = useState<{id: number; title: string; description: string}[] | null>(null);

  useEffect(() => {
    fetch('http://localhost:8000/programs')
      .then(res => {
        if (!res.ok) {
          throw new Error('Failed to fetch programs');
        }
        return res.json();
      })
      .then(data => {
        setPrograms(data); 
      })
      .catch(error => {
        console.error('Error fetching programs:', error);
        setPrograms([]); 
      });
  }, []);

  
  if (programs === null) {
    return <p>Loading programs...</p>;
  }

 
  return (
    <ul className="programs">
      {programs.map(program => (
        <Program key={program.id} title={program.title}>
          <p>{program.description}</p>
        </Program>
      ))}
    </ul>
  );
};
