import ProgramSubmission from './ProgramSubmission';
import {Route, BrowserRouter as Router, Routes} from 'react-router-dom';

import Home from '../Home';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route
          path="http://localhost:5173/program-submission"
          element={<ProgramSubmission />}
        />
      </Routes>
    </Router>
  );
}
export default App;
