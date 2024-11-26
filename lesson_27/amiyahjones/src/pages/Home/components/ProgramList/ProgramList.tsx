import './ProgramList.scss';
import React, { useEffect, useState } from 'react';



import { Program } from '../Program';


export const ProgramList: React.FC = () => {
  const [programs, setPrograms] = useState<{ id: number; title: string; description: string }[] | null>(null);

  useEffect(() => {
    fetch(
          'http://localhost:8000/programs'
        )
        .then(res => {
          return res.json()
        })
    }, []);

  return (
    <ul className="programs">
      {programs.map((program) => (
        <Program key={program.id} title={program.title}>
          <p>{program.description}</p>
        </Program>
      ))}
    </ul>
  );
};