import { ClerkProvider } from '@clerk/clerk-react';
import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import { BrowserRouter } from 'react-router';
import App from './App.tsx';
import './index.css';

let publishableKey = '';
try {
  const res = await fetch('/api/config');
  const config = await res.json();
  publishableKey = config.CLERK_PERISHABLE_KEY;
} catch (error: unknown) {
  console.error('Failed to fetch Clerk config:', error);
}

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <ClerkProvider publishableKey={publishableKey}>
      <BrowserRouter>
        <App />
      </BrowserRouter>
    </ClerkProvider>
  </StrictMode>
);
