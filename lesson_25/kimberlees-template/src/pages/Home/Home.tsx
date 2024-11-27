import './Home.scss';
import './program-list/programlist.scss';
import ProgramList from './program-list/programlist.tsx';
import React from 'react';
import {useNavigate} from 'react-router-dom';

const programsData = [
  {
    id: 1,
    title: 'Swine Short Loin',
    description:
      'Swine short loin burgdoggen ball tip, shank ham hock bacon. Picanha strip steak pork, swine boudin ham meatball meatloaf leberkas sausage. Turkey beef andouille kielbasa rump pastrami biltong chislic alcatra buffalo prosciutto jowl. Pastrami chicken sirloin swine capicola landjaeger jowl boudin pork chop shankle bresaola turducken leberkas ham.',
  },
  {
    id: 2,
    title: 'Bacon Ipsum',
    description:
      'Bacon ipsum dolor amet leberkas chuck biltong pork loin sirloin bresaola rump frankfurter. Shoulder doner strip steak chuck. Short ribs venison salami chuck sirloin jowl chislic cupim swine cow. Corned beef chuck frankfurter tenderloin venison biltong andouille leberkas kielbasa sausage t-bone turducken fatback. Pork picanha buffalo bacon tail salami meatball, jowl chislic.',
  },
  {
    id: 3,
    title: 'Picanha Swine Jowl',
    description:
      'Picanha swine jowl meatball boudin pastrami bresaola fatback shankle pork belly cow. Frankfurter ground round shank corned beef chuck. Jerky frankfurter fatback capicola hamburger, pork prosciutto bresaola ham porchetta rump t-bone pancetta tenderloin. Fatback ham hock prosciutto, tenderloin shoulder salami tri-tip leberkas bacon turducken chislic venison sausage frankfurter.',
  },
  {
    id: 4,
    title: 'Kevin Chicken T-Bone',
    description:
      'Kevin chicken t-bone spare ribs shankle bacon drumstick kielbasa cow jowl doner salami chuck andouille. Rump spare ribs bresaola frankfurter shankle. Bresaola ribeye turducken, cow leberkas boudin biltong sirloin filet mignon ham pork belly shank. Tenderloin sirloin pancetta pork loin shankle venison turducken boudin. Brisket tenderloin salami ham bresaola burgdoggen.',
  },
];

export const Home: React.FC = () => {
  const navigate = useNavigate(); 

  const handleAddProgramClick = () => {
    navigate('/create-program'); 
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
        <ProgramList programs={programsData} />
        <button
          type="button"
          className="add-button"
          onClick={handleAddProgramClick} 
        >
          Add Program
        </button>
      </section>
    </article>
  );
};

export default Home;
