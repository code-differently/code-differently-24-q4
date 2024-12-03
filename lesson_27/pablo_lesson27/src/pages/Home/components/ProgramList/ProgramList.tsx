import './ProgramList.scss';
import React, {useEffect} from 'react';

import {Program} from '../Program';

export const ProgramList: React.FC = () => {
  const [programs, setPrograms] = React.useState([]);
  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch('http://localhost:4000/programs');
      const data = await response.json();
      setPrograms(data);
    };
    fetchData();
  }, []);
  return (
    <ul className="programs">
      {programs.map((program: any) => (
        <Program key={program.id} title={program.title}>
          <p>{program.description}</p>
        </Program>
      ))}
    </ul>
  );
};
