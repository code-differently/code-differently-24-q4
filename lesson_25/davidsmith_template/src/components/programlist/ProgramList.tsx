import './ProgramsList.scss';
import React from 'react';

import {useProgramContext} from '../../contexts/ProgramContext';
import { Programs } from '../programs/Programs';

export const ProgramsList: React.FC = () => {
  const {programs} = useProgramContext();
  return (
    <>
      <ul className="programs">
        {programs.map((each, index) => (
          <Programs
            key={index}
            title={each.title}
            description={each.description}
          />
        ))}
      </ul>
    </>
  );
};