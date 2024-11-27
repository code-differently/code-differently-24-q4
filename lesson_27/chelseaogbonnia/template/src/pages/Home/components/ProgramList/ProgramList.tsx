import './ProgramList.scss';
import {useQuery} from '@tanstack/react-query';
import React from 'react';

const fetchPrograms = async () => {
  const res = await fetch('http://localhost:4000/programs');
  if (!res.ok) {
    throw new Error('Failed to fetch programs');
  }
  return res.json();
};

export const ProgramList: React.FC = () => {
  const {data, error, isLoading} = useQuery<Program[], Error>(
    ['programs'],
    fetchPrograms
  );

  if (isLoading) {
    return <p>Loading...</p>;
  }

  if (error instanceof Error) {
    return <p>Error: {error.message}</p>;
  }

  return (
    <ul className="programs">
      {data?.map(program => (
        <li key={program.id}>
          <h3>{program.title}</h3>
          <p>{program.description}</p>
        </li>
      ))}
    </ul>
  );
};
