import './ProgramList.scss';
import React, {useEffect, useState} from 'react';

import {Program} from '../Program';

interface OtherProps {
  id: string;
  title: string;
  description: string;
}

export function ProgramList() {
  const [data, setData] = useState<OtherProps[]>([]);
  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch('http://localhost:4000/programs');
        const data = await response.json();
        setData(data);
        console.log(data);
      } catch (error) {
        console.error('Error fetching data:', error); // Handle any errors
      }
    };

    fetchData(); // Ensure this is called to fetch the data
  }, []);

  return (
    <ul className="programs">
      {data.length > 0 ? (
       data.map(({ id, title, description }) => (
         <Program key={id} title={title} description={description} />
       ))
     ) : (
       <li>No programs available.</li> // Use block comments in JSX
     )}
    </ul>
  );
}
