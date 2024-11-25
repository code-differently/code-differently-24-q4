import {useEffect, useState} from 'react';
import {useLocation, useNavigate} from 'react-router-dom';

import {Program} from '../program/Program';

interface ProgramType {
  name: string;
  description: string;
}

export const ProgramList = () => {
  const location = useLocation();
  const navigate = useNavigate();
  const [programs, setPrograms] = useState<ProgramType[]>(() => {
    // Initialize from localStorage if available
    const saved = localStorage.getItem('programs');
    return saved ? JSON.parse(saved) : [];
  });

  useEffect(() => {
    const newProgram = location.state?.newProgram as ProgramType;

    if (newProgram?.name) {
      // Only update if the program isn't already in the list
      setPrograms(prevPrograms => {
        const isDuplicate = prevPrograms.some(
          prog => prog.name === newProgram.name
        );

        if (!isDuplicate) {
          const updatedPrograms = [...prevPrograms, newProgram];
          localStorage.setItem('programs', JSON.stringify(updatedPrograms));
          return updatedPrograms;
        }
        return prevPrograms;
      });

      // Clear the location state
      navigate('/', {replace: true, state: null});
    }
  }, [location.state, navigate]);

  return (
    <ul className="programs">
      {programs.length > 0 ? (
        programs.map((program, index) => (
          <li className="program" key={`${program.name}-${index}`}>
            <Program name={program.name} description={program.description} />
          </li>
        ))
      ) : (
        <p>No Programs Yet!</p>
      )}
    </ul>
  );
};
