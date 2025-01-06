import react from '@vitejs/plugin-react';
import { loadEnv } from 'vite';
import tsconfigPaths from 'vite-tsconfig-paths';
import { defineConfig } from 'vitest/config';

export default defineConfig({
  plugins: [tsconfigPaths(), react()],
  test: {
    environment: 'jsdom',
    setupFiles: ['./setupVitest.mjs'],
    env: loadEnv('test', process.cwd(), ''),
    coverage: {
      provider: 'istanbul',
    },
  },
});
