import './Home.scss';
import React, {useState} from 'react';

export const ProgramSubmission: React.FC = () => {
  const [programName, setProgramName] = useState('');
  const [programDescription, setProgramDescription] = useState('');
  const handleSubmit = (eventObj: React.FormEvent<HTMLFormElement>) => {
    eventObj.preventDefault();
    console.log('New program:', programName, programDescription);
    setProgramName('');
    setProgramDescription('');
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Program Name:
        <input
          type="text"
          value={programName}
          onChange={eventObj => setProgramName(eventObj.target.value)}
        />
      </label>
      <label>
        Program Description:
        <textarea
          value={programDescription}
          onChange={eventObj => setProgramDescription(eventObj.target.value)}
        />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
};
export default ProgramSubmission;
