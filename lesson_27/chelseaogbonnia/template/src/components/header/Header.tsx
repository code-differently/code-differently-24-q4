import {Link} from 'react-router-dom';

const Header = () => {
  return (
    <nav>
      <Link to="/">Home</Link>
      <Link to="/add">Add Program</Link>
    </nav>
  );
};

export default Header;
