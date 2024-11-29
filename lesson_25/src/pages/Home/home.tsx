import React from 'react';
import { Link } from 'react-router-dom';
import ProgramList from '../../components/program-list/programList';
import './Home.scss';


export const Home: React.FC = () => {
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
        <ProgramList/>
        <Link to="/Recommendations">
          <button>
            Make another program?
          </button>
        </Link>
      </section>
    </article>
  );
};