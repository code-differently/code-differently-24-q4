import './App.scss';
import {Outlet} from 'react-router-dom';


import {Footer} from './components/footer';
import {Header} from './components/header';

const App: React.FC = () => {
  return (
    <>
      <Header />
      <div className="main">
        <div className="content">
          <Outlet />
        </div>
      </div>
      <Footer />
    </>
  );
};

export default App;
