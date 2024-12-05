import React from 'react';

import Program from '../Program/Program';

interface Program {
  title: string;
  description: string;
}

interface ProgramListProps {
  programs: Program[];
}

const ProgramList: React.FC<ProgramListProps> = ({programs}) => {
  return (
    <ul className="programs">
      {programs.map((program, index) => (
        <Program
          key={index}
          title={program.title}
          description={program.description}
        />
      ))}
    </ul>
  );
};

export default ProgramList;
