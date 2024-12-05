import Home from './pages/Home/Home';
import React from 'react';
import {Route, Routes} from 'react-router-dom';

const AppRoutes: React.FC = () => {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
    </Routes>
  );
};

export default AppRoutes;
