import './ProgramList.scss';
import React, { useEffect, useState } from 'react';



import { Program } from '../Program';


export const ProgramList: React.FC = () => {
  const [programs, setPrograms] = useState<{ id: number; title: string; description: string }[] | null>(null);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchPrograms = async () => {
      try {
        const response = await fetch(
          '/src/programs.json'
        ); 
        if (!response.ok) {
          throw new Error(`HTTP Error: ${response.status}`);
        }
        const data = await response.json();
        setPrograms(data);
      } catch (err: any) {
        console.error('Fetch error:', err);
        setError(err.message);
      }
    };

    fetchPrograms();
  }, []);

  if (error) {
    return <p>Error loading programs: {error}</p>;
  }

  if (programs === null) {
    return <p>Loading programs...</p>;
  }

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