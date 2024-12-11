import './ProgramList.scss';
import React, { useEffect, useState } from 'react';

import { Program } from '../Program';


interface ProgramData {
  title: string;
  description: string;
}

export const ProgramList: React.FC = () => {
  const [programs, setPrograms] = useState<ProgramData[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  // Fetch the program data from the API when the component mounts
  useEffect(() => {
    const fetchPrograms = async () => {
      try {
        const response = await fetch('http://localhost:4000/programs'); // Replace with your actual API endpoint
        if (!response.ok) {
          throw new Error('Failed to fetch programs');
        }
        const data = await response.json();
        setPrograms(data);
        setLoading(false);
      } catch (err) {
        setError('Failed to load programs');
        setLoading(false);
      }
    };

    fetchPrograms();
  }, []); // Empty array ensures this runs only once when the component mounts

  if (loading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>{error}</div>;
  }

  return (
    <ul className="programs">
      {programs.map((program, index) => (
        <Program key={index} title={program.title}>
          <p>{program.description}</p>
        </Program>
      ))}
    </ul>
  );
};