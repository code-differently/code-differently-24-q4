import './ProgramList.scss';

import { Program, ProgramProps } from '../Program/Program.tsx';
import React, { useEffect, useState } from 'react';


export const ProgramList: React.FC = () => {
    const [programs, setPrograms] = useState<ProgramProps[]>([]);
    
    useEffect(() => {
      const fetchPrograms = async () => { 
        try {
          const response = await fetch('http://localhost:5173/programs');
          if (!response.ok) {
            throw new Error('HTTP error! Status: ${response.status}');
          }
          const data = await response.json();
          console.log('Fetched programs:', data);
          setPrograms(data.map((program: any) => ({
            id: program.id,
            title: program.name,
          })));
        } catch (error) {
          console.error('Error fetching programs:', error);
        } 
      };

      fetchPrograms();
    }, []);

    return (
      <ul className="programs">
        {programs.map((program) => (
          <Program key={program.id} title={program.title} id={undefined}>
          </Program>
        ))}
      </ul>
    );
};
   export default ProgramList;
   
   
    