import { Outlet, Route } from 'react-router-dom';
import './App.scss';

import { Footer } from './components/footer';
import { Header } from './components/header';
import { CreateProgram } from './pages/create-program/CreateProgram';

function App() {
  return (
    <>
      <Header />
        <Route path='/new' element={<CreateProgram/>} />
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
