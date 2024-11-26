import './ProgramList.scss';
import {Program as ProgramInterface} from '@code-differently/types';
import React, {useEffect, useState} from 'react';

import {Program} from '../Program';

export const ProgramList: React.FC = () => {
  const [data, setData] = useState<ProgramInterface[]>([]);

  useEffect(() => {
    fetch('http://localhost:4000/programs')
      .then(response => response.json())
      .then((data: ProgramInterface[]) => setData(data))
      .catch(error => console.error(error));
  }, []);

  return (
    <ul className="programs">
      {data.map(program => (
        <Program key={program.id} title={program.title}>
          <p>{program.description}</p>
        </Program>
      ))}
    </ul>
  );
};
