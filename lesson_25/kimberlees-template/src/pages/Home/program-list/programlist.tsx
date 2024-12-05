import React from 'react';
import '../program-list/programlist.scss';
import Program from '../program/program';

interface ProgramListProps {
  programs: {id: number; title: string; description: string}[];
}

const ProgramList: React.FC<ProgramListProps> = ({programs}) => {
  return (
    <section className="programs-section">
      <h2>
        Our <em className="highlight">Programs</em>
      </h2>
      <ul className="programs">
        {programs.map(program => (
          <Program
            key={program.id}
            title={program.title}
            description={program.description}
          />
        ))}
      </ul>
    </section>
  );
};

export default ProgramList;
