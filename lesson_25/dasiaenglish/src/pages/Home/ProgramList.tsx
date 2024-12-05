import Program from './Program';
import React from 'react';

const ProgramList: React.FC = () => {
  return (
    <>
      <ul className="programs">
        {' '}
        <Program />
      </ul>
    </>
  );
};
export default ProgramList;
