import App from './App.tsx';
import { Home } from './pages/Home/Home.tsx';
import { OtherPage, ProgramProvider } from './pages/Home/Home.tsx';
import ErrorPage from './routes/errorPage.tsx';
import { QueryClient, QueryClientProvider } from '@tanstack/react-query';
import React from 'react';
import ReactDOM from 'react-dom/client';
import { RouterProvider, createBrowserRouter } from 'react-router-dom';



import './index.scss';


const queryClient = new QueryClient();

const router = createBrowserRouter([
  {
    path: '/',
    element: <App />,
    errorElement: <ErrorPage />,
    children: [
      {
        path: '/',
        element: <Home />,
        errorElement: <ErrorPage />,
      },
    ],
  },
  {
    path: '/otherPage',
    element: <OtherPage />,
    errorElement: <ErrorPage />,

  },
]);

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <QueryClientProvider client={queryClient}>
      <ProgramProvider>
        <RouterProvider router={router} />
      </ProgramProvider>
    </QueryClientProvider>
  </React.StrictMode>
);