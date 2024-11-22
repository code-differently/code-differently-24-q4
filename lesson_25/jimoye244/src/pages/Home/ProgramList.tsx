//import React from 'react';
import HeroSection from './HeroSection';
import './Home.scss';
import Program from './Program';

function ProgramList() {
  return (
    <>
      <HeroSection />
      <section className="programs-section">
        <h2>
            Our <em className="highlight">Programs</em>
        </h2>
        <ul className="programs">
          <Program title="Swine Short Loin"
                    description="Swine short loin burgdoggen ball tip, shank ham hock bacon.
            Picanha strip steak pork, swine boudin ham meatball meatloaf
            leberkas sausage. Turkey beef andouille kielbasa rump pastrami
            biltong chislic alcatra buffalo prosciutto jowl. Pastrami chicken
            sirloin swine capicola landjaeger jowl boudin pork chop shankle
            bresaola turducken leberkas ham."
          />
          <Program title="Bacon Ipsum"
                    description="Bacon ipsum dolor amet leberkas chuck biltong pork loin sirloin
            bresaola rump frankfurter. Shoulder doner strip steak chuck. Short
            ribs venison salami chuck sirloin jowl chislic cupim swine cow.
            Corned beef chuck frankfurter tenderloin venison biltong andouille
            leberkas kielbasa sausage t-bone turducken fatback. Pork picanha
            buffalo bacon tail salami meatball, jowl chislic."
          />
          <Program title="Picanha Swine Jowl"
                    description="Picanha swine jowl meatball boudin pastrami bresaola fatback
            shankle pork belly cow. Frankfurter ground round shank corned beef
            chuck. Jerky frankfurter fatback capicola hamburger, pork
            prosciutto bresaola ham porchetta rump t-bone pancetta tenderloin.
            Fatback ham hock prosciutto, tenderloin shoulder salami tri-tip
            leberkas bacon turducken chislic venison sausage frankfurter."
          />
          <Program title="Kevin Chicken T-Bone"
                    description="Kevin chicken t-bone spare ribs shankle bacon drumstick kielbasa
            cow jowl doner salami chuck andouille. Rump spare ribs bresaola
            frankfurter shankle. Bresaola ribeye turducken, cow leberkas
            boudin biltong sirloin filet mignon ham pork belly shank.
            Tenderloin sirloin pancetta pork loin shankle venison turducken
            boudin. Brisket tenderloin salami ham bresaola burgdoggen."
          />
          
        </ul>
      </section>
    </>
  )
};
export default ProgramList;
