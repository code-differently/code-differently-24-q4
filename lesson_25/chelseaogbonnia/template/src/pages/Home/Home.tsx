import './Home.scss';
import React, {useState} from 'react';

import ProgramList from '/workspaces/code-differently-24-q4/lesson_25/chelseaogbonnia/template/src/components/programs/ProgramList/ProgramList.tsx';

const Home: React.FC = () => {
  const [programs, setPrograms] = useState([
    {
      title: 'Swine Short Loin',
      description:
        'Swine short loin burgdoggen ball tip, shank ham hock bacon...',
    },
    {
      title: 'Bacon Ipsum',
      description:
        'Bacon ipsum dolor amet leberkas chuck biltong pork loin sirloin...',
    },
    {
      title: 'Picanha Swine Jowl',
      description:
        'Picanha swine jowl meatball boudin pastrami bresaola fatback...',
    },
    {
      title: 'Kevin Chicken T-Bone',
      description:
        'Kevin chicken t-bone spare ribs shankle bacon drumstick kielbasa...',
    },
    {
      title: 'Lorem Ipsum 1',
      description:
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec eros...',
    },
    {
      title: 'Lorem Ipsum 2',
      description:
        'Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium...',
    },
  ]);

  const addNewProgram = () => {
    const newProgram = {
      title: 'New Program Title',
      description: 'New program description here...',
    };

    setPrograms([...programs, newProgram]);
  };

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
            <span>Code Differently</span> provides hands-on training and
            education through coding classes that give participants the
            technical and cognitive skills they need to excel in
            technology-driven workplaces.
          </div>
        </div>
      </section>

      <section className="programs-section">
        <h2>
          Our <em className="highlight">Programs</em>
        </h2>
        <ProgramList programs={programs} />
        <button onClick={addNewProgram}>Add New Program</button>
      </section>
    </article>
  );
};

export default Home;
