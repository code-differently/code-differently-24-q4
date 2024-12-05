import './OtherPage.scss';
import {useState} from 'react';
import {Link} from 'react-router-dom';
import {v4 as uuid} from 'uuid';

interface ObjectUser {
  [key: string]: any;
}

export const OtherPage = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const uuidString: string = uuid();
  let myObject: ObjectUser = {};
  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (title && description) {
      myObject['id'] = uuidString;
      myObject['title'] = title;
      myObject['description'] = description;
      fetch('http://localhost:4000/programs', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(myObject),
      });
      setTitle('');
      setDescription('');
      myObject = {};
    }
  };

  return (
    <>
      <h1 style={{textAlign: 'center'}}>Program Creation Page</h1>
      <form onSubmit={handleSubmit}>
        <input
          value={title}
          className="inputField"
          onChange={e => setTitle(e.target.value)}
        />
        <input
          value={description}
          className="inputField"
          onChange={e => setDescription(e.target.value)}
        />
        <button>Submit Program</button>
        <Link to="/">
          <button>Back to home page?</button>
        </Link>
      </form>
    </>
  );
};
