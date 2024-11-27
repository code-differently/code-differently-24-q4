import {Route, BrowserRouter as Router, Routes} from 'react-router-dom';

import {Footer} from './components/footer/Footer';
import Header from './components/header/Header';
import {AddProgramPage} from './pages/Home/components/AddProgramPage';
import {ProgramList} from './pages/Home/components/ProgramList/ProgramList';

function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<ProgramList />} />
        <Route path="/add" element={<AddProgramPage />} />
      </Routes>
      <Footer />
    </Router>
  );
}

export default App;
