import './Home.scss';
import React from 'react';

import {Program} from '../../components/program/Program';

export const Home: React.FC = () => {
  return (
    <article>
      <h2>
        Our <em className="highlight">Programs</em>
      </h2>
      <ul className="programs">
        <Program name={'nameHere'} description={'descriptionHere'} />
      </ul>
    </article>
  );
};
