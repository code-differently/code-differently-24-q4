import './App.scss';

import { Link, Outlet } from 'react-router-dom';



function App() {
  return (
    <>
      <nav className="navbar">
        <Link to="/">Home</Link>
        <Link to="/add-program">Add Program</Link>
      </nav>

    
      <div className="main">
        <div className="content">
          <Outlet />
        </div>
      </div>

      
      <footer className="footer">
        <p>© 2024 Your App Name</p>
      </footer>
    </>
  );
}

export default App;







     