import './Home.scss';
import ProgramList from './ProgramList';
import React from 'react';
import {Link} from 'react-router-dom';

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
            <span>Code appleDifferently</span> provides hands on training and
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
        <ProgramList />
        <button>
          <Link to="http://localhost:5173/program-submission">
            Add New Program
          </Link>
        </button>
      </section>
    </article>
  );
};
export default Home;
