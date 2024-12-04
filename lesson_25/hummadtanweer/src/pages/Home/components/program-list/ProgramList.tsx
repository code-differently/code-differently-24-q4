import './ProgramList.scss';
import React from 'react';



import { Program } from '../program';


export const ProgramList: React.FC = () => {
    const [programs] = React.useState([
      {
        title: '1000 Kids Coding',
        description:
          'The Code Differently 1000 Kids Coding program was created to expose New Castle County students to computing and programming. The 1000 Kids Coding courses are designed for all experience levels, no experience required.',
      },
      {
        title: 'Return Ready',
        description:
          'The Code Differently Workforce Training Initiatives were created to help individuals underrepresented in tech reinvent their skills to align with the changing workforce market. If you are ready to start your tech journey, join our talent community today.',
      },
    ]);
  
  
    return   (
  <section className="programs-section">
    <h2>
      Our <em className="highlight">Programs</em>
    </h2>
    <ul className="programs">
        {programs.map((program, index) => (
            <Program
                 key={index} 
                 title={program.title} 
                 description= {program.description} 
            />
        ))}
      
    </ul>
  </section>);
  
};