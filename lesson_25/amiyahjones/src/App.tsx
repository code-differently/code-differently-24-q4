import './App.scss';
import {Outlet, Route, Routes} from 'react-router-dom';

import {Footer} from './components/footer';
import {Header} from './components/header';
import { CreateProgram } from './pages/Add-program/CreateProgram';

function App() {
  return (
    <>
      <Header />
      <Routes>
        <Route path='' element={<CreateProgram/>} />
      </Routes>
      <div className="main">
        <div className="content">
          <Outlet />
        </div>
      </div>
      <Footer />
    </>
  );
}

export default App;
