import Program from './Program';
import React from 'react';

interface Program {
  id: number;
  title: string;
  description: string;
}

interface ProgramListProps {
  programs: Program[];
}

const ProgramList: React.FC<ProgramListProps> = ({programs}) => {
  return (
    <ul className="programs">
      {programs.map(program => (
        <Program
          key={program.id}
          title={program.title}
          description={program.description}
        />
      ))}
    </ul>
  );
};

export default ProgramList;
