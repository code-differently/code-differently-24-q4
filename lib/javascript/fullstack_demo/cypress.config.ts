import { defineConfig } from 'cypress';
import { configureVisualRegression } from 'cypress-visual-regression';

export default defineConfig({
  component: {
    devServer: {
      framework: 'next',
      bundler: 'webpack',
    },
    env: {
      visualRegressionType: 'regression',
      NEXT_PUBLIC_API_URL: 'http://localhost',
    },
    screenshotsFolder: './cypress/snapshots/actual',
    setupNodeEvents(on, config) {
      configureVisualRegression(on);
      config.env = {
        ...process.env,
        ...config.env,
      };
      return config;
    },
  },
});
