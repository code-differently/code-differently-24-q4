import React from 'react';

import Program from './Program'; // Import the Program component

interface Program {
  title: string;
  description: string;
}

interface ProgramListProps {
  programs: Program[];
}

const ProgramList: React.FC<ProgramListProps> = ({ programs }) => {
  return (
    <section className="programs-section">
      <h2>
        Our <em className="highlight">Programs</em>
      </h2>
      <ul className="programs">
        {programs.map((program, index) => (
          <Program key={index} title={program.title} description={program.description} />
        ))}
      </ul>
    </section>
  );
};

export default ProgramList;
