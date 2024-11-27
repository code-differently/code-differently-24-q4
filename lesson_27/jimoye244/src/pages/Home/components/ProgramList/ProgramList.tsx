import './ProgramList.scss';
import {Program} from '../Program';
import React, { useEffect } from 'react';

export const ProgramList: React.FC = () => {
    const [programs, setPrograms]=React.useState([]);
    useEffect(() => {
      const fetchPrograms = async () =>{
        const response = await fetch('http://localhost:4000/programs');
        const data = await response.json();
        console.log(data);
        setPrograms(data);
      };
      fetchPrograms();
    },[]);

    return (
      <ul className="programs">
        {programs.map((program: any)=>(
        <Program key={program.id} title={program.title}> 
                <p>{program.description}</p>
        </Program>
        ))}
      </ul>
     );
};