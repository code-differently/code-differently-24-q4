import {Route, Routes} from 'react-router-dom';

import {Footer} from './components/footer/Footer';
import Header from './components/header/Header';
import {AddProgramPage} from './pages/Home/components/AddProgramPage';
import {ProgramList} from './pages/Home/components/ProgramList/ProgramList';

function App() {
  return (
    <>
      <Header />
      <Routes>
        <Route path="/" element={<ProgramList />} />
        <Route path="/add" element={<AddProgramPage />} />
      </Routes>
      <Footer />
    </>
  );
}

export default App;
