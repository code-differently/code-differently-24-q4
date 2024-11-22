import './Home.scss';
import React, { createContext, useContext, useState } from 'react';
import { Link } from 'react-router-dom';


const ProgramContext = createContext<
  | {
      programs: Program[];
      addProgram: (newProgram: Program) => void;
    }
  | undefined
>(undefined);
interface Program {
  title: string;
  description: string;
}



export const ProgramProvider: React.FC<{ children: React.ReactNode }> = ({ children }) => {
  const [programs, setPrograms] = useState<Program[]>([
  {
    title: 'Swine Short Loin',
    description: `Swine short loin burgdoggen ball tip, shank ham hock bacon. Picanha
          strip steak pork, swine boudin ham meatball meatloaf leberkas sausage.
          Turkey beef andouille kielbasa rump pastrami biltong chislic alcatra
          buffalo prosciutto jowl. Pastrami chicken sirloin swine capicola
          landjaeger jowl boudin pork chop shankle bresaola turducken leberkas
          ham.`,
  },
  {
    title: 'Bacon Ipsum',
    description: `Bacon ipsum dolor amet leberkas chuck biltong pork loin sirloin
          bresaola rump frankfurter. Shoulder doner strip steak chuck. Short
          ribs venison salami chuck sirloin jowl chislic cupim swine cow. Corned
          beef chuck frankfurter tenderloin venison biltong andouille leberkas
          kielbasa sausage t-bone turducken fatback. Pork picanha buffalo bacon
          tail salami meatball, jowl chislic.`,
  },
  {
    title: 'Picanha Swine Jowl',
    description: `Picanha swine jowl meatball boudin pastrami bresaola fatback shankle
          pork belly cow. Frankfurter ground round shank corned beef chuck.
          Jerky frankfurter fatback capicola hamburger, pork prosciutto bresaola
          ham porchetta rump t-bone pancetta tenderloin. Fatback ham hock
          prosciutto, tenderloin shoulder salami tri-tip leberkas bacon
          turducken chislic venison sausage frankfurter.`,
  },
  {
    title: 'Kevin Chicken T-Bone',
    description: `Kevin chicken t-bone spare ribs shankle bacon drumstick kielbasa cow jowl
      doner salami chuck andouille. Rump spare ribs bresaola frankfurter shankle.
      Bresaola ribeye turducken, cow leberkas boudin biltong sirloin filet mignon
      ham pork belly shank. Tenderloin sirloin pancetta pork loin shankle venison 
      turducken boudin. Brisket tenderloin salami ham bresaola burgdoggen.`,
  },
]);
const addProgram = (newProgram: Program) => {
    setPrograms((prevPrograms) => [...prevPrograms, newProgram]);
  };

  return (
    <ProgramContext.Provider value={{ programs, addProgram }}>
      {children}
    </ProgramContext.Provider>
  );
}

export const useProgramContext = () => {
  const context = useContext(ProgramContext);
  if (!context) {
    throw new Error('useProgramContext must be used within a ProgramProvider');
  }
  return context;
};



const Programs: React.FC<Program>= ({title, description}) => {
  return (
    <>
    <li className='program'>
      <h3>{title}</h3>
      <p>{description}</p>
    </li>
    </>
  );
};

const ProgramsList: React.FC = () => {
  const {programs} = useProgramContext();
  return (
    <>
      <h2>
        Our <em className="highlight">Programs</em>
      </h2>
      <ul className="programs">
        {programs.map((each, index) => (
          <Programs key={index} title={each.title} description={each.description}/>
        ))}
      </ul>
    </>
  );
};

export const Home: React.FC = () => {
  return (
    <>
      <article>
        <section className="hero-section">
          <div className="hero-overlay"></div>
          <div className="hero-content">
            <h2 className="hero-title">
              Together we can move the needle of{' '}
              <em className="highlight">diversity in tech.</em>
            </h2>
            <div className="hero-text">
              <span>Code Differently</span> provides hands on training and
              education through coding classes that gives participants the
              technical and cognitive skills they need to excel in
              technology-driven workplaces.
            </div>
          </div>
        </section>
        <section className="programs-section">
           <h2>
          Our <em className="highlight">Programs</em>
        </h2>
          <ProgramsList/>
       <Link style={{alignContent: 'center', alignSelf: 'center'}}to= '/OtherPage'> <button>Add More</button></Link>
          
        </section>
      </article>
    </>
  );
 
};

export const OtherPage = () =>{
  
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const { addProgram } = useProgramContext();

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (title && description) {
      addProgram({ title, description });
      setTitle('');
      setDescription('');
    }
  };

  return(
    <>
        <h1 style={{textAlign: 'center'}}>Program Creation Page</h1>
          <form onSubmit={handleSubmit}>
            <input onChange={e=> setTitle(e.target.value)}/>
            <input onChange={e=> setDescription(e.target.value)}/>
            <button>Submit Program</button>
          </form>
    </>
  )
}