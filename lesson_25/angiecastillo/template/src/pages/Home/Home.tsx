import './Home.scss';
import React from 'react';
import {Link} from 'react-router-dom';

export const Home: React.FC = () => {
  const Program: React.FC<{title: string; description: string}> = ({
    title,
    description,
  }) => (
    <li className="program">
      <h3>{title}</h3>
      <p>{description}</p>
    </li>
  );

  const ProgramList: React.FC = () => {
    const programs = [
      {
        title: 'Swine Short Loin',
        description: `Swine short loin burgdoggen ball tip, shank ham hock bacon.Picanha strip steak pork, swine boudin ham meatball meatloaf
              leberkas sausage. Turkey beef andouille kielbasa rump pastrami
              biltong chislic alcatra buffalo prosciutto jowl. Pastrami chicken
              sirloin swine capicola landjaeger jowl boudin pork chop shankle
              bresaola turducken leberkas ham.`,
      },
      {
        title: 'Bacon Ipsum',
        description: `Bacon ipsum dolor amet leberkas chuck biltong pork loin sirloin
          bresaola rump frankfurter. Shoulder doner strip steak chuck. Short
              ribs venison salami chuck sirloin jowl chislic cupim swine cow.
              Corned beef chuck frankfurter tenderloin venison biltong andouille
              leberkas kielbasa sausage t-bone turducken fatback. Pork picanha
              buffalo bacon tail salami meatball, jowl chislic.`,
      },
      {
        title: 'Picanha Swine Jowl',
        description: `Picanha swine jowl meatball boudin pastrami bresaola fatback
              shankle pork belly cow. Frankfurter ground round shank corned beef
              chuck. Jerky frankfurter fatback capicola hamburger, pork
              prosciutto bresaola ham porchetta rump t-bone pancetta tenderloin.
              Fatback ham hock prosciutto, tenderloin shoulder salami tri-tip
              leberkas bacon turducken chislic venison sausage frankfurter.`,
      },
      {
        title: 'Kevin Chicken T-Bone',
        description: `Kevin chicken t-bone spare ribs shankle bacon drumstick kielbasa
              cow jowl doner salami chuck andouille. Rump spare ribs bresaola
              frankfurter shankle. Bresaola ribeye turducken, cow leberkas
              boudin biltong sirloin filet mignon ham pork belly shank.
              Tenderloin sirloin pancetta pork loin shankle venison turducken
              boudin. Brisket tenderloin salami ham bresaola burgdoggen.`,
      },
    ];

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
        <ProgramList />
        <Link to="/Page">
          <button>Button</button>
        </Link>
      </section>
    </article>
  );
};
export const Page: React.FC = () => {
  return (
    <>
      <html lang="en">
        <head>
          <meta charSet="UTF-8" />
          <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0"
          />
          <title>Document</title>
        </head>
        <body>
          <h3>Submission Page</h3>
          <input type="text" />
          <input type="text" />
          <button>Click me Button</button>
          <Link to="/">
            <button>Button</button>
          </Link>
        </body>
      </html>
    </>
  );
};
