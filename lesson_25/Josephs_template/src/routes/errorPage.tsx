import {useRouteError, Link} from 'react-router-dom';

interface RouteError {
  status?: number;
  statusText?: string;
  message?: string;
}

export default function ErrorPage() {
  const error = useRouteError() as RouteError; 
  console.error(error);

  return (
    <div id="error-page">
      <h1>Unexpected Error Occured</h1>
      <Link to='/'><button>Click here to go back</button></Link>
    </div>
  );
}
