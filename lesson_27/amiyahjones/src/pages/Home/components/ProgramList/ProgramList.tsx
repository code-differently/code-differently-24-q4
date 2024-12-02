import './ProgramList.scss';
import React, {useEffect, useState} from 'react';

import {Program} from '../Program';

export const ProgramList: React.FC = () => {
  const [programs, setPrograms] = useState<{id: number; title: string; description: string}[] | null>(null);

  useEffect(() => {
    fetch('http://localhost:4000/programs')
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

  return (
    <ul className="programs">
      {programs === null && <p>Loading programs...</p>}
      {programs && programs.map(program => (
        <Program key={program.id} title={program.title}>
          <p>{program.description}</p>
        </Program>
      ))}
    </ul>
  );
};
