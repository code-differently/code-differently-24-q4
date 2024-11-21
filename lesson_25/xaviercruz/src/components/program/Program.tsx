import './Program.scss';

interface ProgramProps {
  name: string;
  description: string;
}

export const Program: React.FC<ProgramProps> = props => {
  return (
    <>
      <h3>{props.name}</h3>
      <p>{props.description}</p>
    </>
  );
};
