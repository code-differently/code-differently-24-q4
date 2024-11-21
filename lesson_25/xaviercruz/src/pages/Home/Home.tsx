import './Home.scss';
import React, {useEffect, useState} from 'react';
import {useLocation, useNavigate} from 'react-router-dom';

import {Program} from '../../components/program/Program';

interface ProgramType {
  name: string;
  description: string;
}

export const Home: React.FC = () => {
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
    <article>
      <section className="hero-section">
        <div className="hero-overlay"></div>
        <div className="hero-content">
          <h2 className="hero-title">
            Together we can move the needle of{' '}
            <em className="highlight">diversity in tech.</em>
          </h2>
          <div className="hero-text">
            <span>Code Differently</span> provides hands on training and
            education through coding classes that gives participants the
            technical and cognitive skills they need to excel in
            technology-driven workplaces.
          </div>
        </div>
      </section>
      <section className="programs-section">
        <h2>
          Our <em className="highlight">Programs</em>
        </h2>
        <ul className="programs">
          {programs.length > 0 ? (
            programs.map((program, index) => (
              <li className="program" key={`${program.name}-${index}`}>
                <Program
                  name={program.name}
                  description={program.description}
                />
              </li>
            ))
          ) : (
            <p>No Programs Yet!</p>
          )}
        </ul>
      </section>
    </article>
  );
};
