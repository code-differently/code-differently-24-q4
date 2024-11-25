import './ProgramList.scss';
import axios from 'axios';
import React, {useEffect, useState} from 'react';

import {Program} from '../Program/Program';

interface OtherProps {
  id: string;
  title: string;
  description: string;
}
export const ProgramList: React.FC = () => {
  const [dataList, setDataList] = useState<OtherProps[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:4000/programs');
        const jsonData: OtherProps[] = response.data;

        setDataList(jsonData);
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchData();
  }, []);
  return (
    <>
      <ul className="programs">
        {dataList.map(({id, title, description}) => (
          <Program key={id} title={title} description={description} />
        ))}
      </ul>
    </>
  );
};
