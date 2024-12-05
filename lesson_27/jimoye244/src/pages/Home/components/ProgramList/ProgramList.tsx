import './ProgramList.scss';
import {Program} from '../Program';
import React, { useEffect, useState } from 'react';
import {API_BASE_URL} from '../../../../components/constants';

export const ProgramList: React.FC = () => {
    const [programs, setPrograms] = useState<any[]>([]);
    useEffect(() => {
      const fetchPrograms = async () =>{
        const response = await fetch(API_BASE_URL);
        const data = await response.json();
        console.log(data);
        setPrograms(data);
      };
      fetchPrograms();
    },[]);

    return (
      <ul className="programs">
        {programs.length > 0 ? 
        (
          programs.map((program: any)=>(
          <Program key={program.id} title={program.title}> 
                  <p>{program.description}</p>
          </Program>
          ))
        )
        : 
        (
         <li>No Programs Available</li>
        )}; 
      </ul>
     );
};